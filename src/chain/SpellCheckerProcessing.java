package chain;

public class SpellCheckerProcessing extends ProcessingObject<String> {

    @Override
    protected String handleWork(String text) {
        return text.replace("lamda", "lambda");
    }
    
}
