package chain;

public class HeaderTextProcessing extends ProcessingObject<String> {

    @Override
    protected String handleWork(String text) {
        return "텍스트에 머릿말 붙이기! : " + text;
    }
    
}
