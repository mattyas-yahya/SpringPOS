$(document).ready(function()
      {
          $.ajax({
               url: 'https://squarepos.herokuapp.com/BarangAll',//http://localhost:1111/BarangAll
               success: function(data)
                {
                 data.forEach(function(dt)
                 {
     $("#tdatax").append
     (
     "<tr>"+
     "<td>"+"<h2>"+dt.nama+"</h2>"+"<h4>"+dt.harga_jual+"</h4>"+"</td>"
     +"</tr>"
     );
                 });

               }
             });
});


