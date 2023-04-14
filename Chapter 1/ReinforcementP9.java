public class ReinforcementP9{
    public static void main(String[] args) {
        
    }
    public class Flower{
        private String name;
        private int petals;
        private float price;

        public Flower(String name,int petals,float price)
        {
            this.name=name;
            this.petals=petals;
            this.price=price;
        }
        public void setName(String name){this.name=name;}
        public void setPetals(int petals){this.petals= petals;}
        public void setPrice(int price){this.price= price;}

        public String getName(){return name;}
        public int getPetals(){return petals;}
        public float getPrice(){return price;}

    }
}