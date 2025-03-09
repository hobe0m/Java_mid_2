package generic.ex4;

import generic.animal.Animal;

// 제네릭 타입과 제네릭 메서드의 우선 순위
//  > 제네릭 타입과 제네릭 메서드를 하나의 타입 매개변수로 선언
//  > 제네릭 타입보다 제네릭 메서드가 더 높은 우선 순위를 가진다.
//   > 프로그래밍에서는 가깝고(Scope) 구체적인 것이 우선순위를 가진다.
public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) {
        System.out.println("animal.className : " + animal.getClass().getName());
        System.out.println("t.className : " + t.getClass().getName());
        return t;
    }

    // 참고
    // 프로그래밍에서 모호한 것은 좋지 않기 때문에, 만약 제네릭 타입과 제네릭 메서드가 중복된다면 둘 중 하나를 바꿔주면 된다.
}
