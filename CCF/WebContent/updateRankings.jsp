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
            <link rel="stylesheet" href="css/admin.css">
            <script src=""></script>      
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
            
            <div class = "addPlayer">
                <h3>Add a player:</h3>
                <br>
                <form id = "addPlayer">
                    Player Tag: <input type = "text" id = "PlayerTag" name = "PlayerTag">
                    Points to add: <input type = "text" id = "points" name = "points">
                    <input type = "submit" value = "Add">
                </form>
            </div>

            <br><br>
            
            <div class = "removePlayer">
                <h3>Remove a player:</h3>
                <br>
                <form id = "removePlayer">
                    Player Tag: <input type = "text" id = "removePlayerTag" title = "Tag Required" placeholder="tag" required>
                    <input type = "submit" value = "Remove">
                </form>
            </div>

            <br><br>
            
            <div class = "players">
                <h3>Update Player Rankings!</h3>
                <ol>
                    <div id = "playerContainer">
                        <li class = "player" draggable="true" ondragenter="dragenter(event)" ondragstart="dragstart(event)">Player 1</li>
                        <li class = "player" draggable="true" ondragenter="dragenter(event)" ondragstart="dragstart(event)">Player 2</li>
                        <li class = "player" draggable="true" ondragenter="dragenter(event)" ondragstart="dragstart(event)">Player 3</li>
                        <li class = "player" draggable="true" ondragenter="dragenter(event)" ondragstart="dragstart(event)">Player 4</li>
                        <li class = "player" draggable="true" ondragenter="dragenter(event)" ondragstart="dragstart(event)">Player 5</li>
                        <li class = "player" draggable="true" ondragenter="dragenter(event)" ondragstart="dragstart(event)">Player 6</li>
                    </div>
                </ol>
                <button type = "text" onclick = "saveListOrder()">Save List!</button>
            </div>
            <div id = "test"></div>
        </body>
</html>

    