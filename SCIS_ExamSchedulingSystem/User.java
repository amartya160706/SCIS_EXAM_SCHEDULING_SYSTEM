// Abstract class representing a generic user
public abstract class User {
    protected String name;
    protected String id;
    // Constructor to initialize name and ID
    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }
    // Abstract method to be implemented by subclasses
    public abstract void showMenu(java.util.Scanner sc);
}
