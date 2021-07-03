package singleton;

public class Test {
    
    public static void main(String[] args) {

        Company company1 = Company.getInstance();

        Card card1 = company1.createBronzeCard();
        Card card2 = company1.createSilverCard();
        Card card3 = company1.createGoldCard();
        
        System.out.println(card1.getCardNum());
        System.out.println(card2.getCardNum());
        System.out.println(card3.getCardNum());

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}
