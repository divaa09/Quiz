

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Login extends JFrame implements ActionListener {

    JButton rules,back;
    JTextField tfname;
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Add the image first
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500); // left, top, width, height
        add(image);

        // Add the heading next so it appears on top:Adding the image and heading
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(770, 60, 300, 45);  // Adjust the x position to make it visible
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        // adding  a box for user input to enter a name
        JLabel name= new JLabel("Enter your Name");
        name.setBounds(810, 150, 300, 20); 
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30,144,254));
        add(name);
         tfname= new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

      // create buttons
        rules= new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);


        back= new JButton("Back");
        back.setBounds(900,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
  
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
      public void actionPerformed(ActionEvent ae)
      {
        //differentiate
        if(ae.getSource()==rules)
        {
          String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else 
        {
            setVisible(false);
        }
      }
    public static void main(String[] args) {
        new Login();    }
}



