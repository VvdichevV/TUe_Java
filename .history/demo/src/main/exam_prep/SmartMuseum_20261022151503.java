package exam_prep;

import java.util.Array

public class SmartMuseum {
    public static void main(String[] args) {

    }
}

class Artwork {
    private String title;
    private String artist;
    private int yearOfCreation;

    public Artwork(String title, String artist, int yearOfCreation) {
        this.title = title;
        this.artist = artist;
        this.yearOfCreation = yearOfCreation;

    }

    public String toString() {
        return title + "(" + yearOfCreation + ") by " + artist;
    }
}

class Gallery{
    private ArrayList<Artwork> artworks;
}