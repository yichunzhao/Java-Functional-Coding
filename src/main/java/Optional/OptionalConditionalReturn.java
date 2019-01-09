package Optional;

import java.util.Optional;

/**
 * @author YNZ
 */
public class OptionalConditionalReturn {
    //Optional conditional return using filter API

    public static void main(String[] args) {
        Integer year = 2016;
        System.out.println(Boolean.toString(isYear2016(year)));

        year = 2018;
        System.out.println(Boolean.toString(isYear2016(year)));
    }

    public static boolean isYear2016(Integer year) {
        //the filter API runs an inline test on the wrapped class.
        Optional.ofNullable(year).orElseThrow(() -> new IllegalArgumentException("null argument..."));
        return Optional.of(year).filter(y -> y == 2016).isPresent();
    }
}
