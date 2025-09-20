
import java.util.*;
public class _04_type_conversion {
    public static void main(String args []) {
       Scanner sc = new Scanner (System.in);
       @SuppressWarnings("unused")
       float num = sc.nextInt();  
       //int a = sc.nextFloat();  not acceptable

       int c=2;
       @SuppressWarnings("unused")
       long b =c;
// vice versa not acceptable
    }
}
