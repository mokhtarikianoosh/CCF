
$(document).ready(function(){

	
	
	
	loadRegisteredPlayers();

	$('#updateUserName').submit(function(event){
		

		$.ajax({
			url:"signup",
			type: "POST",
			dataType: "json",
			data: $("#updateUserName").serialize(),
			success: function(data){
					
				$("#displayName").html(data.username + " has successfully signed up");
			}
			
			
		});
		return false;
	});
	
	//loads players who have signed up for the tournament
	function loadRegisteredPlayers(){
		var requestURL = "Servlet?loadRegisteredPlayers";
		$.get(requestURL, function(result, response) {
			$("#playerOrderedList").html("");
			$.each(result, function(index, Player){
				var html = '<li>' + Player.playerTag + '</li>';
				$("#playerOrderedList").append(html);
			});
		});
	}
	
});