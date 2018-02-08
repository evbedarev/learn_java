import java.util.Scanner;

public class Scan {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Y or N: ");
        String input = in.nextLine();

        switch (input) {

            case "Y":
                System.out.println("Вы нажали букву Y");
                break;

            case "N":
                System.out.println("Вы нажали букву N");
                break;
            default:
                System.out.println("Вы нажали unknown букву");
        }
    }
}
