package oops;

public class GetterAndSetter {
    public static void main(String[] args) {
        Bank c1 , c2;
        c1=new Bank();
        c2=new Bank();
        c1.user_id="jinu";
        c2.user_id="biku";

        c1.setPassword("bikash");
        c2.setPassword("jinu");

        System.out.println("user id : "+c1.user_id+ ", password : "+c1.getPassword());
        System.out.println("user id : "+c2.user_id+ ", password : "+c2.getPassword());
    }
}
class Bank{
    String user_id;
    private String password;
    void setPassword(String password){
        this.password =password;
    }
    String getPassword(){
        return this.password;
    }
}
