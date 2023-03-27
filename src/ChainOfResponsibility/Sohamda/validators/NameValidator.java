package ChainOfResponsibility.Sohamda.validators;

import ChainOfResponsibility.Sohamda.entity.Person;

public class NameValidator extends Validator {
    @Override
    public void validate(Person person) {
        if(person.getName().equals("Soham")) {
            throw new RuntimeException("we cannot allow this guy");
        }
        if(getNextValidator() != null) {
            getNextValidator().validate(person);
        }
    }
}
