import java.util.*;

public class Department extends Component {
    private List<Component> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void printData() {
        System.out.println("BEGIN: Deparment " + this.name);

        // print the contents of all children
        System.out.println("Contents of " + this.name);
        for (Component child : this.children) {
            child.printData();
        }
        System.out.println("END: Department " + this.name);
    }

    @Override
    public int getTotalSalary() {
        int totalSalary = 0;
        for (Component child : this.children) {
            totalSalary += child.getTotalSalary();
        }
        return totalSalary;
    }

    @Override
    public String toXml(int indentation) {
        String indent = " ".repeat(indentation);
        StringBuilder xml = new StringBuilder(indent + "<Department name=\"" + this.name + "\">\n");
        for (Component child : children) {
            xml.append(child.toXml(indentation + 2)).append("\n");
        }
        xml.append(indent).append("</Department>");
        return xml.toString();
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return this.children.get(index);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
