package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("강아지", 100);
        Cat cat = new Cat("고양이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog); // 강아지 말고 다른 것을 넣으면 컴파일 오류 발생
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get(); // 마찬가지로 고양이 말고 다른 것을 넣으면 컴파일 오류 발생
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);

        // Box 제네릭 클래스에 각각의 타입에 맞는 동물들을 보관하고 꺼낸다.
        // Box<Dog> dogBox : Dog 타입을 보관할 수 있다.
        // Box<Cat> catBox : Cat 타입을 보관할 수 있다.
        // Box<Animal> animalBox : Animal 타입을 보관할 수 있다.
    }
}
