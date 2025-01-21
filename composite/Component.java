public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void printData();

    public abstract int getTotalSalary();

    public abstract String toXml(int indentation);

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int index);

    public abstract String getName();
}
