package templatemethod;

import java.util.function.Consumer;

public class UseLambda {
    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy){
        Customer c = Database.getCustomerWithId(id);
        makeCustomerHappy.accept(c);
    }

    public static void main(String[] args) {
        new UseLambda().processCustomer(100, (Customer c) -> System.out.println("Hello" +c.getName()));
    }
}
