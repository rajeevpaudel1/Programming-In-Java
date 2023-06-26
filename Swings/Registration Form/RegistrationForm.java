import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(450, 0, 700, 700);
        Container c =frame.getContentPane();
        c.setLayout(null);

        JLabel label1 =new JLabel("Name: ");
        JLabel label2 =new JLabel("Mobile: ");
        JLabel label3 =new JLabel("Gender: ");
        JLabel label4 =new JLabel("DOB: ");
        JLabel label5 =new JLabel("Address: ");
        
        //Letus now show the label using container 
        label1.setBounds(50,50,100,30);
        label2.setBounds(50,100,100,30);
        label3.setBounds(50,150,100,30);
        label4.setBounds(50,200,100,30);
        label5.setBounds(50,250,100,30);

        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(label5);

        JTextField t1 =new JTextField();
        JTextField t2 =new JTextField();
        JRadioButton male =new JRadioButton("Male");        //we will be creating the radio button
        JRadioButton female= new JRadioButton("Female");

        t1.setBounds(150, 50, 150, 40);
        t2.setBounds(150, 100, 150, 40);
        male.setBounds(150, 160, 70, 20);
        male.setSelected(true); //This function makes the male selected default
        female.setBounds(220, 160, 100, 20);

        //now, we can see both the male and female can be selected at a time.
        //so we have a funtion here that is used to select only one radio button at a time 
        ButtonGroup gen= new ButtonGroup();
        gen.add(female);
        gen.add(male);


        c.add(t1);
        c.add(t2);
        c.add(male);
        c.add(female);


        //Now, this part is quite diffrent than we did till here
        String days[]={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                         "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
        String months[]={"January", "February", "March", "April", "May", "June", "July",
                         "August", "September", "October", "November", "December"};
        String years[]={"2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", 
                        "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997",
                         "1996", "1995","1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985",
                          "1984", "1983", "1982", "1981", "1980"};



        JComboBox day= new JComboBox<>(days);
        JComboBox month= new JComboBox<>(months);
        JComboBox year= new JComboBox<>(years);

        day.setBounds(130, 200, 50, 20);
        month.setBounds(190, 200, 70, 20);
        year.setBounds(270, 200, 50, 20);

        c.add(day);
        c.add(month);
        c.add(year); 

        //now we'll add the text area for the address

        JTextArea ta1= new JTextArea();
        ta1.setBounds(130, 240, 200, 50);
        c.add(ta1);

        //let us setup the checkbox for terms and conditions

        JCheckBox term=new JCheckBox("I accept the terms and condition stated by this form");
        term.setBounds(50, 300, 250, 20);
        c.add(term);

        //finally the last element remaning to add in the form 
        JButton btn=new JButton("Submit");
        btn.setBounds(150, 350, 80, 20);
        c.add(btn);

        //now, we'll create a screen which will display the information that you entered in the form.

        JTextArea screen = new JTextArea();
        screen.setBounds(350, 50, 300, 300);
        c.add(screen);

        JLabel msg=new JLabel();
        msg.setBounds(20, 400, 250, 20);
        c.add(msg);

         frame.setVisible(true);

         //now we'll create an ananyomous inner class for event handling

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(t1.getText()=="rajeev"){
                    System.out.println("Your data are: " +t1.getText());
                    System.out.println("Your address"+t2.getText());
                }
                else{
                    System.out.println("Chor aayo chor");
                }
                
            }
        });

    }
}