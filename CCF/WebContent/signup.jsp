<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    		<meta charset="UTF-8">
        <title>Sign Up</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
            
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" href="css/body.css">
        <link rel="stylesheet" href="css/footer.css">
        <script src="javascript/jquery-3.1.1.min.js"></script>
        <script src="javascript/signup.js"></script>
   

    </head>

    <body>
         <div class = "menu">
             <ul>
                <li class = "home"><a href = "index.jsp">Home</a></li>
                <li class = "rankings"><a href = "rankings.jsp">Rankings</a></li>
                <li class = "tournaments"><a href = "tournaments.jsp">Tournaments</a></li>
                <li class = "sign-up"><a href = "signup.jsp">Sign-up</a></li>
                <li class = "login"><a href = "login.jsp">Login</a></li>
                    
            </ul>
        </div>

        <br>
        <div class = "signingUp" align = "center">
        	<h2>Sign up for the next Classic City Fisticuffs!</h2><br><br><br><br>
        	<form id="updateUserName">
        		<label for ="username"> Username:</label>
        		<input type = "text" id= "username" name = "username">
        		<input type = "submit" />
        	</form>
        	<p id="displayName"/>
        </div>
        
    
        <br><br>
                       
        

    
    <br>

    </body>

    
    <footer> 
            <table class = "footerTable">
                <tr>
                    <th>Follow</th>
                    <th> </th>
                    <th>Contact</th>
                </tr>
                <tr>
                    <td><a href = "https://www.facebook.com/groups/239983529490727/?ref=bookmarks"><img src = "./images/facebooklogo.png" alt = "Facebook Link" ></a></td>
                    <td></td>
                    <td>Eric Holbrook</td>
                </tr>
                <tr>
                    <td><a href = "https://www.reddit.com/r/smashbros/"><img src = "./images/redditlogo.png" alt = "Reddit Link"></a></td>
                    <td>Super Smash Brothers Melee</td>
                    <td>eah52463@uga.edu</td>
                </tr>
                <tr>
                    <td><a href = "https://www.youtube.com/channel/UC9V8o-xhgYkW0fsZF4vvX_g"><img src = "./images/youtubelogo.png" alt = "YouTube Link"></a></td>
                    <td></td>
                    <td>(678) 640-1443</td>
                </tr>
    
            </table>
    
        </footer>
</html>