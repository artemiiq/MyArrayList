public class MyArrayList {
    private Object[] elements;
    private int size;


    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }


    //Метод додавання елемента в кінець списку
    public void add(Object value) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = value;
        size++;
    }


    //Метод який видаляє елемент із вказаним індексом
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Індекс виходить за межі списку");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }


    //Метод який очищає колекцію
    public void clear() {
        size = 0;
    }


    //Метод який повертає розмір колекці
    public int size() {
        return size;
    }


    //Метод який повертає елемент за індексом
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Індекс виходить за межі списку");
        }
        return elements[index];
    }


    //Метод для збільшення масиву
    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }
}
