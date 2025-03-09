package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

        catBox.set(new Cat("야옹이", 200));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        // 반환 타입이 Animal이기 때문에 Animal로 받아야 한다.
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
        Dog wiidcardDog = (Dog) WildcardEx.printAndReturnWildcard(dogBox);

        // 와일드카드는 값을 꺼내면, Animal이 나오고 반환도 Animal으로 한다.

        // 와일드 카드와 제네릭 메서드
        //  - 와일드 카드는 전달한 타입을 명확하게 반환할 수 없다.
        //   - cat을 전달해도, dog를 전달해도 Animal(상한)으로 반환
        //  - 제네릭 메서드는 전달한 타입을 명확하게 반환할 수 있다.
        //   - cat이나 dog를 전달하면 해당 타입을 반환

        // 와일드 카드는 이미 만들어진 제네릭 타입을 전달받아서 활용할 떄 사용한다.
        // 따라서 메서드의 타입들을 타입 인자를 통해 변경할 수 없다.
        // 쉽게 말해서 일반적인 메서드에 사용한다고 생각하면 된다.

        // 정리하면, 제네릭 타입이나 제네릭 메서드가 꼭 필요한 상황이면 <T>를 사용하고, 그렇지 않은 상황이면 와일드카드를 사용하는 것을 권장한다.
    }
}
