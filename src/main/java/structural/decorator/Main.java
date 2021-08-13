package structural.decorator;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        EmmployeeInterface employee = new NormalEmployee();
        employee.doTask();
        employee.check();

        EmmployeeInterface leader = new Leader(employee);
        leader.check();
        leader.doTask();

        EmmployeeInterface manager = new Manager(employee);
        manager.doTask();
        manager.check();
    }
}
