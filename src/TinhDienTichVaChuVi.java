import java.util.Scanner;

public class TinhDienTichVaChuVi {
    public static double tinhDienTichHinhTron(double r)
    {
        return r * r * 3.14;
    }
    public static double tinhChuViHinhTron(double r)
    {
        return r * 2 * 3.14;
    }
    public static double tinhDienTichHinhChuNhat(double cd, double cr)
    {
        return cd * cr;
    }
    public static double tinhChuViHinhChuNhat(double cd, double cr)
    {
        return (cd + cr)*2;
    }
    public static double tinhChuViTamGiac(double a, double b,double c)
    {
        double cv ;
        return cv = a+b+c ;
    }
    public static double tinhDienTichTamGiac(double a, double b,double c)
    {
        double nuacv= tinhChuViTamGiac(a,b,c)/2;
        return Math.sqrt(nuacv * (nuacv - a) * (nuacv - b) * (nuacv - c));
    }
    public static void main(String[] args)
    {
        double r,cd,cr,a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        cd = scanner.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        cr = scanner.nextDouble();
        System.out.println("diện tích hình chữ nhật là: " + tinhDienTichHinhChuNhat(cd,cr));
        System.out.println("chu vi hình chữ nhật là: " + tinhChuViHinhChuNhat(cd,cr));
        System.out.println("Nhập bán kính hình tròn: ");
        r = scanner.nextDouble();
        System.out.println("Diện tích hình tròn là: " + tinhDienTichHinhTron(r));
        System.out.println("Chu vi hình tròn là: "+ tinhChuViHinhTron(r));
        System.out.println("Nhập cạnh a tam giác: ");
        a = scanner.nextDouble();
        System.out.println("Nhập cạnh b tam giác: ");
        b = scanner.nextDouble();
        System.out.println("Nhập cạnh c tam giác: ");
        c = scanner.nextDouble();
        System.out.println("chu vi tam giác là: " + tinhChuViTamGiac(a,b,c));
        System.out.println("chu vi tam giác là: " + tinhDienTichTamGiac(a,b,c));
        scanner.close();
    }
}
