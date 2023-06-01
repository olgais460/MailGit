package GuessGame;

import java.io.IOException;

public class Game3 {

        public static void main(String[] args)  throws IOException {
            char ch;
            char answer = 'B';
            System.out.println("Какую букву я загадал?");
            System.out.println("Попытайтесь угадать");
            ch = (char) System.in.read();

            if (ch>answer)
            {System.out.println("Перестарался!");}
            else if (ch<answer)
                    {System.out.println("Недостарался!");
                  }
           else if (ch == answer) {
                System.out.println("Поздравляю!");
            }
            {
            }
        }}

