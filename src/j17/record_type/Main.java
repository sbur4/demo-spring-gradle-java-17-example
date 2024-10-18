package j17.record_type;

public class Main {
    public static void main(String[] args) {
        //record classes are a special kind of immutable class which is meant to replace data transfer objects(DTOs).
        record Fruit(String name, int price){}
        Fruit fruit = new Fruit("Apple", 100);
        System.out.println(fruit.price());
    }
}
