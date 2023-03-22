
setInterval(time,100);

function time(){
    let now = new Date();
    document.getElementById("clock").innerHTML = now.toLocaleTimeString();
    }


