import java.util.ArrayList;
// Class to store and manage exams
public class ExamDatabase {
    private static ArrayList<Exam> exams = new ArrayList<>();
    // Method to add an exam and notify students
    public static void addExam(Exam e) {
        exams.add(e);
        sendNotification(e); // Send notification after adding
    }
    // Method to show all scheduled exams
    public static void showExams() {
        if (exams.isEmpty()) {
            System.out.println("❌ No exams scheduled yet.");
        } else {
            System.out.println("\n📅 Scheduled Exams:");
            for (Exam e : exams) {
                e.display();
            }
        }
    }
    // Notification method triggered on new exam addition
    private static void sendNotification(Exam e) {
        System.out.println("\n🔔 Notification to students:");
        System.out.println("New exam scheduled: " + e.getCourse() +
                " on " + e.getDate() + " at " + e.getTime());
    }
}
