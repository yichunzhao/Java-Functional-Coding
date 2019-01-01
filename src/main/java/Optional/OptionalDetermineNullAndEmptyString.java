package Optional;

import java.util.Optional;

/**
 * @author YNZ
 */
public class OptionalDetermineNullAndEmptyString {

    public static void main(String... args) {

        System.out.println(isEmptyNull(null));
        System.out.println(isEmptyNull("something"));
        System.out.println(isEmptyNull(""));

        System.out.println(Optional.ofNullable("").isPresent());//true
        System.out.println(Optional.ofNullable(null).isPresent());//false
        System.out.println(Optional.ofNullable("").get());//true
    }

    public static boolean isEmptyNull(String str) {
        //ofNullable returns Optional
        //orElse returns T
        return Optional.ofNullable(str).orElse("").isEmpty();
    }
}
