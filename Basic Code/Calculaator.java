import java.util.*;
public class Calculaator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Value: ");
        double num1=sc.nextDouble();

        System.out.print("Enter Second Value: ");
        double num2=sc.nextDouble();

        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("Exit type 0");
        System.out.print("Choose Operation: ");
        char oprator=sc.next().charAt(0);


        switch(oprator){
            case '+':{
                System.out.println(num1+num2);
                break;
            }
            case '-':{
                System.out.println(num1-num2);
                break;
            }
            case '*':{
                System.out.println(num1*num2);
                break;
            }
            case '/':{
                System.out.println(num1/num2);
            }
            case '0':{
                break;
            }
            default:{
                System.out.println("wrong Operator");
            }
        }

        
    }
    
}
