public class Task {
    private boolean isCompleted;

    public Task() {
        // Task starts as not completed
        isCompleted = false;
    }

    public void markAsCompleted() {
        // Mark the task as completed
        isCompleted = true;
    }

    public boolean isCompleted() {
        // Check if the task is completed
        return isCompleted;
    }
}
