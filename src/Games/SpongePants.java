/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Games;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Scanner;

/**
 *
 * @author hek6452
 */
public class SpongePants extends JComponent {

    //Brick row collision method
    public void paddleSidecollision() {
        // did the ball hit the player paddle
        if (ball.intersects(playerleft)) {
            {
                ballYDirection = ballYDirection * -1;
                ballXDirection = ballXDirection * +1;
            }
            ballYDirection = -1;
        }
        // did the ball hit the player paddle
        if (ball.intersects(playermid)) {
            {
                ballYDirection = ballYDirection * -1;
                ballXDirection = ballXDirection * +1;
            }
            ballYDirection = -2;
            ballSpeed = 4;
        }
        // did the ball hit the player paddle
        if (ball.intersects(playerright)) {
            {
                ballYDirection = ballYDirection * -1;
                ballXDirection = ballXDirection * +1;
            }
            ballYDirection = -1;

        }
    }

    public void brickCollision1(Rectangle[] bricks) {
        //side paddle physics

        // check for collisions for Bricks1 array (First row)
        for (int i = 0; i < bricks.length; i++) {
            // did the ball hit a brick?
            if (ball.intersects(bricks[i])) {
                if (lives1[i] >= 0) {
                    lives1[i] = lives1[i] - 1;
                    playerScore++;
                }
                if (lives1[i] < 0) {
                    bricks[i].x = 20000;
                }
                ballYDirection = ballYDirection * -1;
                ballSpeed = 4;
            }
            {
                ballYDirection = ballYDirection * -1;
            }
        }
    }

    public void brickCollision2(Rectangle[] bricks) {
        // check for collisions for Bricks2 array (second row)
        for (int i = 0; i < bricks.length; i++) {
            // did the ball hit a brick?
            if (ball.intersects(bricks[i])) {
                if (lives2[i] >= 0) {
                    lives2[i] = lives2[i] - 1;
                    playerScore++;
                }
                if (lives2[i] < 0) {
                    bricks[i].x = 20000;
                }
                ballYDirection = ballYDirection * -1;
                ballSpeed = 4;

            }
            {
                ballYDirection = ballYDirection * -1;
            }
        }
    }

    public void brickCollision3(Rectangle[] bricks) {
        // check for collisions for Bricks3 array (third row)
        for (int i = 0; i < bricks.length; i++) {
            // did the ball hit a brick?
            if (ball.intersects(bricks[i])) {
                if (lives3[i] >= 0) {
                    lives3[i] = lives3[i] - 1;
                    playerScore++;
                }
                if (lives3[i] < 0) {
                    bricks[i].x = 20000;
                }
                ballYDirection = ballYDirection * -1;
                ballSpeed = 4;
            }
            {
                ballYDirection = ballYDirection * -1;
            }
        }
    }

    public void brickCollision4(Rectangle[] bricks) {
        // check for collisions for Bricks4 array (fourth row)
        for (int i = 0; i < bricks.length; i++) {
            // did the ball hit a brick?
            if (ball.intersects(bricks[i])) {
                if (lives4[i] >= 0) {
                    lives4[i] = lives4[i] - 1;
                    playerScore++;
                }
                if (lives4[i] < 0) {
                    bricks[i].x = 20000;
                }
                ballYDirection = ballYDirection * -1;
                ballSpeed = 4;
            }
            {
                ballYDirection = ballYDirection * -1;
            }
        }
    }

    public void brickCollision5(Rectangle[] bricks) {
        // check for collisions for Bricks5 array (fifth row)
        for (int i = 0; i < bricks.length; i++) {
            // did the ball hit a brick?
            if (ball.intersects(bricks[i])) {
                if (lives5[i] >= 0) {
                    lives5[i] = lives5[i] - 1;
                    playerScore++;
                }
                if (lives5[i] < 0) {
                    bricks[i].x = 20000;
                }
                ballYDirection = ballYDirection * -1;
                ballSpeed = 4;
            }
            {
                ballYDirection = ballYDirection * -1;
            }
        }
    }

    public void brickCollision6(Rectangle[] bricks) {
        // check for collisions for Bricks6 array (sixth row)
        for (int i = 0; i < bricks.length; i++) {
            // did the ball hit a brick?
            if (ball.intersects(bricks[i])) {
                if (lives6[i] >= 0) {
                    lives6[i] = lives6[i] - 1;
                    playerScore++;
                }
                if (lives6[i] < 0) {
                    bricks[i].x = 20000;
                }
                ballYDirection = ballYDirection * -1;
                ballSpeed = 4;
            }
            {
                ballYDirection = ballYDirection * -1;
            }

        }
    }

    //array for the lives for each brick array
    int[] lives1 = new int[14];
    int[] lives2 = new int[14];
    int[] lives3 = new int[14];
    int[] lives4 = new int[14];
    int[] lives5 = new int[14];
    int[] lives6 = new int[14];

    //Array for the rows of bricks
    Rectangle[] Bricks1 = new Rectangle[14];
    Rectangle[] Bricks2 = new Rectangle[14];
    Rectangle[] Bricks3 = new Rectangle[14];
    Rectangle[] Bricks4 = new Rectangle[14];
    Rectangle[] Bricks5 = new Rectangle[14];
    Rectangle[] Bricks6 = new Rectangle[14];

    int BrickPlus = 0;
    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // Set framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    //Set brick life 1 color
    Color brickDarkred = new Color(127, 2, 2);
    //set brick life 2 color
    Color brickPink = new Color(255, 0, 102);
    //Brick life 3 colour
    Color brickOrange = new Color(255, 153, 51);
    //Create player paddle
    int paddleHeight = 100;
    int paddleWidth = 25;
    Rectangle playerleft = new Rectangle(300, 560, 60, 25);
    Rectangle playermid = new Rectangle(360, 560, 60, 25);
    Rectangle playerright = new Rectangle(420, 560, 60, 25);
    int paddleSpeed = 10;
    //Booleans for player movement
    boolean playerLeft = false;
    boolean playerRight = false;
    //booleans for game initiation
    boolean gameStart = false;
    boolean gamePause = false;
    boolean reset = false;
    boolean end = false;
    boolean startMenu = false;
    //create ball
    int ballSize = 20;
    Rectangle ball = new Rectangle(375, 525, ballSize, ballSize);
    int ballXDirection = 1;
    int ballYDirection = -1;
    int ballSpeed = 4;
    //int dx = (int) (4 * Math.cos(Math.toRadians(45)));
    //int dy = (int) (4 * Math.sin(Math.toRadians(45)));
    //Amount of brick lives
    int brickLives = 2;
    //set player score
    int playerScore = 0;
    //create font
    Font biggerFont = new Font("arial", Font.BOLD, 42);
    Font startTitle = new Font("arial", Font.BOLD, 100);
    Font gameOver = new Font("arial", Font.BOLD, 100);
    Font stoStart = new Font("arial", Font.BOLD, 40);
    Font pause = new Font("arial", Font.BOLD, 40);
    //start screen title

    // GAME VARIABLES END HERE   
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public SpongePants() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        if (!startMenu) {
            //start screen
            g.setFont(startTitle);
            g.drawString("Smash Ball", 150, 300);
            g.setFont(stoStart);
            g.drawString("Press S to start", 250, 400);
            g.setFont(pause);
            g.drawString("Press P to pause", 250, 500);
        }
        //Start the game
        if (gameStart && !gamePause) {
            // always clear the screen first!
            g.clearRect(0, 0, WIDTH, HEIGHT);
            // GAME DRAWING GOES HERE
            // draw scores
            g.setFont(biggerFont);
            g.drawString("" + playerScore, WIDTH / 2, 50);
            // draw the player portions
            //g.setColor(brickDarkred);
            g.fillRect(playerleft.x, playerleft.y,
                    playerleft.width, playerleft.height);

            //g.setColor(brickPink);
            g.fillRect(playermid.x, playermid.y,
                    playermid.width, playermid.height);

            //g.setColor(brickOrange);
            g.fillRect(playerright.x, playerright.y,
                    playerright.width, playerright.height);

            //Draw ball
            g.fillRect(ball.x, ball.y, ball.width, ball.height);

            //brick colors
            g.setColor(brickDarkred);
            //Draw Bricks row1
            for (int i = 0; i < Bricks1.length; i++) {
                if (Bricks1[i] != null) {
                    if (lives1[i] == 2) {
                        g.setColor(brickDarkred);
                    }
                    if (lives1[i] == 1) {
                        g.setColor(brickPink);
                    }
                    if (lives1[i] == 0) {
                        g.setColor(brickOrange);
                    }
                    g.fillRect(Bricks1[i].x, Bricks1[i].y, Bricks1[i].width, Bricks1[i].height);
                }
                //Draw Bricks row2
                if (Bricks2[i] != null) {
                    if (lives2[i] == 2) {
                        g.setColor(brickDarkred);
                    }
                    if (lives2[i] == 1) {
                        g.setColor(brickPink);
                    }
                    if (lives2[i] == 0) {
                        g.setColor(brickOrange);
                    }
                    g.fillRect(Bricks2[i].x, Bricks2[i].y, Bricks2[i].width, Bricks2[i].height);
                }
                //Row 3
                if (Bricks3[i] != null) {
                    if (lives3[i] == 2) {
                        g.setColor(brickDarkred);
                    }
                    if (lives3[i] == 1) {
                        g.setColor(brickPink);
                    }
                    if (lives3[i] == 0) {
                        g.setColor(brickOrange);
                    }
                    g.fillRect(Bricks3[i].x, Bricks3[i].y, Bricks3[i].width, Bricks3[i].height);
                }
                //Row 4
                if (Bricks4[i] != null) {
                    if (lives4[i] == 2) {
                        g.setColor(brickDarkred);
                    }
                    if (lives4[i] == 1) {
                        g.setColor(brickPink);
                    }
                    if (lives4[i] == 0) {
                        g.setColor(brickOrange);
                    }
                    g.fillRect(Bricks4[i].x, Bricks4[i].y, Bricks4[i].width, Bricks4[i].height);
                }
                //row 5
                if (Bricks5[i] != null) {
                    if (lives5[i] == 2) {
                        g.setColor(brickDarkred);
                    }
                    if (lives5[i] == 1) {
                        g.setColor(brickPink);
                    }
                    if (lives5[i] == 0) {
                        g.setColor(brickOrange);
                    }
                    g.fillRect(Bricks5[i].x, Bricks5[i].y, Bricks5[i].width, Bricks5[i].height);
                }
                //row 6
                if (Bricks6[i] != null) {
                    if (lives6[i] == 2) {
                        g.setColor(brickDarkred);
                    }
                    if (lives6[i] == 1) {
                        g.setColor(brickPink);
                    }
                    if (lives6[i] == 0) {
                        g.setColor(brickOrange);
                    }
                    g.fillRect(Bricks6[i].x, Bricks6[i].y, Bricks6[i].width, Bricks6[i].height);
                }
            }
            //what happens when ball reaches bottom of screen,(You lose)
            if (ball.y > 600) {
                end = true;
            }

        }
        //end menu
        if (end) {
            gameStart=false;
            startMenu = true;
            g.setFont(gameOver);
            g.drawString("Game Over!", 150, 300);

        }
    }
    // GAME DRAWING ENDS HERE
    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!

    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        //create rows of brick arrays 
        Bricks1[0] = new Rectangle(20, 250, 50, 25);
        //set lives per brick
        lives1[0] = 2;
        for (int i = 1; i < Bricks1.length; i++) {
            lives1[i] = 2;
            Bricks1[i] = new Rectangle(Bricks1[i - 1].x + 55, Bricks1[i - 1].y, Bricks1[i - 1].width, Bricks1[i - 1].height);
        }
        Bricks2[0] = new Rectangle(20, 220, 50, 25);
        lives2[0] = 2;
        for (int i = 1; i < Bricks2.length; i++) {
            lives2[i] = 2;
            Bricks2[i] = new Rectangle(Bricks2[i - 1].x + 55, Bricks2[i - 1].y, Bricks2[i - 1].width, Bricks2[i - 1].height);
        }
        Bricks3[0] = new Rectangle(20, 190, 50, 25);
        lives3[0] = 2;
        for (int i = 1; i < Bricks3.length; i++) {
            lives3[i] = 2;
            Bricks3[i] = new Rectangle(Bricks3[i - 1].x + 55, Bricks3[i - 1].y, Bricks3[i - 1].width, Bricks3[i - 1].height);
        }
        Bricks4[0] = new Rectangle(20, 160, 50, 25);
        lives4[0] = 2;
        for (int i = 1; i < Bricks4.length; i++) {
            lives4[i] = 2;
            Bricks4[i] = new Rectangle(Bricks4[i - 1].x + 55, Bricks4[i - 1].y, Bricks4[i - 1].width, Bricks4[i - 1].height);
        }
        Bricks5[0] = new Rectangle(20, 130, 50, 25);
        lives5[0] = 2;
        for (int i = 1; i < Bricks5.length; i++) {
            lives5[i] = 2;
            Bricks5[i] = new Rectangle(Bricks5[i - 1].x + 55, Bricks5[i - 1].y, Bricks5[i - 1].width, Bricks5[i - 1].height);

        }
        Bricks6[0] = new Rectangle(20, 100, 50, 25);
        lives6[0] = 2;
        for (int i = 1; i < Bricks6.length; i++) {
            lives6[i] = 2;
            Bricks6[i] = new Rectangle(Bricks6[i - 1].x + 55, Bricks6[i - 1].y, Bricks6[i - 1].width, Bricks6[i - 1].height);
        }
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            //start screen
            if (gameStart && !gamePause) {
                // move the ball
                ball.x = ball.x + ballXDirection * ballSpeed;
                ball.y = ball.y + ballYDirection * ballSpeed;

                // get ball to bounce off right side
                // bottom of ball hit right side of screen
                if (ball.x + ball.width >= WIDTH) {
                    // change x direction
                    ballXDirection = ballXDirection * -1;
                }
                // bottom of ball hit left side of screen
                if (ball.x <= 0) {
                    // change x direction
                    ballXDirection = ballXDirection * -1;
                }

                // top of ball hit top of screen
                if (ball.y <= 0) {
                    ballYDirection = ballYDirection * -1;
                }
                // did the ball hit the player paddle
                paddleSidecollision();
                //Get ball to change velocity in relation to paddle

                // check for collisions for brick arrays
                brickCollision1(Bricks1);
                brickCollision2(Bricks2);
                brickCollision3(Bricks3);
                brickCollision4(Bricks4);
                brickCollision5(Bricks5);
                brickCollision6(Bricks6);

                //moving player paddle left portion
                if (playerLeft && playerleft.x > 0) {
                    playerleft.x = playerleft.x - paddleSpeed;
                } else if (playerRight && playerleft.x + playerleft.width < 680) {
                    playerleft.x = playerleft.x + paddleSpeed;
                }
                //moving player paddle middle portion
                if (playerLeft && playermid.x > 60) {
                    playermid.x = playermid.x - paddleSpeed;
                } else if (playerRight && playermid.x + playermid.width < 740) {
                    playermid.x = playermid.x + paddleSpeed;
                }
                //moving player paddle right portion
                if (playerLeft && playerright.x > 120) {
                    playerright.x = playerright.x - paddleSpeed;
                } else if (playerRight && playerright.x + playerright.width < WIDTH) {
                    playerright.x = playerright.x + paddleSpeed;
                }
            }
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }
    // Used to implement any of the Mouse Actions

    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
            //store key being pressed
            int key = e.getKeyCode();
            //Determining key being pressed
            if (key == KeyEvent.VK_LEFT) {
                playerLeft = true;
            } else if (key == KeyEvent.VK_RIGHT) {
                playerRight = true;
            }
            if (key == KeyEvent.VK_S) {
                gameStart = true;
            }
            if (key == KeyEvent.VK_P) {
                gamePause = true;
            }
            if (key == KeyEvent.VK_R) {
                reset = true;
            }
        }
        // if a key has been released

        @Override
        public void keyReleased(KeyEvent e) {
            // store the key being pressed
            int key = e.getKeyCode();
            // determine which key it is
            if (key == KeyEvent.VK_LEFT) {
                playerLeft = false;
            } else if (key == KeyEvent.VK_RIGHT) {
                playerRight = false;
            }
            if (key == KeyEvent.VK_S) {
                gamePause = false;
            }
            if (key == KeyEvent.VK_P) {
                gameStart = false;

            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        SpongePants game = new SpongePants();

        // starts the game loop
        game.run();
    }
}
