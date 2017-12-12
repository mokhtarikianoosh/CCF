<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    	<br>
        <title>Rankings</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">    
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" href="css/body.css">
        <link rel="stylesheet" href="css/footer.css">
        <script src="javascript/jquery-3.1.1.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src = "./javascript/rankings.js"></script>
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


        <div class = "ranks" >
        <img src = "./images/pod.png" alt = "pod" align = "middle" style="width: 20%; height: 20%">
            <h1>Athens Georgia Melee Power Rankings</h1>
            <table id = "playerTable" align="center">
                <tbody id = "playerContainer">
                    <tr>
                        <th>Rank</th>
                        <th>Name</th>
                        <th>Points</th>
                    </tr>
                   
                </tbody>
            </table>
        </div>
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