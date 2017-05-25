import java.util.ArrayList;

public class PlayerStarter {
	public static void main(String[] args) {
		SongsFile songsFile = new SongsFile();
		Songs songs = new Songs();
		for (int i = 0; i < 10; i++) {
			songs.addSong(("song" + i), ("C:\\songs\\song" + i + ".mp3"));
			System.out.println(songs.songs.get(i).getName());
		}
		songsFile.writeSongsListToFile("D:\\songs\\songsFile.txt", songs.songs);
		ArrayList<Song> a =songs.randomList(songs.songs);
		System.out.println("-----");
		for(int i = 0; i<a.size();i++){
			System.out.println(a.get(i).getName());
		}
		System.out.println("Done");
	}
}
