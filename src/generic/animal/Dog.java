package generic.animal;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal {
    public Dog(String name, int size) {
        super(name, size);
        // 슈퍼 클래스에 있는 생성자를 만들어준다.
        // 부모를 상속받아, 부모의 필드도 사용할 수 있기 때문에 반드시 포함해야 한다.
    }

    // ctrl + o : 오버라이딩
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
