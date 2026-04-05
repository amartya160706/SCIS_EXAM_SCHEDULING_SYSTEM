							SCIS EXAM SCHEDULING SYSTEM
             
* ABOUT THE PROJECT
The SCIS (School of Computer and Information Sciences) requires a basic exam scheduling system to streamline the communication between admins and students regarding exam timetables.
This system allows:
- Admins to add and view exams.
- Students to view scheduled exams.
- Automatic notification to students when a new exam is scheduled.

* CLASS OVERVIEW
1. User.java (Abstract Class)
   - Purpose: Base class for Admin and Student
   - Attributes: name, id
   - Method: showMenu(Scanner sc) [abstract]
2. Admin.java (Extends User)
   - Purpose: Represents an administrator
   - Features:
     - showMenu(): Schedule exams and view all exams
3. Student.java (Extends User)
   - Purpose: Represents a student
   - Features:
     - showMenu(): View scheduled exams
4. Exam.java
   - Purpose: Represents exam details
   - Attributes: course, date, time, invigilator
   - Methods:
     - display()
     - Getters: getCourse(), getDate(), getTime()
5. ExamDatabase.java
   - Purpose: Stores all exams (in memory)
   - Features:
     - addExam(Exam e): Adds an exam and sends notification
     - showExams(): Displays all exams
     - sendNotification(Exam e): Notifies students
6. SCISExamSystem.java
   - Purpose: Main class with menu interface
   - Features:
     - Role selection: Admin or Student
     - Invokes relevant menu
     
* INSTALLATION & EXECUTION INSTRUCTIONS
Requirements:
- Java JDK 8 or above
- Text Editor or IDE (Notepad, VS Code, IntelliJ, Eclipse)
- Command Line (Terminal or Command Prompt)

* Steps:
1. Save each class in its respective file:
   - User.java
   - Admin.java
   - Student.java
   - Exam.java
   - ExamDatabase.java
   - SCISExamSystem.java
2. Open Terminal and navigate to the folder containing these files.
3. Compile all files:
   javac *.java
4. Run the program:
   java SCISExamSystem

* SAMPLE RUN
SCIS EXAM SCHEDULING SYSTEM
1. Admin
2. Student
3. Exit
Select your role: 1

ADMIN MENU:
1. Schedule Exam
2. View Scheduled Exams
3. Exit
Enter your choice: 1
Enter Course Name: Data Structures
Enter Exam Date (dd-mm-yyyy): 20-04-2025
Enter Exam Time: 10:00 AM
Enter Invigilator Name: Dr. Smith

🔔 Notification to students:
New exam scheduled: Data Structures on 20-04-2025 at 10:00 AM
✅ Exam scheduled successfully!
------------------------------------------------------------------------------------------------------------------------------------------------------------
📌 NOTES
- This project uses an in-memory (non-persistent) database.
- It can be enhanced by adding:
   -> Authentication
   -> File/database persistence
   -> Graphical User Interface (GUI)
