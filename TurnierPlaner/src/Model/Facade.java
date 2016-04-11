package Model;

import java.util.List;


public interface Facade {

	boolean registerUser(User user);
	boolean login(User user);
	boolean logout(User user);
	boolean createTournament(String name);
	boolean editTournament(int countTeams, List<String> teams, TournamentType ttype);
	boolean addEditor(String name);
	boolean deleteEditor(String name);
	boolean deleteTournament(String name);
	
}
