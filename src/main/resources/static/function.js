function postData() {
         console.log("posting data...");


        // Create JS object with data.
        var newAirport = {
            name: $("#inputName").val(),
        };

        $.post("http://localhost:8080/api/airport/create", newAirport, function(result) {
            getData();
        });

 }


function getData() {
     // Get the data from endpoint.
    $.ajax({
        url:"http://localhost:8080/api/airport/all",
        type:"get",
        success: function(data) {
            // On successful get, reload the datatable with new data.
            $('#table').DataTable().clear();
            $('#table').DataTable().rows.add(data);
            $('#table').DataTable().columns.adjust().draw();
        }
    });
}

$(document).ready(function () {
    // Modal submit.
    $("#newAirportForm").on('submit', function(e) {
        console.log("Submitted new Dish form");

        // Post the data from the modal.
        postData();

        // Reset modal to hide and no values.
        $('#newAirportModal').modal('hide');

    });

 // Load DataTable with data format.
    $('#table').DataTable({
        "order": [[ 2, "desc" ]],
        columns: [
            { "data": "id" },
            { "data": "name" }
        ]
    });

    // Load first data.
    getData();
});