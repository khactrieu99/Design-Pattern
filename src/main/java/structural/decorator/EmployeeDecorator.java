package structural.decorator;

/**
 * @author trieutk
 */
public abstract class EmployeeDecorator implements EmmployeeInterface {

    EmmployeeInterface employee;

    public EmployeeDecorator(EmmployeeInterface employee) {
        this.employee = employee;
    }

    @Override
    public void check() {
        employee.check();
    }

    @Override
    public void doTask() {
        employee.doTask();
    }
}
