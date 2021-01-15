import java.util.Scanner;
public class Katrori{
    public static void main(String[] args) {
        float a;
        float b;

        Scanner sc =new Scanner(System.in);
        System.out.println("Shtyp vleren a:");
        a = sc.nextFloat();

        System.out.println("Shtyp vleren b:");
        b = sc.nextFloat();

        float siperfaqja = (2*a)+(2*b);

        System.out.println(siperfaqja);
    }
}