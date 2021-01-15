import java.util.Scanner;

public class vleramax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sheno Numrin 1");

        int firstNum = sc.nextInt();

        System.out.println("Sheno Numrin 2");

        int secondNum = sc.nextInt();

        int vleraMax = firstNum > secondNum ? firstNum : secondNum;

        System.out.println("Numri maksimal eshte " + vleraMax);

        sc.close();
    }
}