import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int bull = 0;
        int cows = 0;

        System.out.println("Сколько чисел вы хотите загадать?");
        Scanner sum = new Scanner(System.in);
        int number = sum.nextInt();
        int[] num = new int[number];


        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 9);
            System.out.println(num[i] + "  ");
        }


//        System.out.println("Введите ваше число");
//        Scanner numbers = new Scanner(System.in);
//        int inputPlayer = numbers.nextInt();
//        int[] numbersPlayer = new int[inputPlayer];
        int[] all = new int[2];
        boolean tryToWin = true;

        while (tryToWin) {
            boolean found = false;
            for (int i = 0; tryToWin = true; i++) {

                System.out.println("Введите ваше число");
                Scanner numbers = new Scanner(System.in);
                int inputPlayer = numbers.nextInt();
                int[] numbersPlayer = new int[inputPlayer];
                if (inputPlayer == num[i]) {
                    System.out.println("Вышел");
                }
                if (num[i] == inputPlayer) {
                    System.out.println("Как зашел");
                    found = true;
                    break;

                }

            }
            if (found) {
                System.out.println("Вы отгадали число");
                bull++;
                tryToWin = false;

            }else {
                System.out.println("К сожалению это не то число, попробуйте еще раз!");
                System.out.println("Введите еще раз!");
            }
        }

        all[0] = cows;
        all[1] = bull;

        System.out.println(all[0] + "Cows ");
        System.out.println(all[1] + "Bulls ");
    }
}






