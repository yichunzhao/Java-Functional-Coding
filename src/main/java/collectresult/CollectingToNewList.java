package collectresult;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Stream.of;

/**
 * @author YNZ
 */
public class CollectingToNewList {

    public static void main(String[] args) {

        List<Double> linkedDoubleList = of(12.3D, 34.5D, 38.9D)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedDoubleList);

    }
}
