public class encapsule {
    public static void main(String[] args) {
       Encap e= new Encap(11,"sanjay","23423","saveetha");
       e.setAge(101);
       System.out.println(e.getAge()); 
    }
    
}
class Encap{
    private int age;
    private String name;
    private String phno;
    private String address;
    
    Encap (int age,String name,String phno,String address){
        this.age=age;
        this.name=name;
        this.phno=phno;
        this.address=address;
    }
    public int getAge() {

        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhno() {
        return phno;
    }
    
    public void setPhno(String phno) {
        this.phno = phno;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}
