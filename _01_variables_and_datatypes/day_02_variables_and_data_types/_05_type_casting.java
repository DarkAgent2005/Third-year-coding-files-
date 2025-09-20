






public class _05_type_casting {
   public static void main(String[] args){
    float a = 5.12f;
    // int b = a; not possible data loss msg comes
    int b = (int) a;
    System.out.println(b);
    char ch1 = 'a';
    char ch2 = 'b';
    
    int num1 = (int) ch1;
    int num2 = ch2;
    System.out.println(num1);
    System.out.println(num2);
    // similarly c is 99 
   }
}
