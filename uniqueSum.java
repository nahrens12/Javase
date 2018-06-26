public class uniqueSum {
    public static void main(String[] args) {


        System.out.println(uniqueSu(3, 4, 5));
    }
        public static int uniqueSu(int a, int b, int c) {
            if (a == b && b == c) {
                return 0;
            } else if (a != b && b != c && c != a) {
                return a + b + c;
            } else if (a == b) {
                return c;
            } else if (b == c) {
                return a;
            } else if (c == a) {
                return b;
            }
            return 0;

        }
    }

