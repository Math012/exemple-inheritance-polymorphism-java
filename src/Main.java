import utils.Employee;
import utils.Manager;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setName("João");
        manager.setLogin("joao");
        manager.setPassword("12345");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());

        // convertendo um tipo especifico para um tipo mais generico

        Employee managerGeneric = new Manager();


    }
}