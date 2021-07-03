package singleton;

import singleton.Card.Type;

public class Company {
    
    private Company(){}

    private static Company instance = new Company();

    public static Company getInstance(){
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }

    public Card createBronzeCard(){
        return new Card(Type.BRONZE);
    }
    public Card createSilverCard(){
        return new Card(Type.SILVER);
    }
    public Card createGoldCard(){
        return new Card(Type.GOLD);
    }
}
