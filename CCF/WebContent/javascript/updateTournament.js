$(document).ready(function(){
	
	


    
    $("#createT").submit(function(event){
       
    	console.log("click worked");

        
        $.ajax({
            url:"addTournament",
            type:"POST",
            dataType: "json",
            data: $("#createT").serialize(),
            success: function(data){
            	
            	if(!data.isValid){
            		alert("Invalid User Tag entered");
            	}

            }
        });
        return false;
    });
});