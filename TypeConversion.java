public class TypeConversion {
    public static void main(String args[]){
        // Implicit Type Conversion (Widening)
        int i = 100;
        long l = i; // int to long
        float f = l; // long to float
        System.out.println("Implicit Type Conversion: " + f);

        // Explicit Type Conversion (Narrowing)
        double d = 100.04;
        long l2 = (long) d; // double to long
        int i2 = (int) l2; // long to int
        System.out.println("Explicit Type Conversion: " + i2);
    }
}
