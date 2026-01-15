package quizApp;
import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
    Quiz() {
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizApp/icons/quiz.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);

        JLabel Qlabel = new JLabel("1");
        Qlabel.setBounds(100, 450, 50, 30);
        Qlabel.setFont (new Font("Tahoma", Font.PLAIN,24));
        add(Qlabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Quiz();
    }
}
