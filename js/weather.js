const weather = document.querySelector('#weather span:first-child');
const city = document.querySelector('#weather span:last-child');
const API_KEY='d4d6624a70ee566c3c333550a2f23425';

navigator.geolocation.getCurrentPosition(geoOK,geoErr);

function geoOK(position){
    const lat=position.coords.latitude;
    const lon=position.coords.longitude;
    const url=`https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}&units=metric`;
    fetch(url)
        .then((response)=>response.json())
        .then((data)=>{
            console.log(data);
            city.innerText=data.name;
            weather.innerText=`${data.weather[0].main}`
    });
} 
function geoErr(){
    alert("can't find you. No weather Info")
}