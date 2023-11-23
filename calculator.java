import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        int n1, n2, choice, cal;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("Select Operation");
        choice = sc.nextInt();
        if (choice == 1) {
            cal = n1 + n2;
            System.out.println("ADDITION : " + cal);
        } else if (choice == 2) {
            cal = n1 - n2;
            System.out.println("SUBTRACTION : " + cal);
        } else if (choice == 3) {
            cal = n1 * n2;
            System.out.println("MULTIPLICATION : " + cal);
        } else if (choice == 4) {
            cal = n1 / n2;
            System.out.println("DIVISION : " + cal);
        } else {
            cal = n1 % n2;
            System.out.println("MODULO : " + cal);
        }

    }
}