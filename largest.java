// Q3. Find the Largest Digit
// Problem
// Given a positive integer N, find the largest digit present in the number.


// Example

// Input
// 58329

// Output
// 9
import java.util.Scanner;
public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int largest = 0;
        do{
            int digit=n%10;
            if(largest<digit){
               largest=digit;
            }
            n=n/10;
        }while(n>0);
                System.out.println(largest);
               
    }
}