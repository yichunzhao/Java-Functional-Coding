package PatternWithLambada;

import DataModel.Person;

import java.util.List;

/**
 * @author YNZ
 */

@FunctionalInterface
public interface Filter<T> {

    List<T> doFiltering(List<T> persons);


}
