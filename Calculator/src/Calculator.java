public class Calculator {

    public static void main(String[] args) {

        calculatorAdd(4, 8, 4);
        calculatorSub(4, 8, 4);
        calculatorMultiply(4, 8, 4);
        calculatorDivide(4, 8, 4);

    }

    public static void calculatorAdd(int a, int b, int c) {

        if (a + b == c) {
            System.out.println(a + "+" + b + "=" + c);
        } else {
            System.out.println();
        }
        if (a + c == b) {
            System.out.println(a + "+" + c + "=" + b);
        } else {
            System.out.println();
        }
        if (c + b == a) {
            System.out.println(c + "+" + b + "=" + a);
        } else {
            System.out.println();
        }

    }

    public static void calculatorSub(int a, int b, int c) {

        if (a - b == c) {
            System.out.println(a + "-" + b + "=" + c);
        } else {
            System.out.println();
        }
        if (a - c == b) {
            System.out.println(a + "-" + c + "=" + b);
        } else {
            System.out.println();
        }
        if (c - b == a) {
            System.out.println(c + "-" + b + "=" + a);
        } else {
            System.out.println();
        }

    }

    public static void calculatorMultiply(int a, int b, int c) {

        if (a * b == c) {
            System.out.println(a + "*" + b + "=" + c);
        } else {
            System.out.println();
        }
        if (a * c == b) {
            System.out.println(a + "*" + b + "=" + c);
        } else {
            System.out.println();
        }

    }

    public static void calculatorDivide(int a, int b, int c) {

        if (a / b == c) {
            System.out.println(a + "/" + b + "=" + c);
        } else {
            System.out.println();
        }
        if (a / c == b) {
            System.out.println(a + "" + b + "=" + c);
        } else {
            System.out.println();
        }

    }

}
