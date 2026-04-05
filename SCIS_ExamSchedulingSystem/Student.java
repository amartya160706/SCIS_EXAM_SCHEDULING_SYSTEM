import java.util.Scanner;
// Student class extending User
public class Student extends User {
    public Student() {
        super("DefaultStudent", "S000");
    }
    // Student menu with option to view exam timetable
    @Override
    public void showMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("\nSTUDENT MENU:");
            System.out.println("1. View Exam Timetable");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            // Input validation
            while (!sc.hasNextInt()) {
                System.out.print("Please enter a number: ");
                sc.next();
            }
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Show all scheduled exams
                    ExamDatabase.showExams();
                    break;
                case 2:
                    System.out.println("Returning to main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 2);
    }
}
