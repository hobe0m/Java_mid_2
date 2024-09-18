package generic.ex1;

public class ObjectBox {
    // 모든 데이터 타입을 보관할 수 있는 ObjectBox 생성
    // 모든 타입의 부모이므로 다형성을 통해 박스가 많아지는 문제를 해결

    private Object value;

    public void set(Object object) {
        this.value = object;
    }

    public Object get() {
        return value;
    }

    // 다형성을 통한 중복 해결 시도
    // Object는 모든 타입의 부모이다.
    // 따라서 다형성(다형적 참조)을 사용해서 이 문제를 해결할 수 있는지 확인

    // 내부에 Object value를 가지고 있고, Object는 모든 타입의 부모이다.
    // 부모는 자식을 담을 수 있으므로 세상의 모든 타입을 ObjectBox에 보관할 수 있다.
}
