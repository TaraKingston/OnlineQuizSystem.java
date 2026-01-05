import java.util.Scanner;

public class multipleChoiceSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] answers = {"c", "a", "b"};
        String[] response = {"", "", ""};
        System.out.println("What is 45 x 9?");
        System.out.println("a) 398");
        System.out.println("b) 456");
        System.out.println("c) 405"); //correct
        System.out.println("d) 406");

        System.out.println("What is 67 x 4?");
        System.out.println("a) 268"); //correct
        System.out.println("b) 302");
        System.out.println("c) 269");
        System.out.println("d) 257");

        System.out.println("What is 59 x 7?");
        System.out.println("a) 411");
        System.out.println("b) 413"); //correct
        System.out.println("c) 398");
        System.out.println("d) 456");

        response[0] = sc.next();
        response[1] = sc.next();
        response[2] = sc.next();

        int score = 0;

        for(int i = 0; i < 3; i++) {
            if(response[i].equalsIgnoreCase(answers[i])) {
                score++;
            }
        }
        System.out.println("Score: " + score + "/3");
    }
}