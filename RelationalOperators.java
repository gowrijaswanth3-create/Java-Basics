public class RelationalOperators {
    public static void main(String args[]){
        int a = 10;
        int b = 20;

        // Equal to
        boolean isEqual = (a == b);
        System.out.println("Is a equal to b? " + isEqual);

        // Not equal to
        boolean isNotEqual = (a != b);
        System.out.println("Is a not equal to b? " + isNotEqual);

        // Greater than
        boolean isGreaterThan = (a > b);
        System.out.println("Is a greater than b? " + isGreaterThan);

        // Less than
        boolean isLessThan = (a < b);
        System.out.println("Is a less than b? " + isLessThan);

        // Greater than or equal to
        boolean isGreaterThanOrEqualTo = (a >= b);
        System.out.println("Is a greater than or equal to b? " + isGreaterThanOrEqualTo);

        // Less than or equal to
        boolean isLessThanOrEqualTo = (a <= b);
        System.out.println("Is a less than or equal to b? " + isLessThanOrEqualTo);
    }
}
