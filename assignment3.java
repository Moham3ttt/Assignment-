
import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0;
        int choice;

        System.out.println("1. Lacag dhigasho");
        System.out.println("2. Lacag la bixid");
        System.out.println("3. Haraaga itus");
        System.out.println("4. Ka bax");
        System.out.print("Option dooro: ");
        choice = input.nextInt();

        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.print("Lacagta aad dhigaysid gali: ");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    break;
                case 2:
                    System.out.print("Lacagta aad bixinaysid gali: ");
                    double withdraw = input.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                    } else {
                        System.out.println("Haraagaaga kuguma filna.");
                    }
                    break;
                case 3:
                    System.out.println("Haraagaaga waa: " + balance);
                    break;
                default:
                    System.out.println("Doorasho khaldan.");
            }

            System.out.println("1. Lacag dhigasho");
            System.out.println("2. Lacag la bixid");
            System.out.println("3. Haraaga itus");
            System.out.println("4. Ka bax");
            System.out.print("Option dooro: ");
            choice = input.nextInt();
        }

        System.out.println("Nabad gelyo...");
        input.close();
    }
}
