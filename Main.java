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


        System.out.println("Введите ваше число");
        Scanner numbers = new Scanner(System.in);
        int inputPlayer = numbers.nextInt();
        int[] numbersPlayer = new int[inputPlayer];
        int[] all = new int[2];

        boolean found = false;
        for (int i = 0; i <= num.length; i++) {
            if (inputPlayer == num[i]) {
                if ( num[0]== inputPlayer) {

                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Вы отгадали число");
            bull++;
        } else {
            System.out.println("К сожалению это не то число, попробуйте еще раз!");
            System.out.println("Введите ваше число");

        }


        all[0] = cows;
        all[1] = bull;

        System.out.println(all[0] + "Cows ");
        System.out.println(all[1] + "Bulls ");
    }
}
//        for (int i : all) {
//            System.out.print(i);

//        for (int i : num) {
//            System.out.print(i + ", ");
//        }

//            for (int i = 0; i <num.length; i++)
//            {
//                for (int j = i + 1; j < num.length; j++)
//                {
//                    if (num[i] > num[j])
//                    {
//                        int rez = num[i];
//                        num[i] = num[j];
//                        num[j] = rez;
//                    }
//                }
//                System.out.print(num[i] + " ");
//            }





