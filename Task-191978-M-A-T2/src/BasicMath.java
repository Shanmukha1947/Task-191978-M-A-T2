public class BasicMath {
    public static void main(String[] args){
        double a = 10.0;
        double b = 20.0;
        double sum = add(a, b);
        double difference = subtract(a, b);
        double product = multiply(a, b);
        double quotient = divide(a, b);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }
}

