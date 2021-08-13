package structural.decorator;

/**
 * @author trieutk
 */
public class Leader extends EmployeeDecorator {

    public Leader(EmmployeeInterface employee) {
        super(employee);
    }

    @Override
    public void doTask() {
        super.doTask();
        this.assignTask();
    }

    public void assignTask() {
        System.out.println("Do assign task");
    }
}
