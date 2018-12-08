package collectresult;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;
import static java.util.stream.Stream.of;

/**
 * @author YNZ
 */
public class CollectingToNewSet {
    public static void main(String[] args) {

        of(BigDecimal.valueOf(1234), BigDecimal.valueOf(3443)).collect(toSet());

        Set<BigDecimal> bigSet = of(BigDecimal.valueOf(1234), BigDecimal.valueOf(5477))
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(bigSet);

        Set<BigDecimal> treeBigSet = of(BigDecimal.valueOf(234), BigDecimal.valueOf(134))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeBigSet);

        Set<BigDecimal> linkedSet = of(BigDecimal.valueOf(12.123), BigDecimal.valueOf(44.369))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(linkedSet);

        bigSet.stream().map(b -> b.add(BigDecimal.TEN)).forEach(System.out::println);

        of(BigDecimal.valueOf(1233), BigDecimal.valueOf(233))
                .reduce((a, b) -> a.add(b)).ifPresent(r -> System.out.println(r));


    }

}
