package managers;

import exceptions.MyException;
import models.Expense;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Date date, String description, double expense) throws MyException {
        try{
            expenses.add(new Expense(date, description, expense));
        } catch (Exception e){
            throw new MyException("There is an error getting the category");
        }
    }
}
