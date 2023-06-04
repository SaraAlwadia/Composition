package composition;

public class Composition {

    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        System.out.println(salary);
        String role = person.getRole();
        System.out.println(role);
        System.out.printf("Salary: %d, Role: %s", salary, role);
    }
    
}
