package strategy;

public class IsAllUpperCase implements ValidationStragy {

    @Override
    public boolean execute(String s) {
        return s.matches("[A-Z]+");             // 대문자인가? 를 검증하는 전략
    }
    
}
