package menu;

import java.util.Scanner;

public class Starter {
    public void start() {
        while (true) {
            System.out.println("Welcome");
            System.out.println("1 -Buy ticket");
            System.out.println("2 - Show info about flight");
            System.out.println("3 - Cancel flight");
            System.out.println("4 - Exit");

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            while (true) {
                if (number == 1) {
                    option1 first = new option1();
                    first.option1();
                    break;
                }
                if (number == 2) {
                    option2 second = new option2();
                    second.option2();
                    break;
                }
                if (number == 3) {
                    option3 third = new option3();
                    third.option3();
                    break;
                }
                if (number == 4) {
                    option4 forth = new option4();
                    forth.option4();
                }
            }
        }
    }
}