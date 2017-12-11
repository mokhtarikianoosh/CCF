<!DOCTYPE html>
<html lang="en-US">
        <head>
            <title>Update Tournaments</title>
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">        
            <link rel="stylesheet" href="css/header.css">
            <link rel="stylesheet" href="css/body.css">
            <link rel="stylesheet" href="css/footer.css">
            <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
			<link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" />
			<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
          	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>      
            <script src = "./javascript/updateTournament.js"></script>
            
    
        </head>
        
        <div class = "boostrap-iso">
        <div class = "container-fluid">
        
        
        
        </div>
        </div>


        <body>
            <div class = "menu">
                <ul>
                    <li class = "rankings"><a href = "updateRankings.html">Update Rankings</a></li>
                    <li class = "tournaments"><a href = "updateTournaments.html">Update Tournaments</a></li>
                    <li class = "tournaments"><a href = "updateSignUp.html">Update Sign-up</a></li>                    
                    <li class = "login"><a href = "index.jsp">Logout</a></li>                      
                </ul>
            </div>

            <br>
            <br>
            <div class = "newTournament">
                <h3>New Tournament Entry</h3>
                
               
                 
            </div>
            
            
            
            
<!-- Special version of Bootstrap that only affects content wrapped in .bootstrap-iso -->
<link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" /> 

<!-- Inline CSS based on choices in "Settings" tab -->
<style>.bootstrap-iso .form-group button, .bootstrap-iso form input.form-control, .bootstrap-iso form textarea.form-control, .bootstrap-iso form select.form-control{-webkit-border-radius: 0 !important;-moz-border-radius: 0; border-radius: 0;}.bootstrap-iso .formden_header h2, .bootstrap-iso .formden_header p, .bootstrap-iso form{font-family: Arial, Helvetica, sans-serif; color: black}.bootstrap-iso form button, .bootstrap-iso form button:hover{color: #ffffff !important;}.bootstrap-iso .form-control:focus { border-color: #ce0900;  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 8px rgba(206, 9, 0, 0.6); box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 8px rgba(206, 9, 0, 0.6);} .asteriskField{color: red;}.bootstrap-iso form .input-group-addon {color:#555555; background-color: #dd0606; border-radius: 0px; padding-left:12px}</style>

<!-- HTML Form (wrapped in a .bootstrap-iso div) -->
<div class="bootstrap-iso">
 <div class="container-fluid">
  <div class="row">
   <div class="col-md-6 col-sm-6 col-xs-12">
    <form id="createT">
     <div class="form-group ">
      <label class="control-label " for="name">
       Name
      </label>
      <input class="form-control" id="name" name="name" type="text"/>
     </div>
     <div class="form-group ">
      <label class="control-label requiredField" for="date">
       Date
       <span class="asteriskField">
        *
       </span>
      </label>
      <input class="form-control" id="date" name="date" placeholder="MM/DD/YYYY" type="text"/>
     </div>
     <div class="form-group ">
      <label class="control-label requiredField" for="versusNumber">
       Select a Choice
       <span class="asteriskField">
        *
       </span>
      </label>
      <select class="select form-control" id="versusNumber" name="versusNumber">
       <option value="1v1">
        1v1
       </option>
       <option value="2v2">
        2v2
       </option>
      </select>
     </div>
     <div class="form-group ">
      <label class="control-label " for="entryFee">
       Entry Fee
      </label>
      <input class="form-control" id="entryFee" name="entryFee" placeholder="$" type="text"/>
     </div>
     <div class="form-group ">
      <label class="control-label requiredField" for="name2">
       First Place Prize
       <span class="asteriskField">
        *
       </span>
      </label>
      <input class="form-control" id="firstPlace" name="" placeholder="$" type="text"/>
     </div>
     <div class="form-group ">
      <label class="control-label requiredField" for="name3">
       Second Place Prize
       <span class="asteriskField">
        *
       </span>
      </label>
      <input class="form-control" id="secondPlace" name="name3" type="text"/>
     </div>
     <div class="form-group ">
      <label class="control-label requiredField" for="name4">
       3rd Place Prize
       <span class="asteriskField">
        *
       </span>
      </label>
      <input class="form-control" id="thirdPlace" name="name4" placeholder="$" type="text"/>
     </div>
     <div class="form-group">
      <div>
       <button class="btn btn-primary " name="submit" type="submit">
        Submit
       </button>
      </div>
     </div>
     <input type = "submit" value = "Tournament">
    </form>
   </div>
  </div>
 </div>
</div>

        </body>

</html>