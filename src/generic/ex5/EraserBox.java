package generic.ex5;

public class EraserBox<T> {

    // 컴파일 오류 발생
    //  - 실행 시점에 T는 Object로 변환된다.
    //  - instanceof는 항상 Object와 비교하게 되므로 항상 참이 반환된다.
    //  - 따라서 자바는 이런 문제 때문에 타입 매개변수에 instanceof를 허용하지 않는다.
    // public boolean instanceCheck(Object param) {
    //     return param instanceof T;
    // }

    // 컴파일 오류 발생
    //  - 실행 시점에 T는 Object로 변환된다.
    //  - new T는 항상 new Object가 되어버린다.
    //  - 개발자가 의도한 것과는 다르다.
    //   - Dog나 Cat을 만들고 싶지만 Object만 생성된다.
    //   - 따라서 허용하지 않는다.
    // public void create() {
    //     return new T;
    // }
}
