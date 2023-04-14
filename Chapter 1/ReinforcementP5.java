/* Write a short Java method that takes an integer n and return the sum of all even positive integers less than or equal to n */
import java.util.Scanner;

public class ReinforcementP5 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Please Enter The value: ");
        n = scanner.nextInt();
        scanner.close();
        System.out.println(inputMethod(n));
    }
    public static int inputMethod(int n){
        int sum=0;
        for(int i=2; i<=n; i+=2){
            if(i%2==0)
            sum+=i;
        }
        return sum;
    }
    
}
