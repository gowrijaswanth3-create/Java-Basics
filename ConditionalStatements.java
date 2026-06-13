public class ConditionalStatements {
    public static void main(String args[]){
        int a = 10;
        int b = 20;

        // If statement
        if (a > b) {
            System.out.println("a is greater than b");
        }

        // If-else statement
        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is not less than b");
        }

        // If-else if-else statement
        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        
        //ternary operator
        String result = (a > b) ? "a is greater than b" : "a is not greater than b";
        System.out.println(result);

    }
}
