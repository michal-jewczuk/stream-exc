package test.java.config;

import test.java.assignment.AssignmentOne;
import test.java.assignment.ProductCreator;
import test.java.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    private static final List<AssignmentExecutor> executors = new ArrayList<>();
    public static List<Product> allProducts;

    static {
        allProducts = ProductCreator.getAllProducts("examples1.txt");

        addAssignment(new AssignmentOne());
    }

    public static void addAssignment(AssignmentExecutor assignment) {
        executors.add(assignment);
    }

    public static void executeAllTasks() {
        executors.stream().forEach(t -> t.executeTask());
    }
}
