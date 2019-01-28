package Optional;

import java.util.Optional;

/**
 * @author YNZ
 */
public class OptionalDetermineNullAndEmptyString {

    public static void main(String... args) {
        String str = null;
        Optional.ofNullable(str).ifPresent(x -> print("print out " + x));

        String str1 = "null";
        Optional.ofNullable(str1).ifPresent(x -> print("print out " + x));

        System.out.println(isEmptyNull(null));
        System.out.println(isEmptyNull("something"));
        System.out.println(isEmptyNull(""));

        System.out.println(Optional.ofNullable("").isPresent());//true
        System.out.println(Optional.ofNullable(null).isPresent());//false
        System.out.println(Optional.ofNullable("").get());//true

        System.out.println(Optional.of("Optional is a container... "));
        String str2 = "this is ";

        //return an option
        Optional<String> result = Optional.ofNullable(str2);
        result.ifPresent(x->System.out.println(x));
    }

    public static boolean isEmptyNull(String str) {
        //ofNullable returns Optional
        //orElse returns T
        return Optional.ofNullable(str).orElse("").isEmpty();
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
