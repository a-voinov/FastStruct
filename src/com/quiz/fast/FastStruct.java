package com.quiz.fast;

/**
 * All Operations with Array must execute in constant time
 */
public class FastStruct {

    private Data[] array;
    private Data[] shadowArray;
    private Data memCell = new Data();

    public FastStruct(int n) {
        this.array = new Data[n];
        this.shadowArray = new Data[n];
        for (int i = 0; i < n; i++) {
            this.array[i] = new Data();
            this.shadowArray[i] = memCell;
        }
    }

    public int get(int i) {
        return this.array[i].get();
    }

    public void set(int i, int v) {
        this.array[i] = new Data(v);
    }

    public void setAll(int v) {
        this.memCell.set(v);
        this.array = this.shadowArray;
    }
}
