package com.BinhAn;

import java.util.Arrays;

public class MyArrayList<T> {
    private static final int  DEFAULT_CAPACITY = 10; // sức chứa
    private int size = 0;
    private Object[] elements; // mảng số nguyên

    public MyArrayList(){
        this.elements = new Object[ DEFAULT_CAPACITY];//mảng có 10 phần tử
    }

    public void add(T t){ // T kiểu dữ liệu tham số và t là tên biến
       // System.out.println(this.elements.length); //10
       // elements.length == size
        if (elements.length == size){
            // tổng sức chứa của mảng
            int newCapacity = this.elements.length * 2;
          //  int newCapacity = DEFAULT_CAPACITY * 2; => lỗi
            this.elements = Arrays.copyOf(this.elements, newCapacity);
        }
        this.elements[this.size] = t;
        this.size++;
    }
    public int size(){ // lấy ra số lượng phần tử trong mảng
        return this.size;
    }
    public T get(int index){
        if (index<0 || index >= this.size){
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size " + this.size );// nếu vị trí không hợp lệ ném ra lỗi
        }
        return (T) this.elements[index];
    }

}
