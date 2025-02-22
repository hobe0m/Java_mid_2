package generic.ex2;

public class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
    
    // 객체를 보관할 수 있는 단순한 Generic 클래스
    // 동물을 보관하는 Box
}
