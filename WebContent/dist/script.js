
function fetchAllHotels() {
// Create a request variable and assign a new XMLHttpRequest object to it.
var request = new XMLHttpRequest();

// Open a new connection, using the GET request on the URL endpoint
request.open('GET', 'http://localhost:8080/Hotel_Management/rest/HotelService/hotels', true);

request.onload = function () {
  // Begin accessing JSON data here
	var data = JSON.parse(this.response);
	data.forEach(hotel => {
	  console.log(hotel.name);
	});
}
// Send request
request.send();
}