package be.pxl.ja.oefening2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GameBrowser {

	private GameCollection gameCollection;


	public GameBrowser(GameCollection gameCollection) {
		this.gameCollection = gameCollection;
	}

	public List<VideoGame> showFreeGames() {
		Predicate<VideoGame> filter = (game) -> game.getPrice() == 0;
		return gameCollection.selectGames(filter);
	}

	public List<VideoGame> showGamesInGenre(String action) {
		Predicate<VideoGame> filter = (game) -> game.getGenres().contains(action);
		return gameCollection.selectGames(filter);
	}

	public List<VideoGame> showGamesForSearch(String cd) {
		Predicate<VideoGame> filter = new Predicate<VideoGame>() {
			@Override
			public boolean test(VideoGame videoGame) {
				return videoGame.getName().toUpperCase().contains(cd.toUpperCase());
			}
		};
		return gameCollection.selectGames(filter);
	}
}
