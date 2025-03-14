package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    // 와일드 카드 하한 지정
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);

        // writeBox(dogBox); // 하한이 Animal이어야 한다.
        // writeBox(catBox); // 하한이 Animal이어야 한다.
        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    // 메서드에서 super를 사용하므로 animal 자신이거나 animal 보다 높아야 한다.
    // ?, 와일드 카드는 Animal 보다 상위에 위치해야 한다.
    // ?는 Animal의 상위 타입이라는 뜻
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
