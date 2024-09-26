public class PongTemplate {
    public static void main(String[] args) {
        int WINNER = -1;                            // Determines whether someone has won yet (if == -1, game keeps going)
        int UPPER_PDL_xLIM = 16;                    // Defines the right border of the paddle for ball to bounce off of
        int UPPER_PDL_yLIM = 300;                     // Defines the top border of the paddle for ball to bounce off of
        int LOWER_PDL_xLIM = 0;                     // Defines the left border of the paddle for ball to bounce off of
        int LOWER_PDL_yLIM = -300;                     // Defines the bottom border of the paddle for ball to bounce off of
        int PDL_VEL = 10;                       // Determines how fast the paddle moves (how far up or down the screen paddle moves when key is pressed
        double BALL_xVEL = 1.2 * (Math.random() < 0.5 ? -1 : 1);    // Randomly generate which direction the ball goes at the start of the game, right or left
        double BALL_yVEL = 0.8 * (Math.random() < 0.5 ? -1 : 1);    // Randomly generate which direction the ball goes at the start of the game, up or down
    }
}