package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    // 제네릭 메서드 생성
    // Box<T>라는 제네릭 타입을 받아 안에 들어있는 값을 출력하는 메서드
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 제네릭 메서드 생성
    // 마찬가지로 값을 꺼내 출력하지만 상한을 정해, Animal의 메서드도 사용할 수 있다.
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    // 제네릭 메서드 생성
    // 출력 후 반환까지 한다.
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    // WildCard 사용 메서드
    // Box<Dog>, Box<Cat>, Box<Obj>
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    // WildCard 사용 메서드
    // WildCard도 객체 타입을 제한할 수 있다(extends 사용)
    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    // WildCard 사용 메서드
    // 반환 타입을 Animal로 설정
    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

    // 와일드 카드는 제네릭 타입이나, 제네릭 메서드를 선언하는 것이 아니다.
    //  - 와일드 카드는 이미 만들어진 제네릭 타입을 활용할 때 사용한다.
    //  - 와일드 카드는 제네릭 사용을 조금 더 쉽게 할 수 있도록 도와주는 도구이다.

    // 제네릭 메서드 vs 와일드 카드
    // 제네릭 메서드는 타입 매개변수가 존재하며 특정 시점에 타입 매개 변수에 타입 인자를 전달해서 타입을 결정해야 한다.

    // 와일드 카드는 일반적인 메서드에 사용할 수 있고 단순히 매개변수로 제네릭 타입을 받을 수 있는 것 뿐이다.
    //  - 제네릭 메서드처럼 타입을 결정하거나 복잡하게 작동하지 않는다.
    //  - 단순히 일반 메서드에 제네릭 타입을 받을 수 있는 매개변수가 하나 더 있는 것 뿐이다.

    // 제네릭 타입이나 제네릭 메서드를 정의하는게 꼭 필요한 상황이 아니라면 더 단순한 와일드 카드 사용을 권장한다.
}
