package strategy;

public class IsAllLowerCase implements ValidationStragy {

    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");             // 소문자인가? 를 검증하는 전략
    }
    
}
