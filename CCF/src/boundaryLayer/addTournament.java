package boundaryLayer;


import java.io.IOException;
import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import logicLayer.logicLayer;
import persistLayer.DatabaseAccess;

/**
 * Servlet implementation class signUp
 */
@WebServlet("/addTournament")
public class addTournament extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private logicLayer logic = new logicLayer();
	Connection c = DatabaseAccess.connect();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addTournament() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Map <String, Object>  map =  new HashMap <String, Object>();
		
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		String type = request.getParameter("versusNumber");
		String entryFee = request.getParameter("entryFee");
		String fPrize = request.getParameter("firstPlace");
		String sPrize = request.getParameter("secondPlace");
		String tPrize = request.getParameter("thirdPlace");
		
		//int lol = Integer.parseInt(fPrize);
		
		
		int id = -1;
		
		logic.addTournament(id, name, date, type, entryFee, fPrize, sPrize, tPrize);
		
		
	   // Int rank = request.getParameter("");
	
		
		
		
		
		
		write(response, map);
	}

	private void write(HttpServletResponse response, Map<String, Object> map) throws IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(new Gson().toJson(map));
		
	}

}
