import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pacman extends Panel implements KeyListener {
    //Variables
    static int y = 90, x = 90, size = 100, sa = 23, mouth = 315, speed = 25, score = 0;
    static int foodX = 300, foodY = 300, foodSize = 25;
    static Color color = Color.YELLOW;
    static String name;
    
    public Pacman(){
        this.setBackground(Color.BLACK);
    }
    
    @Override
    public void paint(Graphics g) {
        //Print Player name, Score, in Bold Type
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Arial", Font.BOLD,30));
        g.drawString("Player Name : " + name, 5, 30);
        g.drawString("Score : " + score, 5, 60);
        //Print mouth Size
        g.setColor(color);
        g.fillArc(x, y, size, size, sa, mouth);
        /*Print Food Size
        if score reaches to 10 print out You Won!!!
        */
        g.setColor(Color.WHITE);
        g.fillOval(foodX, foodY, foodSize, foodSize);
        if (score == 10) {
            g.setFont(new Font("Arial", Font.BOLD, 50));
            g.drawString("YOU WIN!", getWidth() / 2 - 150, getHeight() / 2);
        }
    }

    public static void main(String args[]) {
        
        name = JOptionPane.showInputDialog("Input Name:");
        JFrame frame = new JFrame();
        Pacman panel = new Pacman();
        panel.addKeyListener(panel);
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void keyPressed(KeyEvent e) {
        /*
        If the score reaches 10 then Pacman Won the game
        */
        if (score != 10) {
            if (e.getKeyChar() == 'y') {
                color = Color.YELLOW;
            }
            if (e.getKeyChar() == 'g') {
                color = Color.GREEN;
            }
            // Arrow key up
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                if (y <= 0) {   //north
                    y = getHeight() - speed;
                } else {
                    y -= speed;
                }

                sa = 113;

                if (y % 2 == 0) {
                    mouth = 360;
                } else {
                    mouth = 315;
                }
            }
            //Arrow Key Down
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                if (y >= (getHeight() - 100)) { //south
                    y = speed - size;
                } else {
                    y += speed;
                }

                sa = 293;

                if (y % 2 == 0) {
                    mouth = 360;
                } else {
                    mouth = 315;
                }
            }
            //Arrow Kry left
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                if (x <= 0) {   //west
                    x = getWidth() - speed;
                } else {
                    x -= speed;
                }

                sa = 203;

                if (x % 2 == 0) {
                    mouth = 360;
                } else {
                    mouth = 315;
                }
            }
            //Arrow Key right
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                if (x >= getWidth() - size) {   //east
                    x = speed - size;
                } else {
                    x += speed;
                }

                sa = 23;

                if (x % 2 == 0) {
                    mouth = 360;
                } else {
                    mouth = 315;
                }
            }
           /*the food of Pacman will 
            automatically spawn anywhre inside the frame
            */
            if (x + size > foodX && y + size > foodY
                    && x < foodX + foodSize && y < foodY + foodSize) {
                foodX = new Random().nextInt(getWidth() - 150) + 50;
                foodY = new Random().nextInt(getHeight() - 150) + 50;
                score += 1;
            }

            repaint();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
}
