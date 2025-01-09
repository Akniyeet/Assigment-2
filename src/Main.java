import java.util.*;

public class MyApplication {
    public static void main(String[] args) {
        // Create a list of employees and students
        List<Payable> people = new ArrayList<>();

        Employee e1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee e2 = new Employee("George", "Harrison", "Developer", 50000.00);
        Student s1 = new Student("Ringo", "Starr", 2.5);
        Student s2 = new Student("Paul", "McCartney", 3.0);

        // Add employees and students to the list
        people.add(e1);
        people.add(e2);
        people.add(s1);
        people.add(s2);

        // Sort the list by payment amount
        Collections.sort(people);

        // Print the data
        printData(people);
    }

    public static void printData(Iterable<Payable> people) {
        for (Payable person : people) {
            String position = (person instanceof Employee) ? "Employee" : "Student";
            System.out.printf("%s: %d. %s earns %.2f tenge\n",
                    position,
                    ((Person) person).getId(),
                    ((Person) person).toString().split("\\.")[1].trim(),
                    person.getPaymentAmount());
        }
    }
}
