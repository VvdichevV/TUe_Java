package exam_prep;

import java.util.ArrayList;
import java.math.*;

public class SmartMuseum {
    public static void main(String[] args) {

    }
}

class Artwork {
    String title;
    String artist;
    int yearOfCreation;

    public Artwork(String title, String artist, int yearOfCreation) {
        this.title = title;
        this.artist = artist;
        this.yearOfCreation = yearOfCreation;

    }

    public String toString() {
        return title + "(" + yearOfCreation + ") by " + artist;
    }
}

class Gallery {
    private ArrayList<Artwork> artworks = new ArrayList<>();

    public Artwork oldestArtworkBy(String artist) {
        Artwork oldestArtwork = null;
        for (Artwork artwork : artworks) {
            if (artwork.artist.equals(artist) && (oldestArtwork.yearOfCreation > artwork.yearOfCreation) {
                oldestArtwork = artwork;
            }
        }
        return oldestArtwork;
    }

    void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    void printArtworks() {
        for (Artwork artwork : artworks) {
            System.out.println(artwork.toString());
        }
    }
}

class Painting extends Artwork {
    private String paintType;
    private double height;
    private double width;

    public Painting(String title, String artist, int yearOfCreation, String paintType, double height, double width) {
        super(title, artist, yearOfCreation);
        this.paintType = paintType;
        this.height = height;
        this.width = width;
    }
}

class Sculpture extends Artwork {
    private String material;
    private double weight;

    public Sculpture(String title, String artist, int yearOfCreation, String material, double weight) {
        super(title, artist, yearOfCreation);
        this.material = material;
        this.weight = weight;
    }
}

class DigitalArt extends Artwork {
    private double fileSize;
    private String resolution;

    public DigitalArt(String title, String artist, int yearOfCreation, String resolution, double fileSize) {
        super(title, artist, yearOfCreation);
        this.resolution = resolution;
        this.fileSize = fileSize;
    }
}