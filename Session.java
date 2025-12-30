package Lab6;

/**
 * Class: Session
 * Description: Represents a study session during the day.
 * Program: Year 2 International Program
 * Author: [Your Partner's Name]
 * Date: [Date]
 /
public class Session {

    // Instance variables
    private String sessionName;
    private int startTime; // e.g., 13 means 1 PM
    private int endTime;   // e.g., 14 means 2 PM
    private String location;

    /**
     * Constructor to initialize a study session
     *
     * @param sessionName Name of the session
     * @param startTime   Start time (integer hour)
     * @param endTime     End time (integer hour)
     * @param location    Location of the session
     */
    public Session(String sessionName, int startTime, int endTime, String location) {
        this.sessionName = sessionName;
        setDuration(startTime, endTime); // reuse validation logic
        this.location = location;
    }

    // Getters
    public String getSessionName() {
        return sessionName;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getLocation() {
        return location;
    }

    /**
     * Updates the duration of the session
     *
     * @param startTime Start time (integer hour)
     * @param endTime   End time (integer hour)
     * @throws IllegalArgumentException if startTime >= endTime
     */
    public void setDuration(int startTime, int endTime) {
        if (startTime >= endTime) {
            throw new IllegalArgumentException(
                "Start time must be less than end time"
            );
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
