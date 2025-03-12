package generic.ex5;

public class TypeEraser {
    // 타입 이레이저
    // 개발자가 만든 소스 내의 제네릭을 컴파일 시에 없앤다.
    // 즉, T는 Object로 명확한 타입 지정(Integer, String 등)시에는 해당 타입으로 변환한다.
    // 제네릭을 없애기 때문에 타입 이레이저라고 한다.

    // 상한이나 하한을 정했을 경우에는, Object로 설정 후 실제 사용하는 곳에서 강제 캐스팅을 진행한다.

}
