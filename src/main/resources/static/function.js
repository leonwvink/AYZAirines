function newAirport(){
var title = $('#title').val();
    var newOrder = {
        name: title
    };
    console.log(newOrder)

    $.post("http://localhost:8080/api/airport/create", newOrder, function(data) {});
}


$(document).ready( function(){
});