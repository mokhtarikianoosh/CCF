<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US">
        <head>
            <title>Update Rankings</title>
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">        
            <link rel="stylesheet" href="css/header.css">
            <link rel="stylesheet" href="css/body.css">
            <link rel="stylesheet" href="css/footer.css">
           
           <script src="javascript/jquery-3.1.1.min.js"></script>
            <script src = "./javascript/dragger.js"></script>
            <script src = "./javascript/updateRankings.js"></script>
            
        </head>

        <body>
            <div class = "menu">
                <ul>
                    <li class = "rankings"><a href = "updateRankings.jsp">Add points</a></li>
                    <li class = "tournaments"><a href = "updateTournaments.jsp">Create Tournament</a></li>              
                    <li class = "login"><a href = "index.jsp">Logout</a></li>                      
                </ul>
            </div>
            
            <br><br>
            
            <div class = "addPlayer" align = "middle">
                <h3>Add Points</h3>
                <br>
                <br>
                <br>
                <br>
                <form id = "addPlayer">
                    Player Tag: <input type = "text" id = "PlayerTag" name = "PlayerTag" size = "20">
                    <br>
                    Points:     <input type = "text" id = "points" name = "points" size = "10">
                    <input type = "submit" value = "Add">
                </form>
            </div>

            <br><br>
            
            

           
            <div id = "test"></div>
        </body>
</html>

    