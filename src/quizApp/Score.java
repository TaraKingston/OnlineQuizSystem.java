package quizApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score ) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizApp/icons/quiz.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for playing the quiz!"); //qno
        heading.setBounds(45, 30, 700, 30);
        heading.setFont (new Font("Tahoma", Font.PLAIN,26));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont (new Font("Tahoma", Font.PLAIN,26));
        add(lblscore);

       JButton playAgain = new JButton("Play Again");
        playAgain.setBounds(360, 270, 160, 40);
        playAgain.setBackground(new Color(30, 144, 255));
        playAgain.setForeground(Color.WHITE);
        playAgain.addActionListener(this);
        add(playAgain);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
       setVisible(false);
       new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
