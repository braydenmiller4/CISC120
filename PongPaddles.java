public class PongPaddles {
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
        int Y_BORDER = 300;
        int X_BORDER = 400;
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
        double ball_x = 0;
        double ball_y = 0;
        int ball_radius = 10;
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(ball_x, ball_y, ball_radius);
        double velocity_x = BALL_xVEL;
        double velocity_y = BALL_yVEL;

        //Show the shapes
        StdDraw.show();

        //Main game loop
        while(WINNER == -1){
            StdDraw.clear(StdDraw.GRAY);

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledRectangle(p1_pdl_x, p1_pdl_y, pdl_w, pdl_h);
            StdDraw.filledRectangle(p2_pdl_x, p2_pdl_y, pdl_w, pdl_h);

            StdDraw.setPenColor(StdDraw.WHITE);
            if (Math.abs(ball_x + velocity_x) > X_BORDER - ball_radius) velocity_x = -velocity_x;
            if (Math.abs(ball_y + velocity_y) > Y_BORDER - ball_radius) velocity_y = -velocity_y;

            ball_x = ball_x + velocity_x;
            ball_y = ball_y + velocity_y;

            StdDraw.filledCircle(ball_x, ball_y, ball_radius);

            StdDraw.show();
            StdDraw.pause(5);

            if (StdDraw.hasNextKeyTyped()){
                char key = StdDraw.nextKeyTyped();
                if (key == 'w') p1_pdl_y = p1_pdl_y + PDL_VEL;
                else if (key == 's') p1_pdl_y = p1_pdl_y - PDL_VEL;
                else if (key == 'i') p2_pdl_y = p2_pdl_y + PDL_VEL;
                else if (key == 'k') p2_pdl_y = p2_pdl_y - PDL_VEL;
            }
        }
    }
}