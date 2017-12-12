$(document).ready(function(){
   
   
   

    //function when adding player form is called
    $('#addPlayer').submit(function(event){
        event.preventDefault();

        $.ajax({
            url:"addPoints",
            type:"POST",
            dataType: "json",
            data: $("#addPlayer").serialize(),
            success: function(data){
            	
            	if(!(data.isValid)){
            		alert("Please enter a correct Player name");
            	}
            	else{
            	
            	alert("Points Successfully added to " + $("#PlayerTag").val());
            	
            	$( "#addPlayer" ).each(function(){
            	    this.reset();
            	});
            	
            	
            }
            }
        });
      // loadPlayers();
        return false;
    });

    //function when removing player form is called
    $('#removePlayer').submit(function(event){
        event.preventDefault();

        $.ajax({
            url:"removePlayer",
            type:"POST",
            dataType: "json",
            data: $("#removePlayer").serialize(),
            success: function(data){
            	
            	

            }
        });
        loadPlayers();
        return false;
    });

   
    
});