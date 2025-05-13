public class polymorphism2 {
    public static void main(String[] args) {
        Anil anil=new Anil();
        anil.makesounds();
    }
}
    class Animal{
        public void makesound() {
            System.out.println("Animal sound");
        }
    
    }
    class Anil extends Animal{
        //@Override
        public void makesounds() {
            System.out.println("keech keech");
        }
    }

