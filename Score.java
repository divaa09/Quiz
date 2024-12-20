import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener{

    Score(String name,int score)
    {
        getContentPane().setBackground(Color.WHITE);
        setBounds(600,150,750,50);
        setLayout(null);
        //adding an image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250); // left, top, width, height
        add(image);
         JLabel heading= new JLabel("Thank you "+name+" for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);

        JLabel lblscore= new JLabel("Your Score is:"+score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(lblscore);
        


        JButton Submit= new JButton("Play Again");
        Submit.setBounds(400,270,120,30);
        Submit.setFont(new Font("Tahoma",Font.PLAIN,22));   
        Submit.setBackground(new Color(30,144,255));
        Submit.setForeground(Color.WHITE);
        Submit.setEnabled(false);
        Submit.addActionListener(this);
        add(Submit);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
    setVisible(false);
    new Login();
    }
    public static void main(String[] args) {
        new Score("user",0);
    }
}
