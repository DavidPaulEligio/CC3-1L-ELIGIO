import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class CharacterMove extends Canvas {
    
    static Color colored;
    static Rectangle handle;
    static int move = 0;
    static String tle = "";
    JButton button1;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Character : ");
        JLabel label1 = new JLabel("NULL");
        JLabel chColor = new JLabel("Choose a Color : ");
        
        final Canvas canvas = new CharacterMove();
//        String col = "Red";
        Object col = JOptionPane.showInputDialog(frame, "Select your Main Color! ", "Color List :",
        JOptionPane.QUESTION_MESSAGE, null, new String[] { "Green","Red","Blue" },"Green");
        
        //CONDITION FOR JOPTION PANE ON CHANGIN MAIN COLOR
        if(col == "Green"){
            colored = new Color(0,255,0);
        }else if(col == "Blue"){
            colored = new Color(0,0,255);    
        }else if(col == "Red"){
            colored = new Color(255,0,0);
        }else{
            colored = new Color(255,0,0);
        }
        
//        Object result = JOptionPane.showInputDialog(frame, "Enter printer name:");
        String name = JOptionPane.showInputDialog(frame,"Enter the Name : ");
//        String name = "Character";
        JButton b = new JButton("RED");
        JButton b1 = new JButton("BLUE");
        JButton b2 = new JButton("GREEN");
        
        //JBUTTONS
        b2.setBounds(10,190, 100, 50);
        b1.setBounds(10,130, 100, 50);
        b.setBounds(10,70, 100, 50);
        
        //JLABELS
        label1.setText("Your Name: " + name);
        label1.setFont(new Font("Arial", Font.BOLD, 14));
        label1.setBounds(130, 40, 200, 40);
        
        
        
        //Button2 or b2, will Change the main color to Green
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tle = "The Main Color is now Green";
                colored = new Color(0,255,0);
                canvas.repaint();    
            }
        });{
        
        }
       
        //Button or b, will change the main color to red
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tle = "The Main Color is now Red";
                colored = new Color(255,0,0);
                canvas.repaint();
            }
        });
        
        //Button1 or b1, will change the main color to blue
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tle = "The Main Color is now Blue";
                colored = new Color(0,0,255);
                canvas.repaint();
            }
        });
        
        
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    move = 1;
                    canvas.repaint();
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    move = 0;
                    canvas.repaint();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
            
        });
        
        
        canvas.setSize(400, 300);
        
        //JLabel , Add to the Frame
        frame.add(label1);
        frame.add(chColor);
    
        //JButtons , Add to the frame
        // frame.add(b);
        // frame.add(b1);
        // frame.add(b2);
        
        //Canvas/paint Method add to JFrame
        frame.add(canvas);

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {   
        g.setFont(new Font("Arial", Font.BOLD, 18));
        // g.drawString(tle, 40, 20);
        
        
        
        //HEAD
        g.setColor(new Color(139, 69, 19));
        g.fillOval(170, 100, 50, 50);
        g.setColor(Color.BLACK);
        g.drawOval(170, 100, 50, 50);
           
        //EYES
        g.setColor(Color.BLACK);
        g.fillOval(190, 120, 15, 20);
        g.fillOval(205, 120, 15, 20);
        
        //HELMET
        g.setColor(colored);
        g.fillRect(171, 100, 50, 20);
        //HELMET pt. 2
        g.fillRect(176, 120, 10, 20);
        
        //TORSO
        g.setColor(new Color(139, 69, 19));
        g.fillRect(178, 165, 40, 25);
        g.setColor(Color.BLACK);
        g.drawRect(178, 165, 40, 25);
        
        //CHEST ARMOR
        g.setColor(colored);
        g.fillRect(171, 146, 50, 20);
        
        //RIGHT ARM
        g.setColor(new Color(139, 69, 19));
        g.fillRect(161, 166, 15, 30);
        g.setColor(Color.BLACK);
        g.drawRect(161, 166, 15, 30);
        
        
        //RIGHT SHOULDER ARMOR
        g.setColor(colored);
        g.fillRect(161, 146, 18, 22);
        
        //LEFT ARM
        g.setColor(new Color(139, 69, 19));
        g.fillRect(226, 146, 35, 15);
        g.setColor(Color.BLACK);
        g.drawRect(226, 146, 35, 15);
        
        //RIGHT SHOULDER ARMOR
        g.setColor(colored);
        g.fillRect(221, 146, 5, 21);
        
        //LEGS
        g.setColor(new Color(139, 69, 19));
        g.fillRect(180, 195, 28, 28);
        g.setColor(Color.BLACK);
        g.drawRect(180, 195, 28, 28);
        
        g.setColor(new Color(139, 69, 19));
        g.fillRect(203, 195, 14, 28);
        g.setColor(Color.BLACK);
        g.drawRect(203, 195, 14, 28);
        
        //PANTS
        g.setColor(colored);
        g.fillRect(178, 195, 31, 20);
        
        g.setColor(colored);
        g.fillRect(203, 195, 16, 20);

        //BELT
        g.setColor(Color.BLACK);
        g.fillRect(178, 190, 41, 8);     
        
        if(move == 0){
            //SWORD : HANDLE 1ST |
            g.setColor(Color.BLACK);
            g.fillRect(261, 142, 6, 22);
            g.setColor(Color.BLACK);
            g.drawRect(261, 142, 6, 22);
            //2ND -
            g.setColor(Color.BLACK);
            g.fillRect(251, 140, 25, 6);
            g.setColor(Color.BLACK);
            g.drawRect(251, 140, 25, 6);

            //SWORD : BLADE
            g.setColor(Color.DARK_GRAY);
            g.fillRect(256, 100, 15, 40);
            g.fillPolygon(new int[] {255, 263, 271}, new int[] {100, 80, 100}, 3);
        
        }else if(move == 1) {
            g.setColor(Color.BLACK);
            g.fillRect(255, 150,22, 6);
            g.setColor(Color.BLACK);
            g.drawRect(255, 150,22, 6);
            // handle 2
            g.setColor(Color.BLACK);
            g.fillRect(271, 142 ,6, 22);
            g.setColor(Color.BLACK);
            g.drawRect(271, 142 ,6, 22);

            //blade
            g.setColor(Color.DARK_GRAY);
            g.fillRect(278, 146, 40, 15);
            g.fillPolygon(new int[] {318, 318, 343}, new int[] {145, 160, 154}, 3);
        }
        
        //SHIELD
        g.fillOval(146, 156, 55, 55);
        g.setColor(Color.BLACK);
        g.drawOval(146, 156, 55, 55);
        g.setColor(colored);
        g.fillOval(161, 171, 25, 25);
        
           
      
    }
    
}
