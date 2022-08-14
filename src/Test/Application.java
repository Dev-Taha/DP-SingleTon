package Test;

import SingleTone.Employee;

public class Application {
    public static void main(String[] args) {
        Employee employee = Employee.getInstance();
        System.out.println(employee.getInformation("Ali"));
    }
}
