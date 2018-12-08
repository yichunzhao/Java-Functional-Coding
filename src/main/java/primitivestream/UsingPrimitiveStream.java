package primitivestream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * @author YNZ
 */
public class UsingPrimitiveStream {
    public static void main(String[] args) {
        //primitive stream making more efficient to handle primitives.
        int r = IntStream.of(1, 2, 3).sum();
        System.out.println(r);

        double s = DoubleStream.of(12.3, 34.3, 11.2).sum();
        System.out.println(s);

        

    }

}
