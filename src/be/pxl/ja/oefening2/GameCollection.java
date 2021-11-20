package be.pxl.ja.oefening2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class GameCollection {
	private List<VideoGame> videoGames = new ArrayList<>();

	public void addGame(VideoGame game) {
		videoGames.add(game);
	}

	public ArrayList<VideoGame> selectGames(Predicate<VideoGame> filter) {
		ArrayList<VideoGame> selectedGames = new ArrayList<>();
		for (VideoGame game : videoGames){
			if (filter.test(game)){
				selectedGames.add(game);
			}
		}
		return selectedGames;
	}

}
