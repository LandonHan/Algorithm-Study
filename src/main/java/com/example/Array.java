package com.example;

import java.sql.SQLOutput;

/**
 * @author liuhan18
 */

public class Array {

    // getSize find insert delete printAll

    private int data[];
    private int size;
    private int capacity;

    public Array(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public int find(int num) {
        for (int i = 0; i < size; ++i) {
            if (data[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public int insert(int num, int pos) {
        // 如果数组空间满了或下标有问题，直接返回-1
        if (size == capacity || pos > size || pos < 0) {
            return -1;
        }
        // 空间没满且下标正确，可以继续插入
        for(int i = size; i > pos; --i) {
            data[i] = data[i - 1];
        }
        data[pos] = num;
        ++size;
        return 0;
    }

    public int delete(int pos) {
        if (pos < 0 || pos >= size) {
            return -1;
        }
        for (int i = pos; i < size - 1; ++i) {
            data[i] = data[i + 1];
        }
        --size;
        return 0;
    }

    public void printAll() {
        for (int i = 0; i < size; ++i) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
