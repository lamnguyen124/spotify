import java.util.ArrayList;

public class MusicApp {

    String version;
    ArrayList<Song> library;

    public MusicApp(String version) {
        this.version = version;
        this.library = LibraryService.updateLibrary();
    }
}
