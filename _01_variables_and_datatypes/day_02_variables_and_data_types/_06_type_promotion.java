

public class _06_type_promotion{
    public static void main(String[] args) {
        char a = 'a';
        byte b = 3 ;
        short c = 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a+b-c);
        // Always remember to find out the type use a wrong declaration to we would found out what losssy conversion is done ultimately finding out data type
        // char d = a+b-c;
        byte d = 6;
        //d = d*2;
        d = (byte) (d * 2);
        System.out.println(d);
    }

}