package test.java.config;

public interface TaskExecutor {

    void executeTask();

    default void printLineSeparator() {
        System.out.println("\n============== " + this.getClass().getSimpleName() + " ==============");
    }
}
