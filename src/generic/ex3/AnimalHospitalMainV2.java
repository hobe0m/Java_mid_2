package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }

    // Generic에서 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다.
    // 따라서 타입 매개변수를 어떤 타입이든 수용 가능한 Object로 가정하고, Object의 기능만 사용할 수 있다.

    // 우리는 동물병원에 개나 고양이만 방문하는 것을 예상하지만, 그 외에 책이나 사람 등 모든 것들이 방문할 수 있다는 문제가 생긴다.
    // 따라서 타입 매개변수를 제한해야 한다.
}
