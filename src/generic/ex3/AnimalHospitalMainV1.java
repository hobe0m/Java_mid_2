package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
        dogHospital.set(cat); // 매개변수 체크 실패: 컴파일 오류가 발생하지 않음, animal 타입이기 때문에 개 병원에 고양이도 넣을 수 있다.

        // 문제2: 개 타입 반환, 캐스팅 필요
        //  - 실제로는 Dog이 반환되겠지만, 타입은 Animal이기 때문에 다운캐스팅이 필요하다.
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
    // Animal 객체 사용으로 인해 코드 재사용성은 증가하였다.
    // 하지만 타입 안전성은 반대로 떨어진다.

}
