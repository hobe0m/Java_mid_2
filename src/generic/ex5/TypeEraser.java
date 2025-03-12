package generic.ex5;

public class TypeEraser {
    // 타입 이레이저
    // 개발자가 만든 소스 내의 제네릭을 컴파일 시에 없앤다.
    // 즉, T는 Object로 명확한 타입 지정(Integer, String 등)시에는 해당 타입으로 변환한다.
    // 제네릭을 없애기 때문에 타입 이레이저라고 한다.

    // 상한이나 하한을 정했을 경우에는, Object로 설정 후 실제 사용하는 곳에서 강제 캐스팅을 진행한다.

    // 타입 이레이저 방식의 한계
    // 컴파일 이후에는 제네릭 타입의 정보가 존재하지 않기 때문에 런타임에 타입을 활용하는 코드는 사용할 수 없다.
    //  - instanceof T, new T()
    //  - instanceof는 무조건 Object의 인스턴스인지 확인하기 때문에 무조건 참이고, new T는 내가 원하는 타입이 아닌 Object나 상위의 타입으로 지정되기 때문에 사용하지 않는다.
}
