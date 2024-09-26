import java.awt.Color;

public class Zoom {
    public static Picture scale(Picture source, double scaleFactor){
        //Multiply source width and height by scale factor for new picture size
        int newWidth = (int) (source.width() * scaleFactor);
        int newHeight = (int) (source.height() * scaleFactor);

        //Create new picture and fill in surrounding pixels with same color
        Picture target = new Picture(newWidth, newHeight);
        for (int targetCol = 0; targetCol < newWidth; targetCol++){
            for (int targetRow = 0; targetRow < newHeight; targetRow++){
                int sourceCol = targetCol * source.width() / newWidth;
                int sourceRow = targetRow * source.height() / newHeight;
                Color color = source.get(sourceCol, sourceRow);
                target.set(targetCol, targetRow, color);
            }
        }
        //Return the new picture
        return target;
    }

    public static Picture extractImage(Picture scaled, double relX, double relY, int width, int height){
        Picture target = new Picture(width, height);

        int startingX = (int) relX*scaled.width();
        int startingY = (int) relY*scaled.height();

        for (int i = 0; i < height && startingY < scaled.height(); i++){
            for (int j = 0; j < width && startingX < scaled.width(); j++){
                target.set(j, i, scaled.get(startingX, startingY));
                startingX++;
            }
            startingY++;
            startingX = (int) (relY * scaled.height());
        }

        return target;
    }

    public static void main(String[] args){
        String filename = args[0];
        double scaleFactor = Double.parseDouble(args[1]);
        double relX = Double.parseDouble(args[2]);
        double relY = 1 - Double.parseDouble(args[3]);

        Picture source = new Picture(filename);
        int width = source.width();
        int height = source.height();

        Picture scaled = scale(source, scaleFactor);

        Picture target = extractImage(scaled, relX, relY, width, height);

        source.show();
        target.show();
    }
}
