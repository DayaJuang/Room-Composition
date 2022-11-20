package org.example;

public class Door {
    private int size;
    private String color;

    public Door(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void openDoor(){
        System.out.println("Opening the door");
    }

    public void closeDoor(){
        System.out.println("Closing the door");
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
