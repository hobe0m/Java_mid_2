package generic.ex5;

public class Box<T> {
    // WildCard(와일드카드)
    // 제네릭 타입을 조금 더 편리하게 사용할 수 있는 것
    // 와일드 카드란 컴퓨터 프로그래밍에서 *, ? 와 같이 하나 이상의 문자들을 상징하는 특수 문자를 뜻한다.
    //  - 쉽게 이야기 해서 여러 타입이 들어올 수 있다는 뜻이다.
    private T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}
