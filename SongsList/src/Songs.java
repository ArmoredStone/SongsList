import java.util.ArrayList;
import java.util.Random;

public class Songs {

	public ArrayList<Song> songs = new ArrayList<>();

	public void addSong(String name, String filePath) {
		Song song = new Song();
		song.setName(name);
		song.setFilePath(filePath);
		songs.add(song);
	}

	public void removeSong(String name, String filePath) {
		Song song = new Song();
		song.setName(name);
		song.setFilePath(filePath);
		if (songs.contains(song)) {
			songs.remove(song);
		}
	}

	public ArrayList<Song> randomList(ArrayList<Song> songs) {
		Random random = new Random();
		ArrayList<Song> randomSongs = new ArrayList<>();
		ArrayList<Song> tempList = new ArrayList<>();
		if (!songs.isEmpty()) {
			for (Song song : songs) {
				tempList.add(song);
			}
			while (!tempList.isEmpty()) {
				int a = random.nextInt(tempList.size());
				randomSongs.add(tempList.get(a));
				tempList.remove(a);

			}
		}
		return randomSongs;
	}
}
