/* Write a short Java method that takes an integer n and return the sum of the square all even positive integers less than or equal to n */
import java.util.Scanner;

public class ReinforcementP6 {
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
            sum+=Math.pow(i,2);
        }
        return sum;
    }
    
}
