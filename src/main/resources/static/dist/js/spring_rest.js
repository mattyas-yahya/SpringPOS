$(document).ready(function()
      {
          $.ajax({
               url: 'https://squarepos.herokuapp.com/BarangAll',//http://localhost:1111/BarangAll
               success: function(data)
                {
                 data.forEach(function(dt)
                 {
     $("#tdata").append
     (
     "<tr>"+
     "<th>"+dt.id_barang+"</th>"+
     "<th>"+dt.nama+"</th>"
     +"</tr>"
     );
                 });

               }
             });
});
$("#tdata").dataTable();

