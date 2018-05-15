function getData() {
     // Get the data from endpoint.
    $.ajax({
        url:"http://localhost:8080/api/airport/all",
        type:"get",
        success: function(json) {
           if(json.length<=0){
                   return
           }

           var content = '';

           for (var i = 0; i < json.length; i++) {
               content += '<tr id="' + json[i].id + '">';
               content += '<td>' + json[i].airport.name + '</td>';
               content += '</tr>';
           }
           $('#airport-table-body').html(content);
        });
    });
}

$(document).ready(function () {
getData();
});

