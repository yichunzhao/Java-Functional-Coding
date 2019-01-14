package CollectingData;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author YNZ
 */
public class CollectingToNewMap {

//    3 versions to collect into a map
//    toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)
//    toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction)
//    toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M>  mapSupplier)


    public static void main(String[] args) {
        Map<String, String> countryLang = Stream.of(Locale.getAvailableLocales()).collect(
                Collectors.toMap(
                        l -> l.getDisplayCountry(),
                        l -> l.getDisplayLanguage(),
                        (o1, o2) -> o2));

        System.out.println(countryLang);

        Map<String, String> countryLang1 = Stream.of(Locale.getAvailableLocales()).collect(
                Collectors.toMap(
                        l -> l.getDisplayLanguage(),
                        l -> l.getDisplayLanguage(l),
                        (o1, o2) -> o1,
                        TreeMap::new)

        );
        System.out.println(countryLang1);


        Map<String, Set<String>> countryLang2 = Stream.of(Locale.getAvailableLocales()).collect(
                Collectors.toMap(
                        l -> l.getDisplayLanguage(),
                        l -> Collections.singleton(l.getDisplayCountry()),
                        (a, b) -> {
                            Set<String> r = new HashSet<>();
                            return r;
                        },
                        TreeMap::new)
        );

        System.out.println(countryLang2);

    }

}
