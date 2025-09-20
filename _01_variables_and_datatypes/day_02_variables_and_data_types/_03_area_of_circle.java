import java.util.*;

public class _03_area_of_circle {
     @SuppressWarnings("ConvertToTryWithResources")
     public static void main(String args[]) {
     Scanner sc  = new Scanner(System.in);
     System.out.print("Enter the value of the radius of circle:");
     double a = sc.nextInt();
     double area = 3.14*a*a;
     System.out.print("The radius of circle is :" + area);
     sc.close();
     }
     
}
