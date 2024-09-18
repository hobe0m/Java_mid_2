package generic.animal;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal {
    public Dog(String name, int size) {
        super(name, size);
    }

    // ctrl + o : 오버라이딩
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
