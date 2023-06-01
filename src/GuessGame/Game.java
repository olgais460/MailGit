package GuessGame;

import java.io.IOException;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws IOException {

            Game currentGame = new Game();


        System.out.println("Какую цифру я загадал?");

            System.out.println("Попытайтесь угадать");
        while (true) {
            int ch;
            Scanner sc = new Scanner(System.in);
            //ожидаем ввода команды в бесконечном цикле

            ch = Integer.parseInt(sc.nextLine());

            //обрабатываем введенную команду
            currentGame.processCommand(ch);

        }
        }

     void processCommand(int ch){
            int answer = 10;


                if (ch > answer) {
                    System.out.println("Перестарался!");
                } else if (ch < answer) {
                    System.out.println("Недостарался!");

                } else if (ch == answer) {

                    System.out.println("Поздравляю!Угадал!");
                }


            }
}










