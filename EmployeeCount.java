package one123;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeeCount {
    public static void main(String[] args){
        Employee one = new Employee(1,"vinod");
        Employee two = new Employee(10,"kumar");
        Employee three = new Employee(4,"gubba");
        Employee four = new Employee(2,"ashok");
        Employee five = new Employee(6,"nokshi");
        List<Employee> emps = new ArrayList<>();
        emps.add(one);
        emps.add(two);
        emps.add(three);
        emps.add(four);
        emps.add(five);
        TreeMap<String, Employee> tree = emps.stream().collect(Collectors.toMap(Employee :: getName, e -> e, (old, latest) -> old, TreeMap::new));
        System.out.println(tree);

        Map<String, Integer> map = emps.stream().collect(Collectors.toMap(Employee :: getName, Employee :: getId, (old, latest) -> old));
        System.out.println(map);

        Map<String, Integer> test = emps.stream().collect(Collectors.toMap(Employee:: getName, e -> e.getId(), (old, latest) -> old+latest));
        System.out.println(test);

        emps.stream().collect(Collectors.toMap(Employee:: getName, e -> e.getId(), (old, latest) -> old+latest)).entrySet().stream().forEach(e ->System.out.println(e.getKey()));

        emps.stream().collect(Collectors.toMap(Employee:: getName, e -> e.getId(), (old, latest) -> old+latest, TreeMap::new)).entrySet().stream().forEach(e -> {
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        });

    }
}
