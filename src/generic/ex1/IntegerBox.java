package generic.ex1;

public class IntegerBox {
    // 제네릭이 필요한 이유
    // 대부분의 최신 프로그래밍 언어는 제네릭(Generic) 개념을 제공하기 때문이다.
    
    private Integer value;

    public void set(Integer value) {
        this.value = value;
    }

    public Integer get() {
        return value;
    }
    
    // 숫자를 보관하고 꺼낼 수 있는 단순한 기능 제공
}
