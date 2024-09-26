import java.awt.Color;

public class Test {
    public static void main(String[] args) {
        // Load an image
        Picture picture = new Picture("sorceress.jpg");

        // Set the canvas size to match the image
        StdDraw.setCanvasSize(picture.width(), picture.height());

        // Draw the picture
        picture.show();

        // Draw a red circle on top of the picture
        StdDraw.setPenColor(Color.RED);
        StdDraw.filledCircle(.5, .5, 50); // Example coordinates, adjust as needed
    }
}
