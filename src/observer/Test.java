package observer;

public class Test {
    public static void main(String[] args) {

        Feed f = new Feed();

        f.registerObserver(new NYTimes());
        f.registerObserver(new LeMonde());
        f.registerObserver(new Guardian());
        f.notifyObserver("The queen said her favourite book...");
        f.notifyObserver("money is better than times!");

        System.out.println(" ====== 람다로 구현할 때 ======");
        
        f.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("money")){
                System.out.println("Breaking news!! 람다로 구현함"+tweet);
            }
        });

        f.notifyObserver("money is better than times!");        //근데 굳이 이래야하나 싶긴 함...
    }
}
