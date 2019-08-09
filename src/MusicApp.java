import java.util.ArrayList;

public class MusicApp {

    double version;
    ArrayList<Song> library;

    public MusicApp(double version) {
        this.version = version;
        this.library = LibraryService.updateLibrary();
    }
}