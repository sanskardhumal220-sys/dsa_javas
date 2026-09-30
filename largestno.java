import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int largest = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit > largest) {
                largest = digit;
            }

            n /= 10;
        }

        System.out.println(largest);

        sc.close();
    }
}