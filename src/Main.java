import utils.Employee;
import utils.Manager;
import utils.Salesman;

public class Main {
    public static void main(String[] args) {
        /*
            convertendo um tipo especifico para um tipo mais generico.
            Temos acesso a todas as propriedades do tipo generico (Employee) mas
            não temos acesso ao tipo especifico (Manager)
         */
        Employee managerGeneric = new Manager();
        Employee salesmanGeneric = new Salesman();

        // uma forma de casting mais explicita
        printEmployee(managerGeneric);

        // uma forma de casting sem a necessidade de implementação
        printEmployeeFeatureJava17(managerGeneric);
        printEmployeeFeatureJava17(salesmanGeneric);
    }


    static void printEmployee(Employee employee){
        System.out.println("Class: " + employee.getClass().getCanonicalName());
        employee.setName("João");
        ((Manager)employee).setLogin("login Manager casting manual");
        ((Manager)employee).setPassword("password Manager casting manual");
        System.out.println(((Manager)employee).getLogin());
        System.out.println(((Manager)employee).getPassword());
    }

    static void printEmployeeFeatureJava17(Employee employee){
        // A verificação gera uma variavel da instancia, entrou no Java 17.
        if (employee instanceof Manager manager){
            System.out.println("=================================================");
            System.out.println("Class: " + employee.getClass().getCanonicalName());
            employee.setName("João");
            manager.setLogin("login Manager");
            manager.setPassword("password Manager");
            System.out.println(manager.getLogin());
            System.out.println(manager.getPassword());
            System.out.println("=================================================");
        }
        if (employee instanceof Salesman salesman){
            System.out.println("=================================================");
            System.out.println("Class: " + employee.getClass().getCanonicalName());
            employee.setName("Matheus Salesman");
            salesman.setPercentPerSold(10.0);
            System.out.println(employee.getName());
            System.out.println(salesman.getPercentPerSold());
            System.out.println("=================================================");
        }
    }
}