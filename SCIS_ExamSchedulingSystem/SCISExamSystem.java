import java.util.Scanner;
// Main class for the exam system
public class SCISExamSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin();
        Student student = new Student();
        int roleChoice = 0;
        do {
            System.out.println("\nSCIS EXAM SCHEDULING SYSTEM");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.print("Select your role: ");
            // Input validation
            while (!sc.hasNextInt()) {
                System.out.print("Please enter a number (1-3): ");
                sc.next();
            }
            roleChoice = sc.nextInt();
            switch (roleChoice) {
                case 1:
                    admin.showMenu(sc); // Admin menu
                    break;
                case 2:
                    student.showMenu(sc); // Student menu
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid input. Please choose between 1 and 3.");
            }
        } while (roleChoice != 3);
        sc.close(); 
    }
}
