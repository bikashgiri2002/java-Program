package collegeProject;

import java.util.Scanner;

public class Interest {
    float p,t,r,amt,interest;
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        p=sc.nextFloat();
        System.out.println("Enter the Time: ");
        t=sc.nextFloat();
    }
    void cal(){
        if (t <= 1){
            r=6.5f;
        }
        else if(t>1 && t<=2){
            r=7.5f;
        }
        else if(t>2 && t<=3){
            r=8.5f;
        }
        else{
            r=9.5f;
        }
        interest=(p*t*r)/100;
        amt=p+interest;
    }
    void display(){
        System.out.println("principal amount\tInterest\tAmount");
        System.out.println();
        System.out.printf("%10.2f\t%10.2f\t%10.2f\n",p,interest,amt);
    }
}
