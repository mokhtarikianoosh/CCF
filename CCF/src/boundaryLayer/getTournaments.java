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
import objectLayer.Tournament;
import persistLayer.DatabaseAccess;

/**
 * Servlet implementation class signUp
 */
@WebServlet("/getTournaments")
public class getTournaments extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private logicLayer logic = new logicLayer();
	

	//Connection c = DatabaseAccess.connect();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTournaments() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map <String, Object> pmap = new HashMap<String, Object>();
		
		List<Tournament> tlist =  new ArrayList<Tournament>();
		
		//playerlist.add(p1);
		//playerlist.add(p2);
		//playerlist.add(p3);
		
		tlist = logic.getAllTournament();		
		
		
		pmap.put("tlist", tlist);
		
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
