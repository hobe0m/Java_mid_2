package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        // printAndReturn 메서드는 제네릭 타입과는 무관하고 제네릭 메서드가 적용된다.
        // 다만 상한선이 없기 때문에, Object로 취급된다.
        // getName과 같은 Animal 메서드는 사용할 수 없다.
        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
