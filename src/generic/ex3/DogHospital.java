package generic.ex3;

import generic.animal.Dog;

// 이번에는 동물 병원을 만들어보자
// 요구사항 : 개 병원은 개만 받을 수 있고, 고양이 병원은 고양이만 받을 수 있어야 한다.
public class DogHospital {

    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

    // 개 병원은 내부에 Dog 타입을 가진다.
    // checkup() : 개의 이름과 크기를 출력하고, 개의 sound() 메서드를 호출한다.
    // bigger() : 다른 개와 크기를 비교하고 둘 중 큰 개를 반환한다.
}
