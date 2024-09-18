package generic.ex1;

public class RawTypeMain {
    // 로 타입(RawType), 원시 타입
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); // 다이아몬드를 빼고 제네릭 만들기
        // GenericBox<Object> integerBox = new GenericBox<>(); 이 코드와 동일하다고 보면 된다.
        // 주석처리 된 코드를 사용해 명확히 알려주는 것을 권장한다.
        integerBox.set(10);
        Integer result = (Integer) integerBox.get(); // Object이므로 Integer로 다운 캐스팅 후 꺼내야 한다.
        System.out.println("result = " + result);
    }
    // 즉, Raw Type은 다이아몬드를 생략했을 때, Object 타입이 자동으로 들어간다는 것과 같다.
}
