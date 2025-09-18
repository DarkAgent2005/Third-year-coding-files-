
import java.util.*;
public class _02_taking_input {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
     Scanner sc  = new Scanner(System.in);
     System.out.print("Enter the value of a :");
     int a = sc.nextInt();
     System.out.print("Enter the value of b :");
     int b = sc.nextInt();
     int sum = a+b;
     System.out.print("The addition of two numbers is :" + sum);
     sc.close();

    }
}
