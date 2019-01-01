package Streams;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
@AllArgsConstructor
enum UserRoles {
    ADMIN("Administrator"), CLIENT("Client"), EMPLOYEE("Employee");

    @Getter
    private String text;
}

public class ConvertStreamToArray {

    public static void main(String... args) {
        //convert an Enum into a List
        List<UserRoles> userRoles = stream().collect(toList());
        System.out.println(userRoles);

        //map Enum into text into a Collection
        List<String> userRoleTexts = stream().map(x -> x.getText()).collect(toList());
        System.out.println(userRoleTexts);

        //map Enum into text list and map into its length list
        List<Integer> userRoleTextLengths = stream().map(x -> x.getText()).mapToInt(s -> s.length()).boxed().collect(toList());
        System.out.println(userRoleTextLengths);

        //convert a stream into an array, using int function generator
        System.out.println(Arrays.toString(stream().toArray(UserRoles[]::new)));
    }

    public static Stream<UserRoles> stream() {
        return Stream.of(UserRoles.values());
    }

}
