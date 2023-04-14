/* Suppose that we create an Array A of GameEntery objects, which has an integer scores field, once we clone A and store the result in the array B if we imadetely set A[4]. Score equal to 550, what is the score value of the GameEntery objects referenced by B[4]?  */
class ReinforcementP2{
    public static void main(String[] args){
        Assigner[] myArrayA = {
            new Assigner(55),
            new Assigner(66),
            new Assigner(77),
            new Assigner(88),
            new Assigner(99),
        };
    }    
}
class Assigner{
    private int value;
    public Assigner(int score){
        this.value = score;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int score){
        this.value = score;
    }
}