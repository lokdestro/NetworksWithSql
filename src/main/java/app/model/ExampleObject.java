package app.model;

public class ExampleObject {

    private String name;
    private int value;

    // Конструкторы
    public ExampleObject() {}

    public ExampleObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

