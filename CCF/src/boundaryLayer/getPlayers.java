package boundaryLayer;


import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import logicLayer.logicLayer;
import objectLayer.Player;
import persistLayer.DatabaseAccess;

/**
 * Servlet implementation class signUp
 */
@WebServlet("/getplayers")
public class getPlayers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private logicLayer logic = new logicLayer();
	public Player p1 = new Player(1, -1.00 , "bob");
	public Player p2 = new Player(2, -1,  "alice");
	public Player p3 = new Player(3, -1, "mat");

	//Connection c = DatabaseAccess.connect();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPlayers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map <String, Object> pmap = new HashMap<String, Object>();
		
		List<Player> playerlist =  new ArrayList<Player>();
		
		//playerlist.add(p1);
		//playerlist.add(p2);
		//playerlist.add(p3);
		
		playerlist = logic.getAllPlayers();
		
		Collections.sort(playerlist, new Comparator<Player>(){
			@Override
			public int compare(Player p1, Player p2) {
				  Integer v1 = new Integer(p1.getPoints());
				  Integer v2 = new Integer(p2.getPoints());
				  return v2.compareTo(v1);
			}
		});
		
		
		pmap.put("player", playerlist);
		
		write(response, pmap);
 		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		
	}

	private void write(HttpServletResponse response, Map<String, Object> map) throws IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(new Gson().toJson(map));
		
	}

}
