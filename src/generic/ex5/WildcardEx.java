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
}
