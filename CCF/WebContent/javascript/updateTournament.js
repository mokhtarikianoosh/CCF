$(document).ready(function(){
    
    $("#addTournament").submit(function(event){
        event.preventDefault();

        
        $.ajax({
            url:"addTournament",
            type:"POST",
            dataType: "json",
            data: $("#addTournament").serialize(),
            success: function(data){
            	
            	if(!data.isValid){
            		alert("Invalid User Tag entered");
            	}

            }
        });
        return false;
    });
});