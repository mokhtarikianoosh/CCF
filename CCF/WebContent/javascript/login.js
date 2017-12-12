
function loginFunction(){
    var formData = new FormData(document.querySelector('form'));

    var entries = formData.entries;

    var wasCorrect = false;
    
    
    if (document.getElementById('username').value === "admin"){
        if (document.getElementById('password').value === "admin"){
            wasCorrect = true;            
            window.location.replace("./updateRankings.jsp");            
        }
    }

    if (wasCorrect === false){
        document.getElementById("failure").innerHTML = "Incorrect credentials";
    }
}