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
    // 제네릭이 자바의 처음부터 있었던 것이 아니라 제네릭이 없던 시절과 과거 코드의 호환이 필요했기 때문에 어쩔 수 없이 로 타입을 지원한다.

    // 정리하면 로 타입은 사용하지 않아야 하고, 만약 Object를 사용해야 한다면 다이아몬드 안에 Object를 넣어주면 된다.
}
