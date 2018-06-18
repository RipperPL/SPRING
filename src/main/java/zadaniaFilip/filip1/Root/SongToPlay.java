package zadaniaFilip.filip1.Root;

import org.springframework.data.annotation.Id;

public class SongToPlay {
    @Id
    private String id;
    private String name;
    private String author;
    private String length;

    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "music{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
