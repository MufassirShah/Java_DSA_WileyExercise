/*Write a short Java method that uses a StringBuilder instance to remove all the punctuations from a string s storing a sentence, for example, transforming the string "Let's try, Mike!" to "Lets try Mike" */
public class ReinforcementP8{
    public static void main(String []args){   
        System.out.println(puncCleaner("Let's try, Mike!"));
    }
    public static String puncCleaner(String s){
        String updatedString = s.replaceAll("\\p{P}", "");
        return updatedString;
    }
}
