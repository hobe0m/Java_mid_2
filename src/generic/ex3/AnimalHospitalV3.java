package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    // T에 extends Animal을 추가하면 Animal 혹은 Animal의 자식들만 사용할 수 있게끔 제한할 수 있다.
    // 컴파일러는 T는 Animal이나 그 자식들만 받으니까, Animal의 기능을 사용할 수 있게 한다.
    private T animal;
    public void set(T animal) {
        this.animal = animal;
    }

    // Animal의 기능
    public void checkup() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    // Animal의 기능
    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
