package zadaniaFilip.filip1.Root.Car;


public class Song {
    private int id;



    private String name;
    private String author;
    private String length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Song(String name, String author, String length) {
        this.name = name;
        this.author = author;
        this.length = length;
    }
}
