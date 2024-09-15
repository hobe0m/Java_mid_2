package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // Object를 Integer로 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object를 String으로 캐스팅
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달 시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }
    // 이렇게 보면 잘 동작하는 것 같지만, 몇 가지 문제가 있다.

    // 변환 타입이 맞지 않는 문제
    // 먼저 integerBox를 만들어서 숫자 10을 보관했다.
    // 숫자를 입력하는 부분에는 문제가 없어 보이지만, integerbox.get()을 호출할 때 문제가 나타난다.
}
