public class inheritance {
    public static void main(String[] args) {
      Driver driver = new Driver();
      User user = new User();
      driver.phno = "1234567890";
      user.parentwelcome();
    }
    
}

class wooberuser
{
    int id;
    String name;
    int age;
    String address;
    String phno;

    public void welcome()
    {
        System.out.println("Welcome to Woober User");
    }
}

class Driver extends wooberuser
{
    String vehiclename;
    int vehicleno;
    String phno;
   public void welcome()
    {
        System.out.println("Welcome,drive safe");
    }
}  
class User extends wooberuser
{
 
    String petname;
 
public void parentwelcome ()
{
    super.welcome(); 
}
}
             