
$(document).ready(function(){

$.ajax({
		
		url: "getplayers",
		type: 'GET',
		dataType: "json",
		success: function(Player){
			
			
			var html = "";
		
		
			$.each(Player.player, function(index, p){
				
				
				
				 html +=  '<tr>' +
	                        
	                '<td>' + p.playerTag + '</td>' + 
	               
	           '</tr>';
				 
				 console.log(html);
				
				 console.log(p.playerTag);
				
			});
		
			console.log(html);
	          $("players").append(html);
				//console.log(p.rankValue);
				
		}
});
	
	
	


	$('#updateUserName').submit(function(event){
		

		$.ajax({
			url:"signup",
			type: "POST",
			dataType: "json",
			data: $("#updateUserName").serialize(),
			success: function(data){
				
				$("#displayName").hide();
				$("#displayName").html(data.username + " has successfully signed up");

				$("#displayName").fadeIn(500);	
				
				$("#displayName").fadeOut(3000);
				
				$( "#updateUserName" ).each(function(){
            	    this.reset();
            	});
			}
			
			
		});
		return false;
	});
	
	//loads players who have signed up for the tournament
	
	
});