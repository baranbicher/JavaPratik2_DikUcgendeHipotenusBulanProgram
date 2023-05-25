import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            /*  Scanner hip = new Scanner(System.in);
        int a, b;
        double c;
        System.out.print("1. Kenarı Yazın: ");
        a = hip.nextInt();
        System.out.print("2.Kenarı Yazın: ");
        b = hip.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Üçgenin Hipotenüsü: " + c);
            */

        Scanner alan = new Scanner(System.in);
        double Alan, cevre;
        int a, b, c, u;
        System.out.print("1. Kenarı Yazın: ");
        a = alan.nextInt();
        System.out.print("2. Kenarı Yazın: ");
        b = alan.nextInt();
        System.out.print("3. Kenarı Yazın: ");
        c = alan.nextInt();

        u = (a+b+c)/2;
        System.out.println("Ügenin u Değeri: " + u);

        cevre = 2 * u;
        System.out.println("Üçgenin Çevresi: " + cevre);

        Alan  = Math.sqrt(u * ( u - a ) * ( u - b ) * ( u - c ));
        System.out.println("Üçgenin Alanı: " + Alan);




    }
}