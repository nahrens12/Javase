public class HelloWorld2 {
    public static void main(String[] args) {


       System.out.println("hello world");

        String name1 = "hel world";

        System.out.println(name1);

        method1();
        System.out.println(method2());

       method3("nath");
        System.out.println(math(2, 3));
       System.out.println(math(4, 4));
        array();
       array2();



    }

    public static void method1() {
        System.out.println("h world");


    }

   public static String method2() {
        return "world";
   }

    public static void method3(String name) {
        System.out.println("Hello" + name);
    }

    public static int math(int a, int b) {
        boolean iTest = true;

       if (a == 0) {
           if (iTest) {
            }
            return a + b;
       } else {

            return a * b;
        }
   }

    static void array() {
        int[] arrayOfInts = {1, 2, 3, 4, 5, 6,};

       System.out.println(arrayOfInts[2]);

        for (int i = 0; i < arrayOfInts.length; i++) {
           System.out.println(arrayOfInts[i] + "");
       }
    }

    static void array2() {
        int numb[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       for (int i : numb) {
           System.out.println("Number:" + i);
        }
       for (int i : numb) {

            int b = i * i;
           System.out.println("Number:" + b);
       }
  }




}













