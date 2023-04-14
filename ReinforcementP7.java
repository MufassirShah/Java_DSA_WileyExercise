import java.util.Scanner;

public class ReinforcementP7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The String: ");
        String s;
        s = scanner.nextLine();
        System.out.println(myMethod(s));


    }
    public static String myMethod(String s){
        char[] myArr = s.toCharArray();
        String myResult = "";
        for(int i=0; i<myArr.length;i++)
        {
            if( myArr[i] == 'A' ||
                myArr[i] == 'a' ||
                myArr[i] == 'e' ||
                myArr[i] == 'E' ||
                myArr[i] == 'i' ||
                myArr[i] == 'I' ||
                myArr[i] == 'o' ||
                myArr[i] == 'O' ||
                myArr[i] == 'u' ||
                myArr[i] == 'U')
                myResult += (myArr[i] + " ");
        } 
        return myResult;
    }
}
