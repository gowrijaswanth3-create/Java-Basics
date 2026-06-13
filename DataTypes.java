// data types - primitives and non-primitives
// primitives are predefined by the language and named by a reserved keyword. They represent simple values and are stored directly in memory. 
// Non-primitives, also known as reference types, are more complex data structures that can store multiple values and are accessed through references.
// primitives - > byte, short, int, long, float, double, char, boolean
// non-primitives - > String, Arrays, Classes, Interfaces, etc

public class DataTypes {
    public static void main(String args[]){
        // byte - 1 byte -128 to 127
        byte b = 100;
        System.out.println("Byte value: " + b);

        // short - 2 bytes -32768 to 32767
        short s = 10000;
        System.out.println("Short value: " + s);

        // int - 4 bytes -2147483648 to 2147483647
        int i = 100000;
        System.out.println("Int value: " + i);

        // long - 8 bytes -9223372036854775808 to 9223372036854775807
        long l = 10000000000L; // L is used to indicate long literal
        System.out.println("Long value: " + l);

        // float - 4 bytes -3.4028235E38 to 3.4028235E38
        float f = 3.14f; // f is used to indicate float literal
        System.out.println("Float value: " + f);

        // double - 8 bytes -1.7976931348623157E308 to 1.7976931348623157E308
        double d = 3.141592653589793;
        System.out.println("Double value: " + d);

        // char - 2 bytes -0 to 65535 (Unicode characters)
        char c = 'A';
        System.out.println("Char value: " + c);

        // boolean - 1 bit true or false
        boolean bool = true;
        System.out.println("Boolean value: " + bool);
    }
}
