import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Lennon", "Manager", 50000.00);
        Employee emp2 = new Employee("George", "Harrison", "Engineer", 45000.00);
        Student stu1 = new Student("Paul", "McCartney", 3.5);
        Student stu2 = new Student("Ringo", "Starr", 2.5);


        ArrayList<Payable> people = new ArrayList<>();
        people.add(emp1);
        people.add(emp2);
        people.add(stu1);
        people.add(stu2);


        Collections.sort(people, (a, b) -> Double.compare(a.getPaymentAmount(), b.getPaymentAmount()));


        printData(people);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable p : payables) {
            System.out.println(p.toString() + " earns " + String.format("%.2f", p.getPaymentAmount()) + " tenge");
        }
    }
}