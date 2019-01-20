package HandleException;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
import java.util.stream.Stream;


/**
 * @author YNZ
 */

public class HandleExceptionLambda {

    public static void main(String[] args) {
        Stream.of("https://masterdevskills.com")
                .map(HandleExceptionLambda::createURL)
                .forEach(HandleExceptionLambda::save);
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
