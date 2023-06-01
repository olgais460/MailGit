package GuessGame;

import java.io.IOException;
import java.util.Scanner;

public class GameToUpgrade {

        static int answer = 10;
        static int ch;


        public static void main(String[] args) {

            Game currentGame = new Game();

            System.out.println("Какую цифру я загадал?");

            System.out.println("Попытайтесь угадать");
            while (ch != answer) {

                try {

                    Scanner sc = new Scanner(System.in);
                    ch = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Введите ЧИСЛО");

                } currentGame.processCommand(ch);

            }



            }

        void processCommand(int ch) {

                if (ch > answer) {
                    System.out.println("Перестарался!");
                } else if (ch < answer) {
                    System.out.println("Недостарался!");

                } else {

                    System.out.println("Поздравляю!Угадал!");

                }
            }

        }



