
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("password so geli ");
        String password = input.nextLine();

        boolean length = false;
        boolean waweyn = false;
        boolean yaryar = false;
        boolean number = false;
        boolean calmdo = false;

        if (password.length() >= 8) {
            length = true;
        }

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);

            if (character >= 'A' && character <= 'Z') {
                waweyn = true;
            } else if (character >= 'a' && character <= 'z') {
                yaryar = true;
            } else if (character >= '0' && character <= '9') {
                number = true;
            } else {
                calmdo = true;
            }
        }

        if (length && waweyn && yaryar && number && calmdo) {
            System.out.println("Strong");
        } else {
            System.out.println("Weak");
        }
    }
}
