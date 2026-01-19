package quizApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score ) {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocation(0, 0);
        getContentPane().setBackground(new Color(214, 234, 248));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizApp/icons/trophy.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(454, 300, 420, 420);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for playing the quiz!"); //qno
        heading.setBounds(320, 50, 1600, 80);
        heading.setFont (new Font("Tahoma", Font.BOLD,40));
        heading.setForeground(new Color(25, 70, 140));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(540, 160, 1600, 60);
        lblscore.setFont (new Font("Tahoma", Font.PLAIN,35));
        lblscore.setForeground(new Color(25, 70, 140));
        add(lblscore);

       JButton playAgain = new JButton("Play Again");
        playAgain.setBounds(530, 270, 260, 65);
        playAgain.setFont(new Font("Tahoma", Font.BOLD, 35));
        playAgain.setBackground(new Color(30, 144, 255));
        playAgain.setForeground(Color.WHITE);
        playAgain.addActionListener(this);
        playAgain.setCursor(new Cursor(Cursor.HAND_CURSOR));
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
