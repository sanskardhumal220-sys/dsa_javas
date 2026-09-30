/ Q2. Count Even and Odd Digits
// Problem
// Given a positive integer N, count how many even digits and odd digits are present in the number.


// Example

// Input
// 123456


// Output
// Even: 3
// Odd: 3
// import java.util.Scanner;

public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int evencount=0;
        int oddcount = 0;
        do{
            int remainder=n%10;
            if(remainder%2==0){
               evencount+=1;
            }
            
             else{
                  oddcount+=1;
            }
            n=n/10;
        }while(n>0);
                System.out.println("even : "+ evencount);
                System.out.println(oddcount);
            
    }
}