// Class representing an exam with course details
public class Exam {
    private String course;
    private String date;
    private String time;
    private String invigilator;
    // Constructor to initialize exam details
    public Exam(String course, String date, String time, String invigilator) {
        this.course = course;
        this.date = date;
        this.time = time;
        this.invigilator = invigilator;
    }  
    // Method to display exam details
    public void display() {
        System.out.println("Course: " + course + " | Date: " + date + " | Time: " + time + " | Invigilator: " + invigilator);
    }
    // Getter methods used for notification
    public String getCourse() {
        return course;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
}
