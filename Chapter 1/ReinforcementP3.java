import java.util.Scanner;

/*Write a short Java method, isOdd, that takes an int i and return true of and only if i is odd, Your method can not use the multiplication, division, or modulus operator however */
public class ReinforcementP3 {
    public static void main(String []args){
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        i = scanner.nextInt();
        System.out.println(isOdd(i));
    }
    
        public static boolean isOdd(int i){
            if((i & 1) == 1);
            return true;

        }
    
}
