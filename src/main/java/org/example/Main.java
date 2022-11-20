package org.example;

public class Main {
    public static void main(String[] args) {
        Door door = new Door(20,"Brown");
        Windows windows = new Windows(10);
        Wall wall = new Wall(120,100,"White");

        Room myRoom = new Room(door,wall,windows);

        myRoom.enterRoom();
    }
}