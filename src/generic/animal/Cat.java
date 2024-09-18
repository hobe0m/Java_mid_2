package generic.animal;

public class Cat extends Animal {
    public Cat(String name, int size) {
        super(name, size);
    }

    // ctrl + o : 오버라이딩
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
