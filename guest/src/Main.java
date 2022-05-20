import java.util.Scanner;

public class Main {
    static String[] guest = new String[10];
    static int i;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        insertTestName();

        do {
            displayGuest();
            displayMenu();
            int choice = getChoice();
            if (choice == 1) {
                addGuest();
            } else if (choice == 2) {
                renameGuest();
            } else if (choice == 3) {
                removeGuest();
            } else if (choice == 4) {
                System.out.println("Exiting....");
                break;
            }
        } while (true);
    }

    public static void displayGuest() {
        System.out.println("_________________________");
        System.out.println("-GUEST-");
        boolean isEmpty = true;
        for (i = 0; i < guest.length; i++) {
            if (guest[i] != null) {
                System.out.println((i+1)+". "+ (guest[i] == null ? "--" : guest[i]));
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("Guest is empty");
        }
    }

    static void displayMenu() {
        System.out.println("_________________________");
        System.out.println("-MENU-");

        System.out.println("1. Add");
        System.out.println("2. Rename");
        System.out.println("3. Delete");
        System.out.println("4. Exit");
    }

    static int getChoice() {
        System.out.print("Enter your choice :");
        int choice = scanner.nextInt();
        return choice;
    }

    static void addGuest() {
        for (i = 0; i < guest.length; i++) {
            if (guest[i] == null) {
                System.out.print("NAME:");
                String name = scanner.nextLine();
                guest[i] = name;
                break;
            }
        }
    }

    static void renameGuest() {
        System.out.print("number:");
        int num = scanner.nextInt();
        scanner.nextLine();
        if (num >= 1 && num <= 10 && guest[num-1]!=null) {
            System.out.print("Name:");
            String name = scanner.nextLine();
            guest[num - 1] = name;
        }
        else {
            System.out.println("Error number did not match...");
        }
    }

    static void removeGuest() {
        System.out.print("Number: ");
        int num = scanner.nextInt();
        if (num >= 1 && num <= 10) {
            guest[num - 1] = null;

            String[] temp = new String[guest.length];
            int j = 0;
            for (i = 0; i < guest.length; i++) {
                if (guest[i] != null) {
                    temp[j] = guest[i];
                    j++;
                }
            }
            guest = temp;
        }
        else {
            System.out.println("Error number didn't match....");
        }
    }

    static void insertTestName() {
        guest[0] = "rachel";
        guest[1] = "christopher";
        guest[2] = "michelle";
        guest[3] = "molly";
        guest[4] = "priyanka";
    }
}