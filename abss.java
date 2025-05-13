public class abss {
    public static void main(String[] args) {
        userdetails u = new userdetails();
        u.userdetails();
        u.userlogin();
       
    }
}

abstract class vehicle{
        abstract void complyregl();
        abstract void checkcapacity();
    }

    class car extends vehicle{
        @Override
        void complyregl(){
            System.out.println("complyregl method of car class");
        }

        @Override
        void checkcapacity(){
            System.out.println("checkcapacity method of car class");

        }
    }


    interface user {
        void userdetails();
        void userlogin();
    }

    class userdetails implements user{
        @Override
        public void userdetails(){
            System.out.println("userdetails method of user class");
        }
        @Override   
        public void userlogin(){
            System.out.println("userlogin method of user class");
        }
    }