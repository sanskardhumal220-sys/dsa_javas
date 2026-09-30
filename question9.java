import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int mySum = 0;

        // Sorting the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int count = 0;
        int total = 0;

        // Calculate total sum
        for (int j : arr) {
            total = total + j;
        }

        // Take largest elements
        for (int i = arr.length - 1; i > 0; i--) {

            count = count + 1;
            mySum = mySum + arr[i];

            if (mySum > total / 2.0) {
                break;
            }
        }

        System.out.println(count);

        sc.close();
    }
}