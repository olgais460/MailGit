package GuessGame;


import java.io.IOException;
import java.util.Scanner;

public class Game2 {

    static int answer = 10;
    static int ch;
    boolean theTry;

    public static void main(String[] args) {

        Game currentGame = new Game();

        System.out.println("Какую цифру я загадал?");

        System.out.println("Попытайтесь угадать");
        while (ch != answer) {
            boolean theTry;
            try {
                System.out.println("Введите число");
                Scanner sc = new Scanner(System.in);
                ch = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Введите ЧИСЛО");
                theTry=false;

            }
            if (theTry=true)
            {  currentGame.processCommand(ch);}



        }
    }
    void processCommand(int ch) {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Введите число");


            if (ch > answer) {
                System.out.println("Перестарался!");
            } else if ( ch < answer) {
                System.out.println("Недостарался!");

            } else {

                System.out.println("Поздравляю!Угадал!");

            }}
        }


    }