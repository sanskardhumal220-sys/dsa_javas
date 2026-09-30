import java.util.Scanner;
public class elephant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       
        int steps = n / 5; 
        
        
        if (n % 5 != 0) {
            steps++; 
        }
        
        System.out.println(steps);
        sc.close();
    }
}

// import java.util.Scanner;
// public class elephant {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int steps = 0;
//         while (n>0){
//             if (n>5){
//                 int z = n / 5;
//                 steps += z;
//                 n = n % 5;
//             }
//             else{
//                 steps += n;
//                 n = 0;
//             }
//         }
//         System.out.println(steps);
//     }
// }

