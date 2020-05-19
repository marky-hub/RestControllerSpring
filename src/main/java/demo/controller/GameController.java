package demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import demo.model.Game;

@RestController
public class GameController {

	List<Game> games = new ArrayList<>(Arrays.asList(
			new Game("G01", "God Of War", "ACTION/ADVENTURE/RPG", 1790),
			new Game("G02", "Persona 5", "JRPG", 990)
			));

	@RequestMapping("/games")
	public List<Game> getAllGames() {
		return games;
	}
	@RequestMapping(value = "/games/{id}",method=RequestMethod.DELETE)
	public void deleteGames(@PathVariable String id) {
		for (int i = 0; i < games.size(); i++) {
			if(games.get(i).getId().equals(id)) {
				games.remove(i);
				break;
			}
		}
	}
}
