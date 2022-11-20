package org.example;

public class Room {
    private Door door;
    private Wall wall;
    private Windows windows;

    public Room(Door door, Wall wall, Windows windows) {
        this.door = door;
        this.wall = wall;
        this.windows = windows;
    }

    public void enterRoom(){
        door.openDoor();
        door.closeDoor();
        lockTheDoor();
    }

    private void lockTheDoor(){
        System.out.println("Locking the door");
    }
}
