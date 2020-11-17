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

        System.out.println("Поробуйте угадать двузначное число");
//        Scanner sum = new Scanner(System.in);
//        int number = sum.nextInt();

        int[] num = new int[2];


        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 9);
            System.out.print(num[i] + "  ");
        }
        int[] all = new int[2];

       boolean tryToWin = true;
        while (tryToWin) {

            for (int i = 0; i < num.length; i++) {
                System.out.println("Введите ваше число");
                Scanner numbers = new Scanner(System.in);
                int inputPlayer = numbers.nextInt();
                Scanner numbersSecond = new Scanner(System.in);
                int inputPlayer2 = numbers.nextInt();
                int[][] numbersPlayer = new int[inputPlayer][inputPlayer2];
                if (inputPlayer == num[0]) {
                    System.out.println(inputPlayer + " Вы отгадали первое число ");
                    bull++;
                } else if (inputPlayer == num[1]) {
                    System.out.println(inputPlayer + " Вы отгадали второе число число");
                    cows++;
                }
                if (inputPlayer2 == num[0]) {
                    System.out.println(inputPlayer2 + " Вы отгадали первое число");
                    cows ++;
                } else if (inputPlayer2 == num[1]) {
                    System.out.println(inputPlayer2 + " Вы отгадали второе число число");
                    bull++;
                } else {
                    System.out.println("К сожалению это не те числа, попробуйте еще раз!");
                    i++;
                }
                if (bull == 2) {
                    System.out.println("Вы отгадали все числа");
                    tryToWin = false;
                    break;
                }
            }
        }
        all[0] = cows;
        all[1] = bull;
        System.out.println("bull " + all[1]);
    }
}







