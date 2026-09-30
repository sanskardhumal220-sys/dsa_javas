import java.util.Scanner;

public class question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
       for(i=2;i<n-1;i++){
        if(n%1==0){
            count++;
        
        }
        if(count==0){
            System.out.println("yes");

        }else{
            System.out.println("no");
        }
       }
    }
}