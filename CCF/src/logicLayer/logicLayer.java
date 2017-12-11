package logicLayer;

import java.sql.Connection;
import java.util.Date;
import java.util.List;
import objectLayer.Player;
import objectLayer.Tournament;
import persistLayer.*;

public class logicLayer {

	public logicLayer (){
		
	}
	
	public List<Player> getAllPlayers(){
		List<Player> result = null;
	PlayerPersists x = new PlayerPersists();
		result = x.getAllPlayers();
		return result;
	}
	
	public void createPlayer(String username){
		Player p = new Player(0, -1, username);
		PlayerPersists pp = new PlayerPersists();
		pp.insertPlayer(p);
	}
	
	
	
	public Boolean validatePlayer(String tag){
		
		Player p = new Player(0,-1,tag);
		PlayerPersists pp = new PlayerPersists();
		Boolean Valid = pp.validateName(tag);
		if(Valid)
			return true;
		else
			return false;
		

	}
	
	public String getPlayerId(String tag){
		
		Player p = new Player(0,-1,tag);
		PlayerPersists pp = new PlayerPersists();
		
		 return pp.getPlayerId(tag);
		
		
		
		
		
	}
	
	public void addPoints(String tag, int points){
		
		Player p = new Player(0,-1,tag);
		PlayerPersists pp = new PlayerPersists();
		
		if(pp.validateName(tag)){
			
		
		
		String id = pp.getPlayerId(tag);
		
		pp.addPoints(id, points);
		
		}
	}
		
		
		

	
	public void addTournament(int id ,String name, String date, String type, String entryFee,  String firstPrize, String secondPrize , String thirdPrize){
		
		Tournament T = new Tournament (id, name , date ,type, entryFee, firstPrize, secondPrize, thirdPrize);
		
		TournamentPersists TP = new TournamentPersists();
		TP.insertTournament(T);
		
	
		
		
	}



}
