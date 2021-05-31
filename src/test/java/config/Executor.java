package test.java.config;

import test.java.assignment.ProductCreator;
import test.java.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    private static final List<TaskExecutor> executors = new ArrayList<>();
    public static List<Product> allProducts;

    static {
        allProducts = ProductCreator.getAllProducts("examples1.txt");
    }

    public static void addTask(TaskExecutor taks) {
        executors.add(taks);
    }

    public static void executeAllTasks() {
        executors.stream().forEach(t -> t.executeTask());
    }
}
