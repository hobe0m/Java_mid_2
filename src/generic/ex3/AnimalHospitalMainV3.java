package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        // 제한이 있기 때문에, Animal 및 그 자식들을 제외하고는 들어올 수 없다.
        // AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1 해결: 개 병원에 고양이 전달
        // dogHospital.set(cat);
        //  > 다른 타입 입력: 컴파일 오류

        // 문제2 해결: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }

    // 타입 매개변수에 입력될 수 있는 상한을 지정(extends X)해서 문제를 해결하였다.

    // 기존 문제와 해결
    // 타입 안전성 문제, 제네릭 도입 문제(모든 타입 사용 가능)
    //  > 제네릭에 타입 매개 변수 상한을 사용해서 둘 다 해결하였다.
}
