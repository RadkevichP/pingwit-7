package pl.pingwit.lec_20.point_1;

public class GenericBox<T> {
    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
