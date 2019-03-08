import javax.swing.*;
import java.awt.event.*;

public class PizzaChoice {

    JFrame frame;
    JButton btnSubmit,btnYes,btnNo;
    JLabel labelResult, labelPrice;

    PizzaChoice(){
        frame = new JFrame("Select pizza size");

        labelPrice = new JLabel();
        labelPrice.setText("Select size of Pizza");
        labelPrice.setBounds(100,20,200 ,30 );

        labelResult = new JLabel();
        labelResult.setBounds(50, 150, 300, 30);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(120, 100, 100, 30);
        
        String[] sizes  = {
            "Small",
            "Medium",
            "Large",
            "Extra Large"
        };
        
        final JComboBox dropdown = new JComboBox(sizes);
        dropdown.setBounds(75,50,200,20);
        frame.add(labelPrice);
        frame.add(dropdown);
        frame.add(btnSubmit);
        frame.add(labelResult);
        frame.setLayout(null);
        frame.setSize(350,350);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "The price of " +
                                dropdown.getItemAt(dropdown.getSelectedIndex()) +
                                " Pizza is $" +
                                pizzaPrice(dropdown.getItemAt(dropdown.getSelectedIndex()).toString());
                labelResult.setText(result);
            }
        });

    }

    public static void main(String[] args) {
        new PizzaChoice();
    }

    public static String pizzaPrice(String size) {
        String pizzaPrice = "";
        String[][] price = {
            {"6.99", "Small"},
            {"8.99", "Medium"},
            {"12.50", "Large"},
            {"15.50", "Extra Large"}
        };
        
        for (int i = 0; i < 4; i++) {
            if(size.equals(price[i][1])){
                pizzaPrice = price[i][0];
            }
        }
        return pizzaPrice;
    }

}