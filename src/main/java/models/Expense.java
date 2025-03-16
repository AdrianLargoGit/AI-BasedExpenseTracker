package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Expense {
    private Date date;
    private String description;
    private Categories category;
    private double expense;

    public Expense(Date date, String description, double expense) throws IOException {
        this.date = date;
        this.description = description;
        this.expense = expense;
        this.category = getCategoryFromAI(description);
    }

    private Categories getCategoryFromAI(String description) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("python", "analyzer.py", description);
        Process process = pb.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String category = reader.readLine();
        return Categories.valueOf(category);
    }

}
