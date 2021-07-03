package factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

class makeFactoryByLambda{
    Supplier<Product> stockSupplier = Stock::new;         
    Stock stock = (Stock) stockSupplier.get(); 

    Supplier<Product> bondSupplier = Bond::new;         
    Bond bond = (Bond) bondSupplier.get();  

    Supplier<Product> loanSupplier = Loan::new;         
    Loan loan = (Loan) loanSupplier.get();                     // 생성자 참조를 이용하여 인스턴스를 생성하는 코드

    final static Map<String, Supplier<Product>> map = new HashMap<>();
    static {
        map.put("stock", Stock::new);
        map.put("loan", Loan::new);
        map.put("bond", Bond::new);
    }

    public static Product createProduct(String name){
        Supplier<Product> p = map.get("stock");
        if(p != null)
        return p.get();
        throw new IllegalArgumentException("No Such product " + name);
    }
    
}