package chain;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {

    static UnaryOperator<String> headProcessing = (String text) -> "머릿말 붙이기!! "+ text;
    static UnaryOperator<String> spellChecking = (String text) -> text.replace("lamda", "lambda");
    static Function<String,String> pipeline = headProcessing.andThen(spellChecking);        // 굳이 인터페이스를 쓰지 않고 람다로 바로 구현 가능하다는 것이다!!
    
    public static void main(String[] args) {
        
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();

        p1.setSuccessor(p2);        // 두 작업처리를 연결...

        String result = p1.handle("lamda is good!");
        System.out.println(result);                     // 머릿말 붙이기와 스펠체크하기 작업이 연결된 모습!!

        String result2 = pipeline.apply("lamda is bad!");
        System.out.println(result2);
    }

    
}