public class App {

    public static void main(String[] args) {
        Desktop fersApp = new Desktop("2.4.2.12");

        for (Song song : fersApp.library) {
            System.out.println("song.getName() = " + song.getName());
        }

        // last song
        String display = fersApp.play(fersApp.library.get(fersApp.library.size()-1));

        System.out.println("display = " + display);

        for (Song song : fersApp.library) {
            System.out.println("fersApp.play(song) = " + fersApp.play(song));
        }

        fersApp.printLog();

    }
}