public class Employee extends Component {
    protected int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void printData() {
        System.out.println(("Employee " + this.name + ", " + this.salary));
    }

    @Override
    public int getTotalSalary() {
        return this.salary;
    }

    @Override
    public String toXml(int indentation) {
        String indent = " ".repeat(indentation);
        return indent + "<Employee name=\"" + this.name + "\" />";
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
