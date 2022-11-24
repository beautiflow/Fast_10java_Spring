package Part_02_Object_Oriented_Programming.Chapter_03.ch15.bookShelf;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf(){
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size();
    }
}
