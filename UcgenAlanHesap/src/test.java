import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int kenar1,kenar2,kenar3;
        Scanner input = new Scanner(System.in);
        System.out.println("1.kenar:");
        kenar1 = input.nextInt();
        System.out.println("2.Kenar:");
        kenar2 = input.nextInt();
        System.out.println("3.Kenar:");
        kenar3 = input.nextInt();

        int cevre = kenar1+kenar2+kenar3;
        float u = cevre/ 2;
        double formul = u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        double alan = Math.sqrt(formul);

        System.out.println("Üçgenin alanı:" + alan);


    }
}
