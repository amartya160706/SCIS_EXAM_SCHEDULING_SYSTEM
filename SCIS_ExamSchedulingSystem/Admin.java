import java.util.Scanner;
// Admin class extending User
public class Admin extends User {
    public Admin() {
        super("DefaultAdmin", "A000");
    }
    // Admin menu with options to schedule or view exams
    @Override
    public void showMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("\nADMIN MENU:");
            System.out.println("1. Schedule Exam");
            System.out.println("2. View Scheduled Exams");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            // Input validation
            while (!sc.hasNextInt()) {
                System.out.print("Please enter a number: ");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine(); // Consume leftover newline
            switch (choice) {
                case 1:
                    // Input exam details
                    System.out.print("Enter Course Name: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Exam Date (dd-mm-yyyy): ");
                    String date = sc.nextLine();
                    System.out.print("Enter Exam Time: ");
                    String time = sc.nextLine();
                    System.out.print("Enter Invigilator Name: ");
                    String invigilator = sc.nextLine();
                    // Schedule exam
                    ExamDatabase.addExam(new Exam(course, date, time, invigilator));
                    System.out.println("✅ Exam scheduled successfully!");
                    break;
                case 2:
                    // Show all scheduled exams
                    ExamDatabase.showExams();
                    break;
                case 3:
                    System.out.println("Returning to main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }
}
