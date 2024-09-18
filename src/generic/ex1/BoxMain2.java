package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        // 변수 클릭 후 shift + F6를 누르면 rename으로 모든 변수의 이름을 한번에 바꿀 수 있다.
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        // ctrl + alt + shift + t : 빠른 리팩토링
        // 빠른 리팩토링에서 Inline Variable, Field Variable을 통해 변수와 필드를 인라인한다.
        // 즉, 하나로 합치고 싶은 부분을 여기서는 Inline Variable을 통해 합쳤다.

        // Object integerBox = objectBox.get();
        // Integer integer = (Integer) integerBox;

        Integer integer = (Integer) integerBox.get(); // Object를 Integer로 다운 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object를 String으로 다운 캐스팅
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달 시(숫자가 들어가길 기대했지만, 문자가 들어갔을 경우)
        // integerBox.set("문자 100");
        // Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외(캐스팅이 잘못됨)
        // System.out.println("result = " + result); // 오류 발생

        // 실수를 하지 않을 것 같지만, 실무에서는 값을 넣는 위치와 꺼내는 위치가 멀어 실수하는 경우가 생긴다.
    }
    // 이렇게 보면 잘 동작하는 것 같지만, 몇 가지 문제가 있다.

    // 변환 타입이 맞지 않는 문제
    // 먼저 integerBox를 만들어서 숫자 10을 보관했다.
    // 숫자를 입력하는 부분에는 문제가 없어 보이지만, integerbox.get()을 호출할 때 문제가 나타난다.

    // IntegerBox.get()의 반환 타입은 Object이다.

    // Integer = Object, String = Object가 아니기에 다운캐스팅을 해주어야 한다.
    //  - Objcet를 반환하고 그것을 Integer과 String에 넣기 때문에 문제 발생

    // 잘못된 타입의 인수 전달 문제
    // 개발자의 의도는 integerBox에는 변수 이름과 같이 숫자 타입이 입력되기를 기대했다.
    // 하지만 set(Object..) 메서드는 모든 타입의 부모인 Object를 매개 변수로 받기 때문에 세상에 어떤 데이터도 입력 받을 수 있다.
    // 따라서 문자열을 입력해도 자바 언어 입장에서는 아무런 문제가 되지 않는다.

    // 그렇지만 잘못된 타입의 값을 전달하면 꺼낼 때 문제가 발생한다.
    // 기대하는 타입으로 변환을 해서 꺼내지만, 실무에서는 실수가 발생할 수 있기 때문이다.
    // 개발자 입장에서는 의도대로 정확한 타입을 넣고 빼는 것을 기대하지만, 그렇지 않을 경우에 입력 과정에서는 에러가 발생하지 않으므로 꺼낼 때 문제를 알아차릴 수 있고 그렇게 되면 해결이 복잡해질 수 있다.

    // 정리
    // 다형성을 활용한 덕분에 코드의 중복을 제거하고, 기존 코드를 재사용할 수 있게 되었다.
    // 하지만 입력 시 실수로 원하지 않는 타입이 들어갈 수 있는 타입 안전성 문제가 발생한다.
    // 예를 들어서 integerBox에는 숫자만 넣어야 하고, stringBox에는 문자열만 입력할 수 있어야 한다.
    // 하지만 박스에 값을 보관하는 set()의 매개변수가 Object이기 때문에 다른 타입의 값을 입력할 수 있다.
    // 그리고 반환 시점에도 Object를 반환하기 때문에 원하는 타입을 정확히 받을 수 없고, 항상 위험한 다운 캐스팅을 시도해야한다.
    // 결과적으로 이 방식은 타입 안전성이 떨어진다.

    // 지금까지 개발한 프로그램은 코드 재사용과 타입 안전성이라는 2마리 토끼를 한번에 잡을 수 없다.
    // 코드 재사용을 늘리기 위해 Object와 다형성을 사용하면 타입 안전성이 떨어지는 문제가 발생한다.

    // BoxMain1 : 각각의 타입 별로 IntegerBox, StringBox와 같은 클래스를 모두 정의
    //  - 코드 재사용 : X
    //  - 타입 안전성 : O

    // BoxMain2 : ObjectBox를 사용해서 다형성으로 하나의 클래스만 정의
    //  - 코드 재사용 : O
    //  - 타입 안전성 : X
}