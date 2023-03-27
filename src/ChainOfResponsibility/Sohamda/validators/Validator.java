package ChainOfResponsibility.Sohamda.validators;

import ChainOfResponsibility.Sohamda.entity.Person;

public abstract class Validator {
    private Validator nextValidator;

    public Validator setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
        return this.nextValidator;
    }

    public Validator getNextValidator() {
        return nextValidator;
    }

    public abstract void validate(Person person);
}
