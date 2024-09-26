import java.awt.Color;

public class Solidcolor {

    public static Picture FillColor (int red, int green, int blue){
        //Make picture and color objects
        Picture SolidColor = new Picture(256, 256);
        Color fillColor = new Color(red, green, blue);

        //Sets each pixel to fillcolor (red, green, and blue values from cmd line)
        for (int i = 0; i < 256; i++){
            for (int j = 0; j < 256; j++){
                SolidColor.set(i, j, fillColor);
            }
        }
        return SolidColor;
    }

    public static void main(String[] args){
        int red = Integer.parseInt(args[0]);
        int green = Integer.parseInt(args[1]);
        int blue = Integer.parseInt(args[2]);

        //Displays error message if RGB values are invalid
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255){
            throw new IllegalArgumentException("Red, green, and blue values must be between 0 and 255");
        }
        FillColor(red, green, blue).show();
    }
}
