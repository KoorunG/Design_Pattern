package chain;

public abstract class ProcessingObject<T> {

    protected ProcessingObject<T> successor;                 // 상속 지시자를 설정한 successor 선언 한 뒤

    public void setSuccessor(ProcessingObject<T> successor) {// setter 설정
        this.successor = successor;
    }

    public T handle(T input){                                // 추상메소드 handleWork를 포함하는 탬플릿메소드
        T r = handleWork(input);
        if(successor != null){
            return successor.handle(r);
        }
        return r;
    }

    abstract protected T handleWork(T input);
    
}
