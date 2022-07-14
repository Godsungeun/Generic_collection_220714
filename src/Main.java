interface Plant {}
class Flower implements Plant{ }
class Rose extends Flower implements Plant {}

class Basket<T extends Flower & Plant> { // 동시 충족조건 & 사용
    private T item;

    public T getItem() {
        return item;
    }
    public void setItem(T item){
        this.item = item;
    }
}

public class Main {
    public static void main(String[] args) {
        Basket<Flower> flowerBasket = new Basket<>();
        // T 타입 대신 Flower 타입으로 변환.
        Basket<Rose> roseBasket = new Basket<>();
    }
}
