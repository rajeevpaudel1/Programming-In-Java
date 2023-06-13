import java.awt.*;

import javax.swing.*;

public class MyLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(100, 100, 700, 400);
        frame.setTitle("Trying JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= frame.getContentPane();
        c.setLayout(null);

        //everything till here is same as we did in JFrame part
        //for trying JLabel part we will create the object of JLabel and get started
        JLabel label= new JLabel("User Name");
        label.setBounds(100, 50, 300, 30);
        label.setText("Password"); //it will write the text inside the jlabel
        Font font= new Font("arial", Font.BOLD, 30); 
        label.setFont(font);
        c.add(label);
        

    }
    
}
