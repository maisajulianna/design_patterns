public class Organization {
    public static void main(String[] args) {

        Department HR = new Department("HR");
        Department IT = new Department("IT");

        Employee e1 = new Employee("Emma Johnson", 3400);
        Employee e2 = new Employee("Michael Smith", 2700);
        Employee e3 = new Employee("Sophia Brown", 6300);
        Employee e4 = new Employee("Liam Davis", 5400);

        HR.add(e1);
        HR.add(e2);

        IT.add(e3);
        IT.add(e4);

        // main organization
        Department organization = new Department("Organization");

        organization.add(HR);
        organization.add(IT);

        // it departments total salary
        //System.out.println("IT department's salary: " + IT.getTotalSalary());

        // print total salary
        System.out.println("Total salary of " + organization.getName() + ": " + organization.getTotalSalary());
        System.out.println();

        System.out.println(organization.toXml(0));
    }
}
