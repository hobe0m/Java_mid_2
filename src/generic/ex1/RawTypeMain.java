package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        // GenericBox<Object> integerBox = new GenericBox<>();
        // 사용하지 않아도 되지만 사용하는 것을 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
