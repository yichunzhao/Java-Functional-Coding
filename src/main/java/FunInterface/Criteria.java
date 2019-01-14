package FunInterface;

import java.util.List;

/**
 * @author YNZ
 */

@FunctionalInterface
public interface Criteria<T> {

    List<T> meetCriteria(List<T> inputs);
}
