public class blackJack {

    public static void main(String[] args) {

        System.out.print(blackJac(22, 21));

    }

    public static int blackJac(int y, int x) {
        int sum = 0;
        if (x == 0 && y == 0 || x > 21 || y > 21) {
            sum = 0;
        } else if (x >= y) {
            sum = x;

        } else if (y >= x) {
            sum = y;
        }
        return sum;
    }

}
