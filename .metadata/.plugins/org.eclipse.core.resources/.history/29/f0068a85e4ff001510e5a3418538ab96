package Database;

import java.util.List;

import Model.TournamentType;
import Model.User;

public interface DataAccessObject {

	boolean createUser(User user);
	boolean createTournament(String name);
	boolean createEditor(String name);
	String  getUserPassword(String email);
	boolean updateTournament(int countTeams, List<String> teams, TournamentType ttype);
	boolean deleteEditor(String name);
	boolean deleteTournament(String name);

}
