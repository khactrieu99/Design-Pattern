package structural.decorator;

/**
 * @author trieutk
 */
public class Manager extends  EmployeeDecorator {

    public Manager(EmmployeeInterface employee) {
        super(employee);
    }

    @Override
    public void check() {
        super.check();
        System.out.println("Do check under level");
    }

    @Override
    public void doTask() {
        super.doTask();
        this.mergeTask();
    }

    public void mergeTask() {
        System.out.println("Do merge task");
    }
}
