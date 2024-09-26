import java.awt.Color;
public class ScaleTest {
    public static Picture scalePic(Picture source, double s){
        //Multiply source width and height by scale factor for new picture size
        int newWidth = (int) (source.width() * s);
        int newHeight = (int) (source.height() * s);

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

    public static void main(String[] args) {
        //Get the source filename and the scale factor
        String filename = args[0];
        double s = Double.parseDouble(args[1]);

        //Create source and target picture objects
        Picture source = new Picture(filename);
        Picture target = scalePic(source, s);

        //Show both pictures
        source.show();
        target.show();
    }
}
