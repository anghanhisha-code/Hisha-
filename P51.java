import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {

        // Create LinkedList for playlist
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs to the playlist
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        System.out.println("Initial Playlist:");
        System.out.println(playlist);

        // 2. Display full playlist
        System.out.println("\nFull Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }

        // 3. Play first song (remove from front)
        System.out.println("\nPlaying first song: " + playlist.removeFirst());

        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        // 4. Skip last song (remove from end)
        System.out.println("\nSkipping last song: " + playlist.removeLast());

        // 5. Display updated playlist
        System.out.println("Updated Playlist:");
        System.out.println(playlist);
    }
}
