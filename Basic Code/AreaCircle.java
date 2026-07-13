import java.util.*;
public class AreaCircle {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Radius Of Circle: ");
       double rad=sc.nextDouble();
       double area=3.14*(rad*rad);
       System.out.println("Area of circle is: "+area);
   } 
}
