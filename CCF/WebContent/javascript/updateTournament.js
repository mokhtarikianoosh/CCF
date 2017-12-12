$(document).ready(function(){
	
	


    
    $("#createT").submit(function(event){
       
    	console.log("click worked");

        
        $.ajax({
            url:"addTournament",
            type:"POST",
            dataType: "json",
            data: $("#createT").serialize(),
            success: function(data){
            	
            	alert("Tournament Successfully Created!");
            	$( "#createT" ).each(function(){
            	    this.reset();
            	});

            }
        });
        return false;
    });
});