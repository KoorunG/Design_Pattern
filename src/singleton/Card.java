package singleton;

public class Card {
    
    public enum Type { BRONZE, SILVER, GOLD }
    Type type;
    private int cardNum;
    static int serialNum = 10000;

    public Card(Type type){
        serialNum++;
        cardNum = serialNum;
        this.type = type;
    }

    public int getCardNum() {
        return cardNum;
    }

   public void printInfo(){

        String grade;

        if(type == Type.BRONZE){
            grade = "BRONZE";
        } else if(type == Type.SILVER){
            grade = "SILVER";
        } else if(type == Type.GOLD){
            grade = "GOLD";
        } else grade = null;

       System.out.println("이 카드의 번호는 "+cardNum+"번 이고, 등급은 "+grade+"입니다");
   }

   
    
}
