import java.util.*;
public class Condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double age=19;
        if(age>=18){
            System.out.println("allow for voting");
        }else{
            System.out.println("not allow");
        } 
//largest number
        int a=16;
        int b=10;
        if (a>=b) {
            System.out.println("A is largest");
        } else {
           System.out.println("B is largest"); 
        }
// even odd
        System.out.println("Enter  number to check even odd");
        int num=sc.nextInt();
        if (num%2==0) {
            System.out.println("Number is Even: "+num);
        } else {
            System.out.println("Number is odd: "+num);
        }

    } 
}
