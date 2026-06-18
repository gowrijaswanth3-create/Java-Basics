// class is a blueprint for creating objects. 
// It defines the properties (variables) and behaviors (methods) that the objects created from the class will have. 
// An object is an instance of a class, and it can have its own unique values for the properties defined in the class.
// jvm creates an object of the class and allocates memory for it.



public class ClassNObjects {
    public static void main(String[] args) {
        // Create an object of the class
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // Accessing instance variables and methods
        obj1.instanceVariable = 10;
        obj2.instanceVariable = 20;

        System.out.println("Object 1 instance variable: " + obj1.instanceVariable);
        System.out.println("Object 2 instance variable: " + obj2.instanceVariable);

        // Calling instance method
        obj1.instanceMethod();
        obj2.instanceMethod();
    }
}

class MyClass {
    // Instance variable
    int instanceVariable;

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method. Instance variable value: " + instanceVariable);
    }
}
