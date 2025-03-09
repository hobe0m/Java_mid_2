package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;
import generic.ex3.AnimalMethod;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);

        // 타입 매개변수 추론에 의해 <Dog>를 써주지 않아도 된다.
        //  > 당연히 강아지와 고양이는 비교 불가하다.
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
