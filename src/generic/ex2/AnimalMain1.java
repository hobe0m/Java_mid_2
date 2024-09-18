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
        dogBox.set(dog); // 다른 것을 넣으면 컴파일 오류 발생
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);
    }
}
