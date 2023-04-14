import java.util.Scanner;

/* Write a short java method, isMultiple that takes two long values, n and m, and returns true if and only if n is multiple of m, that is n=mi for some integer? */
import java.util.Scanner;
public class ReinforcementP2{
    public static void main(String []args){
        long value1;
        long value2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The First Input: ");
        value1 = scanner.nextInt();
        System.out.println("Please Enter The Second Input: ");
        value2 = scanner.nextInt();  
        System.out.println(isMultiple(value1,value2));  
    }

    public static boolean isMultiple(long value1 , long value2){
        if(value1 % value2 == 0)
            return true;
        else
            return false;
    }
}