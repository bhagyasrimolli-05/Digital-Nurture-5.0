public class Logger {
    // Single object creation
    private static Logger instance = new Logger();
    // Private constructor
    private Logger() {
    }
    // Method to return same object
    public static Logger getInstance() {
        return instance;
    }
    // Logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}