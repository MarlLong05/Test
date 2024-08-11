public class Bai_4_PhepToan {
    public static void main(String[] args) {
        int i1 = 2 ;
        int i2 = 5;
        int i3 = -3;
        double d1 =2;
        double d2 =5;
        double d3 = -0.5;
        //a
        System.out.println("cau a = "+(i1+(i2*i3)));
        System.out.println("cau b ="+(i1*(i2+i3)));
        System.out.println("cau c= "+(i1/(i2+i3)));
        System.out.println("cau d = "+((float)(i1/(i2+i3))));
        System.out.println("cau g = "+((float)((3+4+5)/3)));
        System.out.println("cau i = "+((float)(3+4+5/3)));
        //
        System.out.println("cau k = "+(d1+(d2*d3)));
        System.out.println("cau l = "+(d1+d2*d3));
        System.out.println("cau m = "+((d1/(d2-d3))));
        System.out.println("cau n = "+((d1+d2+d3)/3));
        System.out.println("cau k = "+(d1+d2+(d3/3)));
        System.out.println("cau q = "+(3*(d1+d2)*(d1-d3)));

    int a = 10 ;
    int b = 11;
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a!=b);
        System.out.println(a<=b);
    }
}
