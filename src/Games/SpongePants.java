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

    public void brickCollision(Rectangle[] bricks) {
        // check for collisions for Bricks1 array (First row)
        for (int i = 0; i < bricks.length; i++) {
            // did the ball hit a brick?
            if (ball.intersects(bricks[i])) {
                if (lives1[i] > 0) {
                    lives1[i] = lives1[i] - 1;
                }
                if (lives1[i] == 0) {
                    bricks[i].x = 20000;
                }
                ballYDirection = +1;
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
    Color brickRed = new Color(255, 117, 117);
    //Brick life 3 colour
    Color brickOrange = new Color(255, 136, 77);
    //Create player paddle
    int paddleHeight = 100;
    int paddleWidth = 25;
    Rectangle player = new Rectangle(300, 560, 175, 25);
    int paddleSpeed = 10;
    boolean playerLeft = false;
    boolean playerRight = false;
    //create ball
    int ballSize = 20;
    Rectangle ball = new Rectangle(375, 525, ballSize, ballSize);
    int ballXDirection = 1;
    int ballYDirection = -1;
    int ballSpeed = 4;
    //Amount of brick lives
    int brickLives = 2;

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
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        //lives

        // draw the players
        g.fillRect(player.x, player.y,
                player.width, player.height);
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
                    g.setColor(brickRed);
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
                    g.setColor(brickRed);
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
                    g.setColor(brickRed);
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
                    g.setColor(brickRed);
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
                    g.setColor(brickRed);
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
                    g.setColor(brickRed);
                }
                if (lives6[i] == 0) {
                    g.setColor(brickOrange);
                }
                g.fillRect(Bricks6[i].x, Bricks6[i].y, Bricks6[i].width, Bricks6[i].height);
            }
        }


        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        Bricks1[0] = new Rectangle(20, 250, 50, 25);
        lives1[0] = 3;
        for (int i = 1; i < Bricks1.length; i++) {
            lives1[i] = 2;
            Bricks1[i] = new Rectangle(Bricks1[i - 1].x + 55, Bricks1[i - 1].y, Bricks1[i - 1].width, Bricks1[i - 1].height);
        }
        Bricks2[0] = new Rectangle(20, 220, 50, 25);
        lives2[0] = 2;
        for (int i = 1; i < Bricks2.length; i++) {
            Bricks2[i] = new Rectangle(Bricks2[i - 1].x + 55, Bricks2[i - 1].y, Bricks2[i - 1].width, Bricks2[i - 1].height);
        }
        Bricks3[0] = new Rectangle(20, 190, 50, 25);
        lives3[0] = 2;
        for (int i = 1; i < Bricks3.length; i++) {
            Bricks3[i] = new Rectangle(Bricks3[i - 1].x + 55, Bricks3[i - 1].y, Bricks3[i - 1].width, Bricks3[i - 1].height);
        }
        Bricks4[0] = new Rectangle(20, 160, 50, 25);
        lives4[0] = 2;
        for (int i = 1; i < Bricks4.length; i++) {
            Bricks4[i] = new Rectangle(Bricks4[i - 1].x + 55, Bricks4[i - 1].y, Bricks4[i - 1].width, Bricks4[i - 1].height);
        }
        Bricks5[0] = new Rectangle(20, 130, 50, 25);
        lives5[0] = 2;
        for (int i = 1; i < Bricks5.length; i++) {
            Bricks5[i] = new Rectangle(Bricks5[i - 1].x + 55, Bricks5[i - 1].y, Bricks5[i - 1].width, Bricks5[i - 1].height);

        }
        Bricks6[0] = new Rectangle(20, 100, 50, 25);
        lives6[0] = 2;
        for (int i = 1; i < Bricks6.length; i++) {
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
            if (ball.intersects(player)) {
                ballYDirection = ballYDirection * -1;
            }
            //Get ball to change velocity in relation to paddle

            // check for collisions for brick arrays (First row)
            brickCollision(Bricks1);
            brickCollision(Bricks2);
            brickCollision(Bricks3);
            brickCollision(Bricks4);
            brickCollision(Bricks5);
            brickCollision(Bricks6);

            //moving player paddle
            if (playerLeft && player.x > 0) {
                player.x = player.x - paddleSpeed;
            } else if (playerRight && player.x + player.width < WIDTH) {
                player.x = player.x + paddleSpeed;
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
