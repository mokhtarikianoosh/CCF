package boundaryLayer;


import java.io.IOException;
import java.sql.Connection;
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
@WebServlet("/addPoints")
public class addPoints extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private logicLayer logic = new logicLayer();
	Connection c = DatabaseAccess.connect();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addPoints() {
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
		
		 int point = 0;
		Map <String, Object>  map =  new HashMap <String, Object>();
		
		Boolean isValid = false;
		Boolean going = true;
		
		String username = request.getParameter("PlayerTag");
	    
		String points =request.getParameter ("points");
		
		for(int i = 0; i <points.length(); i++){
			if(Character.digit(points.charAt(i),10) < 0) 
				going = false;
			
		}
		
		if(going){
		point = Integer.parseInt(points);
		}
		
	    isValid = logic.validatePlayer(username);
	    
	    System.out.print(isValid);
	    
	    if(isValid)
	    logic.addPoints(username, point);
	    
	    
	

		
		map.put("isValid", isValid);
		map.put("username", username);
		
		write(response, map);
	}

	private void write(HttpServletResponse response, Map<String, Object> map) throws IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(new Gson().toJson(map));
		
	}

}
