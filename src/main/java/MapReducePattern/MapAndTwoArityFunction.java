package MapReducePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YNZ
 */
public class MapAndTwoArityFunction {

    public static void main(String... args) {

        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 60000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);

        //Map replaceAll(bi-function)
        salaries.replaceAll((name, oldSalary) -> oldSalary + 3000);
        System.out.println(salaries);

        salaries.replaceAll((name, oldSalary) -> name.equals("John") ? oldSalary + 1000 : oldSalary);
        System.out.println(salaries);

        salaries.putIfAbsent("Mike", 24000);
        System.out.println(salaries);

        salaries.compute("John", (name, salary) -> salary + 500);
        System.out.println(salaries);
    }
}
