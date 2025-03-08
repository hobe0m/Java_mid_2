package generic.ex4;

public class GenericMethod {
    // 제네릭 메서드
    //  - 특정 메서드에 제네릭을 적용한다.
    //  - 앞서 사용한 제네릭 타입과는 다른 기능을 제공한다.
    //  - 클래스에 적용하면 제네릭 타입, 메서드에 적용하면 제네릭 메서드

    // static 메서드 생성
    //  - 인스턴스를 생성하지 않고 사용할 수 있는 메서드(클래스 수준에서 호출 가능)
    //  - 해당 클래스의 필드나 인스턴스와 관련이 없는 독립적인 기능을 하는 메서드에서 주로 사용한다.
    //  - 데이터 효율성이 좋고, 주로 유틸리티 메서드에 자주 사용된다.

    // Object를 받아서 출력 후 반환하는 메서드
    public static Object objMethod(Object obj) {
        System.out.println("object print: " + obj);
        return obj;
    }

    // 반환타입 앞에 <>를 사용해 타입 매개변수를 지정하고, 타입 매개변수를 다시 적어주는 방식으로 사용한다.
    // public static <T>(타입 매개변수 지정) T(사용할 타입 매개변수)
    //  - 메서드 안에서만 제네릭이 적용된다.
    public static <T> T genericMethod(T t) {
        System.out.println("generic print: " + t);
        return t;
    }

    // 제네릭 메서드도 타입 매개변수 제한을 사용할 수 있다.
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
