package test.java.config;

public interface AssignmentExecutor {

    void executeTask();

    default void printLineSeparator() {
        System.out.println("\n============== " + this.getClass().getSimpleName() + " ==============");
    }
}
