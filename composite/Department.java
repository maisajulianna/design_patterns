import java.util.*;

public class Department extends Component {
    private List<Component> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void printData() {
        System.out.println("Deparment " + this.name);

        // print the contents of all children
        System.out.println("Contents of " + this.name);
        for (Component child : this.children) {
            child.printData();
        }
        System.out.println("End of contents.");
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
}
