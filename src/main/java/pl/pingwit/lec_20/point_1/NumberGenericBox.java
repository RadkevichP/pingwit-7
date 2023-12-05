package pl.pingwit.lec_20.point_1;

public class NumberGenericBox<T extends Number> {

    private T item;

    public NumberGenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
