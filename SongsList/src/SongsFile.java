import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SongsFile {
	public void writeSongsListToFile(String filePath, ArrayList<Song> songs) {
		File file = new File(filePath);
		String textToWrite = "";
		for (Song song : songs) {
			textToWrite+=song.getName() + " " + song.getFilePath() + "\n";
		}
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(textToWrite);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> getSongsListFromFile(String filePath) {
		ArrayList<String> songList = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = reader.readLine()) != null) {
				songList.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return songList;
	}
}
