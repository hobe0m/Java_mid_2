package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        // 제네릭 클래스 사용

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에서 T의 타입 결정, 여기서는 Integer
        integerBox.set(10);
        // integerBox.set("문자100"); Integer 타입만 허용하므로, 컴파일 오류 발생 : Generic을 사용해서 얻을 수 있는 효과
        Integer integer = integerBox.get(); // Integer 타입 변환 (캐스팅 X) : Generic을 사용해서 얻을 수 있는 효과
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>(); // 생성 시점에서 T의 타입 결정, 여기서는 String
        stringBox.set("hello"); // String 타입만 허용
        String str = stringBox.get(); // String 타입만 반환
        System.out.println("str = " + str);

        GenericBox<Double> doubleBox = new GenericBox<Double>(); // 생성 시점에서 T의 타입 결정, 여기서는 Double
        doubleBox.set(10.5); // Double 타입만 허용
        Double doubleValue = doubleBox.get(); // Double 타입만 반환
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        // new 다음 제네릭 박스에는 타입을 써주지 않아도 된다.
        GenericBox<Integer> integerBox2 = new GenericBox<>();
        // 앞에서 이미 Integer라고 선언했기 때문에, 당연히 Integer가 들어갈 것이라고 추론한다.
    }
}

// 제네릭 클래스를 사용하면 위에서 사용한 것과 같이 GenericBox를 생성하는 시점에 원하는 타입을 마음껏 지정할 수 있다.

// 참고로 제네릭을 도입한다고 해서 앞서 설명한 GenericBox<String>, GenericBox<Integer>과 같은 코드가 실제로 만들어지는 것은 아니다.
// 대신에 자바 컴파일러가 우리가 입력한 타입 정보를 기반으로 이런 코드가 있다고 가정하고 컴파일 과정에 타입 정보를 반영한다.
// 이 과정에서 타입이 맞지 않으면 컴파일 오류가 발생한다.
// 더 자세한 내용은 뒤에서 설명한다.


