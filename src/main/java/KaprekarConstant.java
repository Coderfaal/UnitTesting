
import java.util.Arrays;
import java.util.Scanner;

public class KaprekarConstant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int kConstant = 6174;
        int steps = 0;

        while (num != kConstant) {
            num = checkConstant(num);
            steps++;
            System.out.println("Step " + steps + ": " + num);
        }

        System.out.println("Reached Kaprekar's constant (" + kConstant + ") in " + steps + " steps.");
    }

    static int checkConstant(int num) {

        String s = String.format("%04d", num);
        char[] digits = s.toCharArray();

        Arrays.sort(digits);
        int asc = Integer.parseInt(new String(digits));

        StringBuilder descBuilder = new StringBuilder(new String(digits)).reverse();
        int desc = Integer.parseInt(descBuilder.toString());

        return desc - asc;
    }
}
