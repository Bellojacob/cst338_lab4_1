import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    private int employeeId;
    private String name;

    static ArrayList<Employee> myEmployees = new ArrayList<>();


    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public void addEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an ID number: ");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        myEmployees.add((new Employee(idNumber, name)));
        System.out.println("More employees? (y/n)");
        String answer = scanner.nextLine();
        if (answer.equals("y")) {
            addEmployee();
        }
    }

    @Override
    public String toString() {
        return "{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                '}';
    }


    public void printEmployee(){
        System.out.println("The list contains:");
        for (Employee employee : myEmployees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
    




    }
}
