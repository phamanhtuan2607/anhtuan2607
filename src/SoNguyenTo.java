import java.util.Scanner;

public class SoNguyenTo {
    public boolean songuyento(int n)
    {
        if(n<2) return false;
        for(int i = 2; i<= Math.sqrt(n); i++)
            if(n%i == 0) return false;

        return true;
    }
    public static void main(String[] args)
    {
        SoNguyenTo a = new SoNguyenTo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập n : ");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(a.songuyento(i))
            {
                System.out.println("các số nguyên tố nhỏ hơn" + n + " là "  +i);
            }
        }

        scanner.close();
    }
}
