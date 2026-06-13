public class ArithmeticOperators {
    public static void main(String args[]){
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        // type promotion in arithmetic operations
        int x = 10;
        double y = 5.5;
        double result = x + y; // int is promoted to double
        System.out.println("Result of x + y: " + result);       

        int result1 = a / 3; // integer division, result is truncated
        System.out.println("Result of a / 3: " + result1); // result is 3, not 3.3333   
        long resultz = a / 3l; // long division, result is promoted to long
        System.out.println("Result of a / 3l: " + resultz); //

        // operator precedence
        int result2 = a + b * 2; // multiplication has higher precedence than addition
        System.out.println("Result of a + b * 2: " + result2);  


        int result3 = (a + b) * 2; // parentheses change the precedence
        System.out.println("Result of (a + b) * 2: " + result3);

        // increment and decrement operators
        int c = 10;
        c++; // post-increment
        System.out.println("Post-increment: " + c); // c is now 11
        ++c; // pre-increment
        System.out.println("Pre-increment: " + c); // c is now 12
        c--; // post-decrement
        System.out.println("Post-decrement: " + c); // c is now 11
        --c; // pre-decrement
        System.out.println("Pre-decrement: " + c); // c is now 10

        // compound assignment operators
        int d = 10;
        d += 5; // equivalent to d = d + 5
        System.out.println("After += 5: " + d); // d is now
        d -= 3; // equivalent to d = d - 3
        System.out.println("After -= 3: " + d); // d is now
        d *= 2; // equivalent to d = d * 2
        System.out.println("After *= 2: " + d); // d is now
        d /= 4; // equivalent to d = d / 4
        System.out.println("After /= 4: " + d); // d is now
        d %= 3; // equivalent to d = d % 3
        System.out.println("After %= 3: " + d); // d is now

        // operator associativity
        int result4 = a - b - 2; // left-to-right associativity for
        System.out.println("Result of a - b - 2: " + result4); // (a - b) - 2
        int result5 = a / b / 2; // left-to-right associativity for
        System.out.println("Result of a / b / 2: " + result5); // (a / b) / 2
        
        int result6 = a * b * 2; // left-to-right associativity for
        System.out.println("Result of a * b * 2: " + result6); // (a * b) * 2
        int result7 = a + b + 2; // left-to-right associativity for
        System.out.println("Result of a + b + 2: " + result7); // (a + b) + 2

    }
}
