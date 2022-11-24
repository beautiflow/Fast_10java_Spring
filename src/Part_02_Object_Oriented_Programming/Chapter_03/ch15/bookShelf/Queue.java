package Part_02_Object_Oriented_Programming.Chapter_03.ch15.bookShelf;

public interface Queue {

    void enQueue(String title);
    String deQueue();

    int getSize();
}
