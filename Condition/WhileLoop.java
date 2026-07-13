package Condition;
import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range");
        int Range=sc.nextInt();
        int counter=1;
        while(counter<=Range){
            System.out.println(counter);
            counter++;
        }

        for(int i=0;i<10;i++){
            System.out.println("hello shubham");
        }
    }
    
}
