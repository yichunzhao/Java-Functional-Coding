package HandleException;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


/**
 * @author YNZ
 */

public class HandleExceptionLambda {

    public static void main(String[] args) {
        List<String> listUrlToCrawl = Stream.of("https://masterdevskills.com").collect(toList());
        listUrlToCrawl.stream().map(HandleExceptionLambda::createURL).forEach(HandleExceptionLambda::save);
    }

    private static void save(URL url) {
        try {
            String uuid = UUID.randomUUID().toString();
            InputStream inputStream = url.openConnection().getInputStream();
            Files.copy(inputStream, Paths.get(uuid + ".txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static URL createURL(String urlToCrawl) {
        try {
            return new URL(urlToCrawl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
