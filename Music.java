
import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlaylistManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> songs = new ArrayList<>();

        while (true) {
            System.out.println("\n=== MUSIC PLAYLIST MANAGER ===");
            System.out.println("1. Add Song");
            System.out.println("2. View Playlist");
            System.out.println("3. Search Song");
            System.out.println("4. Remove Song");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String song = sc.nextLine();
                    songs.add(song);
                    System.out.println("Song added successfully!");
                    break;

                case 2:
                    if (songs.isEmpty()) {
                        System.out.println("Your playlist is empty.");
                    } else {
                        System.out.println("\nYour Playlist:");
                        for (int i = 0; i < songs.size(); i++) {
                            System.out.println((i + 1) + ". " + songs.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter song to search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (String s : songs) {
                        if (s.equalsIgnoreCase(search)) {
                            System.out.println("Song found: " + s);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Song not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter song to remove: ");
                    String remove = sc.nextLine();

                    if (songs.remove(remove)) {
                        System.out.println("Song removed successfully!");
                    } else {
                        System.out.println("Song not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Music Playlist Manager!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
