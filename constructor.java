public class constructor {
    public static void main(String[] args) {
        wooberuser woo= new wooberuser(20,"sanjay","0955","sanveeetha");
        woo.address="sasasasasasasa";

    }
}
class wooberuser{
    int age;
    String name;
    String phno;
    String address;
    wooberuser(){
        System.out.println("cons called");
    }
    wooberuser(int a, String n, String p, String ad){
        this.age=a;
        this.name=n;
        this.phno=p;
        this.address=ad;
    }
}
