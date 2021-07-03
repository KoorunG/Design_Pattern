package strategy;

public class IsNumeric implements ValidationStragy{

    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");           // 숫자인가? 를 검증하는 전략
    }
    
}
