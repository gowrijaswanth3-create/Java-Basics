// method are a set of instructions that perform a specific task.
// method overloading is a feature that allows a class to have more than one method with the same name, but with different parameters (number, type, or order of parameters).
// static method can be called without creating an object of the class, while instance method requires an object to be called.
// static variable is shared among all instances of the class, while instance variable is unique to each instance of the class.




public class MethodOverloading {
    // Overloaded method with two integer parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with two double parameters
    public static double add(double a, double b) {
        return a + b;
    }

    // Overloaded method with two String parameters
    public static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the overloaded methods
        int sum1 = add(5, 10);
        double sum2 = add(5.5, 10.5);
        String sum3 = add("Hello, ", "World!");

        // Printing the results
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        System.out.println("Concatenated strings: " + sum3);
    }
}
