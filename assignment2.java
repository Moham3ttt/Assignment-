
import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("xaraf so geli ");
        String text = in.nextLine();

        int waweyn = 0;
        int yatyar = 0;
        int number = 0;
        int calamdo = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (character >= 'A' && character <= 'Z') {
                waweyn++;
            } else if (character >= 'a' && character <= 'z') {
                yatyar++;
            } else if (character >= '0' && character <= '9') {
                number++;
            } else {
                calamdo++;
            }
        }

        System.out.println("xarfo wayn:  " + waweyn);
        System.out.println("xarfo yar:  " + yatyar);
        System.out.println("number: " + number);
        System.out.println("calaamdo: " + calamdo);

        in.close();
    }
}
