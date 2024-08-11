public class Bai_3_Epkieu {
    public static void main(String[] args) {
        // int -> double ép kiểu rộng
        int a = 10;
        int b = 20 ;
        double c = a/b; // chưa ép kiểu
        System.out.println(c);

        int d = 10;
        int e = 20 ;
        double f = (double)a/b; // ép kiểu số thực
        System.out.println(f);

        // int -> byte ép kiểu hẹp
        int x = 10;
        byte y =(byte) x; // ép kiểu int sang byte
        System.out.println(x);
        System.out.println(y);

    }
}
