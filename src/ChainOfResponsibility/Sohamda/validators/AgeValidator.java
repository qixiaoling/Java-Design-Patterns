package ChainOfResponsibility.Sohamda.validators;

import ChainOfResponsibility.Sohamda.entity.Person;

public class AgeValidator extends Validator{
    @Override
    public void validate(Person person) {
        if(person.getAge() < 18 || person.getAge() > 90) {
            throw new RuntimeException("Don't want to be an 'ageist', but cannot allow this age group.");
        }
        if(getNextValidator() != null) {
            getNextValidator().validate(person);
        }
    }
}
