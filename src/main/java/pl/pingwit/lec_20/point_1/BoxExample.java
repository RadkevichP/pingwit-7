package pl.pingwit.lec_20.point_1;

public class BoxExample {

    public static void main(String[] args) {
        ObjectBox objectBox =new ObjectBox("Integer.valueOf(8)");

        // Integer item = (Integer) objectBox.getItem();

        GenericBox<Integer> integerGenericBox = new GenericBox<>(90);
        // diamond operator
        Integer item = integerGenericBox.getItem();

        GenericBox<String> stringGenericBox = new GenericBox<>("opopo");
        String item1 = stringGenericBox.getItem();

        NumberGenericBox<Integer> numberGenericBox = new NumberGenericBox<>(90);

    }
}
