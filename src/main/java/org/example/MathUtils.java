package org.example;

import java.math.BigInteger;

public class MathUtils {

    // This library has common math equations, including some using the built-in Java Math function. Some are very simple but for the sake of the assignment I added them.

    // Calculate the factorial based on if the given number for n is 20 or smaller, or larger.
    // Start
    public static Object factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("The number must be positive"); // Handle an invalid input of zero or less.

        // Use long for n <= 20, otherwise use BigInteger
        if (n <= 20) {
            return factorialLong(n);
        } else {
            return factorialBigInt(n);
        }
    }

    // Use Long for the calculation
    private static Long factorialLong(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    // Use a BigInteger for the calculation
    private static BigInteger factorialBigInt(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // End factorial calculation code

    // Calculate using exponentiation using a given base and exponent
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Calculate the greatest common divisor between two numbers using Euclid's method
    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

    // calculate square root
    public static double squareRoot(double n) {
        if ( n < 0) throw new IllegalArgumentException ("The number cannot be negative");
        return Math.sqrt(n);
    }
}
