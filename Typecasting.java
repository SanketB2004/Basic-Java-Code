public class Typecasting {
    public static void main(String[] args) {

        System.out.println("Type Cadsting");

        // Automatic Casting
        float fvar = 35.45f;
        double dvar = fvar;
        System.out.println(dvar);

        // Manual Casting

        long lvar = (long) fvar;
        System.out.println(lvar);

        // Advance Casting

        // Pimi...to Non primitive

        int a = 2;
        String str = String.valueOf(a);
        System.out.println(str + str);
        System.out.println(a + a);

        // non-primitive to primitive
        String b = "2";

        int num = Integer.parseInt(b);
        System.out.println(num);
        System.out.println(num + num);

    }
}
