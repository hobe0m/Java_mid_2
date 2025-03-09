package generic.ex3;

import generic.animal.Animal;

public class AnimalMethod {

        // 제네릭 타입이 아닌, 제네릭 메서드를 사용한 간단한 호출 방법
        // extends Animal로 제한을 걸어, Animal의 메서드를 사용할 수 있게 변경
        // 즉, 변수에 Animal 혹은 Animal의 자식들만 들어올 수 있어 기능을 사용(호출)할 수 있게 해주는 것이다.
        public static <T extends Animal> void checkup(T t) {
            System.out.println("동물 이름: " + t.getName());
            System.out.println("동물 크기: " + t.getSize());
            t.sound();
        }
        public static <T extends Animal> T getBigger(T t1, T t2) {
            return t1.getSize() > t2.getSize() ? t1 : t2;
        }
}
