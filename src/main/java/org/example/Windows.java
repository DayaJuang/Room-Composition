package org.example;

public class Windows {
    private int size;

    public Windows(int size) {
        this.size = size;
    }

    public void open(){
        System.out.println("Opening the window");
    }

    public void close(){
        System.out.println("Closing the window");
    }

    public int getSize() {
        return size;
    }
}
