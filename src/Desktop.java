import java.util.Date;
import java.util.HashMap;

public class Desktop extends MusicApp implements MusicPlayer  {

    HashMap<String, Integer> log;

    public Desktop(String version) {
        super(version);
        this.log = new HashMap<>();
    }

    @Override
    public String play(Song song) {
        this.log.put(String.valueOf(new Date().getTime()) + song.getId(), song.getId());
        return "Playing: " + song.getName() + " by " + song.displayArtistAsText();
    }

    public void printLog(){
        for (String key : this.log.keySet()) {

            Song song = super.library.get(
                    this.log.get(key) - 1
            );

            System.out.println("LOG: "
                    + key
                    + " "
                    + song.getId()
                    + " "
                    + song.getName()
                    + " "
                    + song.displayArtistAsText()
            );
        }

    }
}