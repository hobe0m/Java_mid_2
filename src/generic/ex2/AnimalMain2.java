package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("강아지", 100);
        Cat cat = new Cat("고양이", 50);

        Box<Animal> animalBox = new Box<>();

        // Animal이 부모이므로, 하위 타입인 Dog와 Cat도 들어갈 수 있다.
        // Animal 타입을 Dog과 Cat이 상속받고 있으므로 인자로 사용할 수 있다.
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);

        // 또한 set(Animal value)이므로 set()에 Animal의 하위 타입인 Dog, Cat도 전달할 수 있다.
        // 물론 이 경우 꺼낼 때는 Animal 타입으로만 꺼낼 수 있다.
    }
}
