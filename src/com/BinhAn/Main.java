package com.BinhAn;

public class Main {

    public static void main(String[] args) {
	MyArrayList myArrayList = new MyArrayList<>();
    myArrayList.add(1);
    myArrayList.add(2);
    myArrayList.add(4);
    myArrayList.add(3);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));

        }

    }
}
