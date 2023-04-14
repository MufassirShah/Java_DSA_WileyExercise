/* Suppose that we create an Array A of GameEntery objects, which has an integer scores field, once we clone A and store the result in the array B if we imadetely set A[4]. Score equal to 550, what is the score value of the GameEntery objects referenced by B[4]?  */
public class ReinforcementP1{
    public static void main(String []args){
        GameEntery[] arrayA = {
            new GameEntery(100),
            new GameEntery(66),
            new GameEntery(55),
            new GameEntery(77),
            new GameEntery(99),
        };
        GameEntery[] arrayB = arrayA.clone();
        arrayA[4].setScore(550); 
        System.out.println(arrayB[4].getScore()); 
    }
}
 class GameEntery{
    private int score;
    public GameEntery(int input){
        this.score = input;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
}