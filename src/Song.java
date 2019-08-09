import java.time.Duration;

public class Song {

    private Integer id;
    private String name;
    private Duration length;
    private String lyrics;
    private String[] artists;

    public Song(Integer id, String name, Duration length, String lyrics, String[] artists) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.lyrics = lyrics;
        this.artists = artists;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getLength() {
        return length;
    }

    public void setLength(Duration length) {
        this.length = length;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String[] getArtists() {
        return artists;
    }

    public void setArtists(String[] artists) {
        this.artists = artists;
    }

    public String displayArtistAsText(){
        String names = "";
        for (String artist: this.getArtists()) {
            names += artist +", ";
        }
        return names;
    }
}