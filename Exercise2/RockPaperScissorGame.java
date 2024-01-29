package Exercise2;
import java.util.*;
public class RockPaperScissorGame {
    public static void main(String[] args) {
        Random ran=new Random();
        Scanner sc=new Scanner(System.in);
        char turn='y';
        while( turn == 'y'){
            //win count
            int user=0;
            int computer=0;
            //turn count
            int i=0;
            while(i<5){
                int com=ran.nextInt(3);//computer choose
                System.out.println("'0' for rock, '1' for paper, '2' for scissor");
                System.out.print("Enter your Choose: ");
                int choose=sc.nextInt();//user choose
                System.out.println("computer choose: "+com);
                switch (choose){
                    case 0:
                        if(com==0)
                            System.out.println("Draw! user ="+user+", computer = "+computer);
                        if (com==2){
                            user++;
                            System.out.println("User Win! user ="+user+", computer = "+computer);
                        }
                        if (com==1){
                            computer++;
                            System.out.println("computer win! user ="+user+", computer = "+computer);
                        }
                        break;
                    case 1:
                        if(com==1)
                            System.out.println("Draw! user ="+user+", computer = "+computer);
                        if (com==0){
                            user++;
                            System.out.println("User Win! user ="+user+", computer = "+computer);
                        }
                        if (com==2){
                            computer++;
                            System.out.println("computer win! user ="+user+", computer = "+computer);
                        }
                        break;
                    case 2:
                        if(com==2)
                            System.out.println("Draw! user ="+user+", computer = "+computer);
                        if (com==1){
                            user++;
                            System.out.println("User Win! user ="+user+", computer = "+computer);
                        }
                        if (com==0){
                            computer++;
                            System.out.println("computer win! user ="+user+", computer = "+computer);
                        }
                        break;
                    default:
                        System.out.println("invalid choose");
                }
                i++;
            }
            //result after 5 turn
            if (user>computer)
                System.out.println("User wins");
            else if (computer>user)
                System.out.println("computer win");
            else
                System.out.println("match draw");
            //to try again
            System.out.print("Enter 'y' to try again: ");
            turn=sc.next().charAt(0);
        }
        System.out.println("Thanks! for trying our game");
    }
}
