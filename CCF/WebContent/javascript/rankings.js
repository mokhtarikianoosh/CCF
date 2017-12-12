$(document).ready(function() {

	console.log("WE ARE HERE");
	
	$.ajax({
		
		url: "getplayers",
		type: 'GET',
		dataType: "json",
		success: function(Player){
			
			
			console.log("WE ARE HERE");
			var html = "";
			
			console.log(Player);
		
		
			$.each(Player.player, function(index, p){
				
				var rank = index + 1;
				
				
				
				 html +=  '<tr>' +
	                '<td><strong> ' + rank + '<strong></td>    '   +              
	                '<td>  ' + p.playerTag + '</td>' + 
	                '<td> ' + p.points + '</td>' + 
	           '</tr>';
				 
				 console.log(html);
				
				
			});
		
			
	          $("#playerContainer").append(html);
				//console.log(p.rankValue);
				
		}
			
			
			
			
		
		
		
	});
	
	
});



		
		
	
	
	
	
	
	
    //loadPlayers();

    //loads subsequent players from database, creates html for each, and inserts them into table
    
    
    
    
   
    
    
    /*
    function loadPlayers() {
        var requestURL = "Servlet?loadPlayers";
        $.get(requestURL, function(result, response){
            $("#playerContainer").html("");
            $each(result, function (index, Player){
                var html = '  <tr>' +
                '<td>' + Player.rankValue + '</td>    '   +              
                '<td>' + Player.playerTag + '</td>' + 
            '</tr>';
            $("#playerContainer").append(html);
            });
        });
    }
    
	
	*/