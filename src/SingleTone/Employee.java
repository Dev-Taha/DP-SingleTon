package SingleTone;

import java.util.HashMap;

public class Employee {

    private HashMap<String,String> employee;
    private static Employee instance;

    private Employee(){
        employee = new HashMap<String,String>();
        employee.put("Ali","Software Developer");
        employee.put("Ahmed","Engineering");
        employee.put("Jack","Web Developer");
    }

    public static synchronized Employee getInstance(){
        if(instance == null)
            instance = new Employee();
        return instance;
    }

    public String getInformation(String name){
        System.out.println("Welcome to ATA Community ..");
        if(employee.containsKey(name)){
            return name +" : "+employee.get(name);
        }
        return "Sorry We Can Not Have Your Name !!";
    }
}
