import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBar{
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 600);
        frame.setTitle("Menu Bar");
        Container c=frame.getContentPane();
        c.setLayout(null);

        //We are creating the menubar, menu, menuitem objects.

        JMenuBar menubar=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        JMenuItem i1=new JMenuItem("New");
        JMenuItem i2=new JMenuItem("Open");
        JMenuItem i3=new JMenuItem("Save");
        JMenuItem i4=new JMenuItem("Cut");
        JMenuItem i5=new JMenuItem("Copy");
        JMenuItem i6=new JMenuItem("Paste");
        JMenuItem i7=new JMenuItem("Select All");

        

        //first we should add menu item to menu
        file.add(i1);
        file.add(i2);
        file.add(i3);
        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        edit.add(i7);

        //second we need to add the menuto the menu bar
        menubar.add(file);
        menubar.add(edit);

        //lastly we should add the menubar to the jframe
        frame.setJMenuBar(menubar);
        JTextArea ta= new JTextArea();
        ta.setBounds(10, 10, 370, 370);
        c.add(ta);
        frame.setVisible(true);
        
        // Adding action listeners to menu items
        i1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setText("New File...");
            }
        });

        i2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setText("Open File...");
            }
        });

        i3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setText("Save File...");
            }
        });

        i4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.cut();
            }
        });

        i5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.copy();
            }
        });

        i6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.paste();
            }
        });

        i7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.selectAll();
            }
        });
       }
}
