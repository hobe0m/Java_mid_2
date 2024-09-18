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
}


