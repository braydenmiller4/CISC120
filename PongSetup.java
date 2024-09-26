public class PongSetup {
    public static void main(String[] args) {
        int WINNER = -1;                            // Determines whether someone has won yet (if == -1, game keeps going)
        int UPPER_PDL_xLIM = 16;                    // Defines the right border of the paddle for ball to bounce off of
        int UPPER_PDL_yLIM = 300;                     // Defines the top border of the paddle for ball to bounce off of
        int LOWER_PDL_xLIM = 0;                     // Defines the left border of the paddle for ball to bounce off of
        int LOWER_PDL_yLIM = -300;                     // Defines the bottom border of the paddle for ball to bounce off of
        int PDL_VEL = 10;                       // Determines how fast the paddle moves (how far up or down the screen paddle moves when key is pressed
        double BALL_xVEL = 1.2 * (Math.random() < 0.5 ? -1 : 1);    // Randomly generate which direction the ball goes at the start of the game, right or left
        double BALL_yVEL = 0.8 * (Math.random() < 0.5 ? -1 : 1);    // Randomly generate which direction the ball goes at the start of the game, up or down

        //Create Canvas
        int CANVAS_WIDTH = 800;
        int CANVAS_HEIGHT = 600;
        StdDraw.setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.setXscale(-400, 400);
        StdDraw.setYscale(-300, 300);
        StdDraw.enableDoubleBuffering();

        //Create Paddles
        int p1_pdl_x = -390;
        int p1_pdl_y = 0;
        int p2_pdl_x = 390;
        int p2_pdl_y = 0;
        int pdl_w = 6;
        int pdl_h = 60;
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(p1_pdl_x, p1_pdl_y, pdl_w, pdl_h);
        StdDraw.filledRectangle(p2_pdl_x, p2_pdl_y, pdl_w, pdl_h);

        //Create ball in middle of screen
        int ball_x = 0;
        int ball_y = 0;
        int ball_radius = 10;
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(ball_x, ball_y, ball_radius);

        //Show the shapes
        StdDraw.show();
    }
}
