import java.awt.*;
import java.util.Random;

public class FinalExam {
    public static Picture Filter(Picture source, int fuzz){
        //Create target picture matching the source image size
        Picture target = new Picture(source.width(), source.height());

        //Make random number generator
        Random rand = new Random();

        //Loop over each pixel of picture
        for (int i = 1; i < target.height(); i++){
            for (int j = 1; j < target.width(); j++){

                //Get random X and Y values of pixels within fuzz boundaries
                int randX = j + (rand.nextInt(-1, 1) * fuzz);
                int randY = i + (rand.nextInt(-1, 1) * fuzz);

                //Check to make sure the X and Y values are within the picture border
                while (randX < 1 || randX >= target.width()){
                    randX = j + (rand.nextInt(-1, 1) * fuzz);
                }
                while (randY < 1 || randX >= target.height()){
                    randY = i + (rand.nextInt(-1, 1) * fuzz);
                }

                //Get the color of the random pixel and set the current target pixel to that color
                Color randColor = source.get(randX, randY);
                target.set(j, i, randColor);
            }
        }
        return target; //Return the filtered image
    }

    public static void main(String[] args){
        //Get picture from command line
        Picture source = new Picture(args[0]);

        //Get the fuzz variable form the command line
        //Fuzz changes how distorted the image will appear
        int fuzz = Integer.parseInt(args[1]);
        Filter(source, fuzz).show();

    }
}
