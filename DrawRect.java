import java.awt.Color;
public class DrawRect {
    public static Picture scalePic(Picture source, double s, double centerX, double centerY){
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

        //Draw Dot
        int dotX = (int) (newWidth * centerX);
        int dotY = (int) (newHeight * centerY);
        target.set(dotX, dotY, Color.BLACK);

        //Return new picture
        return target;
    }

    public static Picture drawRectangle(Picture target, int rectCornerX, int rectCornerY, int height, int width){
        Picture targetRect = new Picture(target.width(), target.height());

        //Copy picture
        for (int i = 0; i < target.width(); i++){
            for (int j = 0; j < target.height(); j++){
                targetRect. set(i, j, target.get(i, j));
            }
        }

        //Draw rectangle
        for (int row = rectCornerY; row < rectCornerY + height; row++) {
            targetRect.set(rectCornerX, row, Color.BLACK);
            targetRect.set(rectCornerX + width, row, Color.BLACK);
        }
        for (int col = rectCornerX; col < rectCornerX + width; col++) {
            targetRect.set(col, rectCornerY, Color.BLACK);
            targetRect.set(col, rectCornerY + height, Color.BLACK);
        }
        return targetRect;
    }


    public static void main(String[] args) {

        //Get the source filename and the scale factor (s)
        String filename = args[0];
        double s = Double.parseDouble(args[1]);

        //Find coordinates for center of rectangle
        double centerX = Double.parseDouble(args[2]);
        double centerY = Double.parseDouble(args[3]);

        //Create source and target picture objects
        Picture source = new Picture(filename);
        Picture target = scalePic(source, s, centerX, centerY);

        //Get height and width of source, and corner of rectangle
        int height = source.height();
        int width = source.width();
        int rectCornerX = (int) ((centerX * target.width()) - (width/2));
        int rectCornerY = (int) ((centerY * target.height()) - (height/2));

        //Draw rectangle on picture
        Picture targetRect = drawRectangle(target, rectCornerX, rectCornerY, height, width);

        //Show both pictures
        source.show();
        target.show();
        targetRect.show();

    }
}
