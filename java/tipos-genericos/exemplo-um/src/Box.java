public class Box<T> { // Classe com tipo genérico T (que será informado quando uma instância for criada)
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
