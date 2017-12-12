$(document).ready(function() {
	
	var html = "";
	
	$.ajax({
	
		url: "getTournaments",
		type: "GET",
		dataType: "json", 
		success: function(tList){
			
			console.log(tList);
			
			$.each(tList.tlist, function(index,t){
			
			html += 
		    "<div class = 'tournamentButton'> " +
		        "<button class = 'accordian' " + "onclick = 'accordianFunction()' "  + "align = 'center'><bold>" +t.name +  "</bold></button>" +
		        "<div class = 'panel' align = 'left'>" + 
		         "<p align = 'left' class = 'mycss'> Date: " + t.date+ "</p>" +
		         "<p align = 'left' class = 'mycss'> Type: " + t.type+ "</p>" +
		         "<p align = 'left' class = 'mycss'> Entry Fee: " + t.entryFee+ "</p>" +
		         "<p align = 'left' class = 'mycss'> 1st Place: " + t.firstPrize+ "</p>" +
		         "<p align = 'left' class = 'mycss'> 2nd Place: " + t.secondPrize+ "</p>" +
		         "<p align = 'left' class = 'mycss'> 3rd Place: " + t.thirdPrize+ "</p>" +
		        "</div>" +
		    "</div>";
			
			});
			console.log(html);
			
			$("#Tournament").append(html);
		}
		
		
		
	});
	
	

    //loadTournaments();

    //accordian function - makes the buttons extend and contract
    $(document).on("click", ".accordian", function (){   
        var acc = document.getElementsByClassName("accordian");
        var i;
        
        for (i = 0; i < acc.length; ++i){
            acc[i].onclick=function(){
                this.classList.toggle("active");
                var panel = this.nextElementSibling;
                if (panel.style.display === "block"){
                    panel.style.display = "none";
                } else {
                    panel.style.display = "block";
                }
            }
        }
    });

    /*
    function loadTournaments(){
        var requestURL = "Servlet?loadTournaments";
        $.get(requestURL, function(result, response){
            $("#tournamentContainer").html("");
            $.each(result, function(index, Tournament){
                var html = '       <div class = "tournamentButton">' + 
                    '<button class = "accordian" onclick = "accordianFunction()" align = "center">' + Tournament.date + '</button>' + 
                    '<div class = "panel" >' +
                        Tournament.embedCode + 
                    '</div>' +
                '</div>';
            
                $("#tournamentContainer").append(html);
            });
        });
    }
    */
});