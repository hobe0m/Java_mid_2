package generic.ex4;

import generic.animal.Dog;

public class GenericMethod1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // Object를 받게 되면, Integer를 넣었으므로 다운 캐스팅을 해서 담아줘야 한다.
        // Integer object = (Integer) GenericMethod.genericMethod(i);

        // 타입 인자(Type Argument)의 명시적 전달
        // 제네릭 메서드를 사용하여, 타입 인자를 전달하면 형변환 없이 출력이 가능하다.
        System.out.println("명시적 타입 인자 전달");
        Integer integer = GenericMethod.<Integer>genericMethod(i);

        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        // NumberMethod에는 사용할 수 없다.
        String stringValue = GenericMethod.<String>genericMethod("HELLO");

        // 제네릭 타입 [ GenericClass<T> ]
        //  - 타입 인자 전달 : 객체를 생성하는 시점

        // 제네릭 메서드 [ <T> T genericMethod(T t) ]
        //  - 타입 인자 전달 : 메서드를 호출하는 시점

        // 제네릭 메서드는 특정 메서드에만 제네릭을 도입할 때 사용
        // 제네릭 메서드를 정의할 때는 메서드의 반환 타입 왼쪽에 다이아몬드를 사용해서 타입 매개변수를 적어준다.
        // 제네릭 메서드는 실제 호출하는 시점에 다이아몬드를 사용해서 타입을 정하고 호출

        // 제네릭 메서드의 핵심은 호출하는 시점에 타입 인자를 전달 후 지정하는 것이다.

        /*
        class Box<T> {} : 제네릭 타입
            static <V> V staticMethod2(V v) {} : static 메서드에 제네릭 메서드 도입
            <S> S instanceMethod (S s) {} : instance 메서드에 제네릭 메서드 도입 가능
        */

        // 참고
        // 제네릭 타입을 사용했을 경우에는 스태틱 메서드에 타입 매개 변수를 사용할 수 없다.
        // static 메서드는 인스턴스 단위가 아니라 클래스 단위로 작동하기 때문에 제네릭 타입과는 무관하다.
        // 따라서 static 메서드에 제네릭을 도입하려면 제네릭 메서드를 사용해야 한다.

        // 제네릭 타입 안에서, 다시금 제네릭 메서드를 사용할 수 있다(static, instance 모두)
    }
}
