package ChainOfResponsibility.Sohamda.validators;

import ChainOfResponsibility.Sohamda.entity.Person;

public class CityValidator extends Validator{
    @Override

    public void validate(Person person) {
        if(person.getCity().equals("Amsterdam")) {
            throw new RuntimeException("Such a busy city..uff!!");
        }
        if(getNextValidator() != null) {
            getNextValidator().validate(person);
        }
    }
}
