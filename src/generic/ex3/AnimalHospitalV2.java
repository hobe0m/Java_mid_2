package generic.ex3;


public class AnimalHospitalV2<T> {

    private T animal;

    // public AnimalHospitalV2(T animal) {
    //    this.animal = animal;
    // }

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다.
        // Object의 기능만 사용 가능
        animal.toString();
        animal.equals(null);

        // 컴파일 오류 발생
        // System.out.println("동물 이름 : " + animal.getName());
        // System.out.println("동물 크기 : " + animal.getSize());
        // animal.sound();

        // 현재는 animal이 어떤 타입인지 알 수 없기 때문에 발생한다.
        //  - 따라서 toString(), equals(), hashCode()와 같은 Object의 메서드들만 사용할 수 있다.
    }

    public T getBigger(T target) {
        // 컴파일 오류
        // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
