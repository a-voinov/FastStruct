package com.quiz.fast;

/**
 * Some class with any data, whatever
 */
public class Data {
    private int value;

    public Data() {
        value = 0;
    }

    public Data(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "value=" + value +
                '}';
    }
}
