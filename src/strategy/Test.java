package strategy;

public class Test {
    public static void main(String[] args) {
        
        Validator validateNumeric = new Validator(new IsNumeric());
        Validator validateUpper = new Validator(new IsAllUpperCase());
        Validator validateLower = new Validator(new IsAllLowerCase());

        System.out.println(validateNumeric.validate("123456"));
        System.out.println(validateUpper.validate("ABCED"));
        System.out.println(validateLower.validate("abeseAf"));
    }
}
