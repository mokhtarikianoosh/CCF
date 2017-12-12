package persistLayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import objectLayer.Player;
import objectLayer.Tournament;

public class TournamentPersists {
	
	public int insertTournament(Tournament t){
		String query = "INSERT INTO Tournament (name, date, entryFee, type, fPrize, sPrize, Tprize)" 
				+ "VALUES ('" + t.getName() + "', '" +  t.getDate() 
				+ "', '" + t.getEntrefee() + "' , '" + t.getType() + "' , '" +  t.getFirstPrizee() +
				"' , '" + t.getSecondPrize() + "' , '" + t.getThirdPrize() +  "')";
		int ret = DatabaseAccess.create(query);
		
		DatabaseAccess.disconnect();
		
		return ret;
	}
	
	public int deleteTournament(int id){
		String query = "DELETE FROM Tournament WHERE id = " + id + ";";
		return DatabaseAccess.delete(query);
	}
	
	public Tournament getTournament(int id) {
		Tournament t = null;
		return t;
	}
	
	
	public List <Tournament> getAllTournament() {
		
		List <Tournament> T  = new ArrayList <Tournament>();
		String query = "SELECT * FROM Tournament";
		Tournament tour;
		
		
		ResultSet result = DatabaseAccess.retrieve(query);
		
		
		
		try {
		
			
			while(result.next()) {
				
			String	name = result.getString("name");
			String	date = result.getString("date");
			String	entryFee = result.getString("entryFee");
			String	type = result.getString("type");
			String	fPrize = result.getString("fPrize");
			String	sPrize = result.getString("sPrize");
			String	tPrize = result.getString("tPrize");
				
				tour = new Tournament(0, name , date ,type , fPrize, sPrize, tPrize, entryFee);
				
				T.add(tour);
				
			}
		
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
		
		return T;
		
	}
	
	
	/*
	public Tournament getTournament(String tournamentName) {
		String query = "SELECT id, Date, EmbedCode";
		ResultSet result = DatabaseAccess.retrieve(query);
		Tournament tournament = null;
		try {
			while (result.next()) {
				tournament = new Tournament(result.getInt("id"),
						result.getString("EmbedCode"),
						result.getDate("Date")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DatabaseAccess.disconnect();
		return tournament;
	}
	
	
	*/
}
