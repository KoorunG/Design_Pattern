package strategy;

public class Validator {
    private final ValidationStragy strategy;
    public Validator(ValidationStragy v){
        this.strategy = v;
    }
    public boolean validate(String s) {
        return strategy.execute(s);
    }
}
