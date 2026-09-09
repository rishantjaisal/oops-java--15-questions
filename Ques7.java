package Java_OOPS_Program;

import java.util.Scanner;

class Number {
    private double value;

    Number(double value) {
        this.value = value;
    }

    boolean isZero() {
        return value == 0;
    }

    boolean isPositive() {
        return value > 0;
    }

    boolean isNegative() {
        return value < 0;
    }

    boolean isOdd() {
        return value % 2 != 0;
    }

    boolean isEven() {
        return value % 2 == 0;
    }

    boolean isPrime() {
        if (value < 2 || value != Math.floor(value)) {
            return false;
        }

        int n = (int) value;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    boolean isAmstrong() {
        if (value < 0 || value != Math.floor(value)) {
            return false;
        }

        int n = (int) value;
        int temp = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == n;
    }
}

class NumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double value = sc.nextDouble();

        Number n = new Number(value);

        System.out.println("Zero = " + n.isZero());
        System.out.println("Positive = " + n.isPositive());
        System.out.println("Negative = " + n.isNegative());
        System.out.println("Odd = " + n.isOdd());
        System.out.println("Even = " + n.isEven());
        System.out.println("Prime = " + n.isPrime());
        System.out.println("Amstrong = " + n.isAmstrong());
    }
}
