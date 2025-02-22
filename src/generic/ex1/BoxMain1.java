package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); // 오토 박싱, int가 integer로 변환(자동)
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }

    // 코드를 보면 먼저 숫자를 보관하는 IntegerBox를 생성하고, 그곳에 숫자 10을 보관하고 꺼내서 출력했다.
    // 참고로 오토박싱에 의해서 int가 Integer로 자동 변환된다.
    // 다음으로 문자열을 보관하는 StringBox를 생성하고 그 곳에 문자열 "hello"를 보관하고, 꺼내서 출력했다.

    // 이후에 더 다양한 타입을 담는 박스가 필요하면 박스 클래스를 계속 만들어야 하는 불편함이 있다.
    // 코드는 같은데 타입만 다른 박스들이 필요해지니까 제네릭을 사용한다.
    // 따라서 제네릭이 등장했다.
    //  - 제네릭은 타입을 지정하지 않기 때문에, 상황에 맞는 타입을 받을 수 있다.
}
