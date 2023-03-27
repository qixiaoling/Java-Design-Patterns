package ChainOfResponsibility.Sohamda;

import ChainOfResponsibility.Sohamda.entity.Person;
import ChainOfResponsibility.Sohamda.validators.AgeValidator;
import ChainOfResponsibility.Sohamda.validators.CityValidator;
import ChainOfResponsibility.Sohamda.validators.NameValidator;
import ChainOfResponsibility.Sohamda.validators.Validator;

public class MainAppChain {
    public static void main(String[] args) {
        Validator validator1 = new AgeValidator();
        Validator validator2 = new NameValidator();
        Validator validator3 = new CityValidator();

        validator1.setNextValidator(validator2).setNextValidator(validator3);
        Person person = new Person("Soham", 20, "Amersfoort");
        validator1.validate(person);
    }




}
