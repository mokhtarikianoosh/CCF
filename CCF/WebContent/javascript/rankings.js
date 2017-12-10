$(document).ready(function() {

	
	$.ajax({
		
		url: "getplayers",
		type: 'GET',
		dataType: "json",
		success: function(Player){
			var html = "";
			$.each(Player.player, function(index, p){
			
			
	

				
				 html +=  '<tr>' +
	                '<td>' + p.rankValue + '</td>    '   +              
	                '<td>' + p.playerTag + '</td>' + 
	               
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