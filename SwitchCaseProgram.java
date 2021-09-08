import java.util.Scanner;
class SwitchStatements {
    public static void main(String[] args) {
        int age;
       System.out.println("enter your age");
       Scanner sc= new Scanner(System.in);
       age= sc.nextInt();
       switch (age){
           case 18:
               System.out.println("you're going to become adult");
               break;
            case 23:
                System.out.println("you're going to join a job");
                break;
            case 60:
                System.out.println("you're going to get retired");
                break;
            default:
            System.out.println("enjoy!");
       }
       System.out.println("thanks");
    }
}
