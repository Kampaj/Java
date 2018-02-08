package factory.transformers;

import factory.domain.Person;
import factory.interfc.Factory;

public class FactoryDataToUserTransformer {
    public Person populate(Factory input) {
        Person output = new Person();
        output.setAge(input.getAge());
        output.setName(input.getName());
        output.setCity(input.getCity());
        return output;
    }
}
