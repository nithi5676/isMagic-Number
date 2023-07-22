package isMagic;

import java.util.Scanner;

public class IsMagic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(isMagicNumber(number));
    }

    public static int check(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int isMagicNumber(int number) {
        while (number >= 10) {
            number = check(number);
        }
        return (number == 1) ? 1 : 0;
    }

}
