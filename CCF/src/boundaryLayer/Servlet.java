package boundaryLayer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.Collator;
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
import javax.servlet.http.HttpSession;

import logicLayer.logicLayer;
import objectLayer.Player;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static  String  templateDir = "";
	static  String  resultTemplateName = "sign-up.ftl"; 
	
	
	
	public void init()
	{
	    // Prepare the FreeMarker configuration;
	    // - Load templates from the WEB-INF/templates directory of the Web app.
	    //
		
	}

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		logicLayer logicLayer = new logicLayer();

		
		BufferedWriter toClient = null;
		
		
		
		HttpSession httpSession = request.getSession();
		System.out.println(httpSession.getAttribute("ssid"));
		
		List<Player> players = null;
		
		players = logicLayer.getAllPlayers();
		Collections.sort(players, new Comparator<Player>(){
			@Override
			public int compare(Player p1, Player p2) {
				  Integer v1 = new Integer(p1.getPoints());
				  Integer v2 = new Integer(p2.getPoints());
				  return v1.compareTo(v2);
			}
		});
		
		System.out.println(players.toString());
		
		Map<String,Object> root = new HashMap<String,Object>();
		 
		root.put("Players", players); 
	
		 
	}
	
	
	
	
	

}
