import java.util.Scanner;
   public class round {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int count = 0;
       int temp = n;
       int place = 1;
       int digit = 0;
           while(temp>0){
            digit = temp % 10;
            if(digit!=0){
                count++;
                System.out.println(count);
                
            }
                temp = temp /10;
                if(temp > 0) {
                    place = place * 10;
                }
             
        }
        System.out.println(place*digit);

            
           
               
           }
           }
        
    