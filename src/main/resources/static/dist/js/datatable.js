var tabelbrgmaster;
var tabelbrgmaster1;
var tabeltransfer;
var tabelAdjustment;
var tabelAdjustment1;
$(document).ready( function ()
{
var tablex = $('#tabeltr').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/TransAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_transaction"},
{ "mData": "id_brg.id_barang"},
{ "mData": "tanggal" },
{ "mData": "nma" },
{ "mData": "hrga_jl" },
{ "mData": "units"},
{ "mData": "total"}

]
});
});

$(document).ready( function ()
{
 tabelbrgmaster = $('#tabelbrgmaster').DataTable({
"columnDefs":[{ "orderable": false,"className": "select-checkbox","targets": 0,"checkboxes": {"selectRow": true}}],
"select": {"style": "multi"},
"order": [[1, "asc"]],
"sAjaxSource": "/BarangAll",
"sAjaxDataProp": "",
"aoColumns": [
{ "mData": "id_barang","defaultContent":""},
{ "mData": "kode_barang"},
{ "mData": "nama"},
{ "mData": "jenis" },
{ "mData": "harga_beli" },
{ "mData": "harga_jual" },
{ "mData": "margin" },
{ "mData": "stok_awal"},
{ "mData": "transfer"},
{ "mData": "penjualan"},
{ "mData": "adjustment"},
{ "mData": "stok_akhir"},
{ "mData": "uom"}
]
});
});
$(document).ready( function ()
{
tabelbrgmaster.on('click', function(e)
{
var form = this;
var rows_selected = tabelbrgmaster.column(0).checkboxes.selected();
$('#id_barang').val(rows_selected.join(","));
$('#id_brg').val(rows_selected.join(","));
tabelbrgmaster1 = $('#tabelbrgmaster').DataTable().row('.selected').data();
//$('#id_barang').val(tabelbrgmaster1['id_barang']);
$('#kode_barang').val(tabelbrgmaster1['kode_barang']);
$('#nama').val(tabelbrgmaster1['nama']);
$('#jenis').val(tabelbrgmaster1['jenis']);
$('#harga_beli').val(tabelbrgmaster1['harga_beli']);
$('#harga_jual').val(tabelbrgmaster1['harga_jual']);
$('#margin').val(tabelbrgmaster1['margin']);
$('#stok_awal').val(tabelbrgmaster1['stok_awal']);
$('#transfer').val(tabelbrgmaster1['transfer']);
$('#penjualan').val(tabelbrgmaster1['penjualan']);
$('#adjustment').val(tabelbrgmaster1['adjustment']);
$('#stok_akhir').val(tabelbrgmaster1['stok_akhir']);
$('#uom').val(tabelbrgmaster1['uom']);

});
});


$(document).ready( function ()
{
var tabelbrg = $('#tabelbrg').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/BarangAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_barang"},
{ "mData": "nama"},
{ "mData": "jenis" },
{ "mData": "harga_beli" },
{ "mData": "harga_jual" },
{ "mData": "stok_awal"},
{ "mData": "transfer"},
{ "mData": "penjualan"},
{ "mData": "adjustment"},
{ "mData": "stok_akhir"}
]
});
});

$(document).ready( function ()
{
var tabels = $('#tabels').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/SaleAll",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns":
 [

{ "mData": "tanggal" },
{ "mData": "nma" },
{ "mData": "hrga_jl" },
{ "mData": "units" },
{ "mData": "total" }
]
})
});

$(document).ready( function ()
{
var tabeltransfer = $('#tabeltransfer').DataTable({
"columnDefs":[{ "orderable": false,"className": "select-checkbox","targets": 0,"checkboxes": {"selectRow": true}}],
"select": {"style": "multi"},
"order": [[1, "asc"]],
"sAjaxSource": "/TransferAll",
"sAjaxDataProp": "",
"aoColumns":
 [
{ "mData": "id_transfer","defaultContent":""},
{ "mData": "id_brg.id_barang","defaultContent":"","visible":false},
{ "mData": "tanggal"},
{ "mData": "kode_barang"},
{ "mData": "nama"},
{ "mData": "jumlah"},
{ "mData": "note"}
]
})
});
$(document).ready( function ()
{
tabeltransfer.on('click', function(e)
{
var form = this;
var rows_selected = tabeltransfer.column(0).checkboxes.selected();
$('#id_barang').val(rows_selected.join(","));
$('#id_brg').val(rows_selected.join(","));
tabeltransfer1 = $('#tabeltransfer').DataTable().row('.selected').data();
$('#id_transaction').val(tabeltransfer1['id_transaction']);
$('#id_brg').val(tabeltransfer1['id_barang']);
$('#tanggal').val(tabeltransfer1['tanggal']);
$('#kode_barang').val(tabeltransfer1['kode_barang']);
$('#nama').val(tabeltransfer1['nama']);
$('#jumlah').val(tabeltransfer1['jumlah']);
$('#note').val(tabeltransfer1['note']);

});
});


$(document).ready( function ()
{
 tabelAdjustment = $('#tabelAdjustment').DataTable({
"columnDefs":[{ "orderable": false,"className": "select-checkbox","targets": 0,"checkboxes": {"selectRow": true}}],
"select": {"style": "multi"},
"order": [[1, "asc"]],
"sAjaxSource": "/AdjustmentAll",
"sAjaxDataProp": "",
"aoColumns":
 [
{ "mData": "id_adjustment"},
{ "mData": "id_brg.id_barang","defaultContent":"","visible":false},
{ "mData": "tanggal"},
{ "mData": "kode_barang"},
{ "mData": "nama"},
{ "mData": "jumlah"},
{ "mData": "note"}
]
})
});
$(document).ready( function ()
{
tabelAdjustment.on('click', function(e)
{
var form = this;
var rows_selected = tabelAdjustment.column(0).checkboxes.selected();
$('#id_barang').val(rows_selected.join(","));
$('#id_brg').val(rows_selected.join(","));
tabelAdjustment1 = $('#tabeltransfer').DataTable().row('.selected').data();
$('#id_transaction').val(tabeltransfer1['id_transaction']);
$('#id_brg').val(tabeltransfer1['id_barang']);
$('#tanggal').val(tabeltransfer1['tanggal']);
$('#kode_barang').val(tabeltransfer1['kode_barang']);
$('#nama').val(tabeltransfer1['nama']);
$('#jumlah').val(tabeltransfer1['jumlah']);
$('#note').val(tabeltransfer1['note']);

});
});









//buat table PM
$(document).ready( function ()
{
var tabelpm = $('#tabelpm').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/PmAll",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_pm"},
{ "mData": "id_asset.id_asset"},
{ "mData": "kode_asset"},
{ "mData": "deskripsi"}
]
});
});

$(document).ready( function ()
{
var tabelspare = $('#tabelspare').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/GetSpare",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns":
 [
{ "mData": "id_spare_part"},
{ "mData": "id_asset.id_asset"},
{ "mData": "id_safety.id_safety"},
{ "mData": "kode_spare_part"},
{ "mData": "id_asset.lokasi"},
{ "mData": "kode_asset"},
{ "mData": "nama_spare_part"},
{ "mData": "referensi"},
{ "mData": "vendor"},
{ "mData": "tgl_beli_spare"},
{ "mData": "harga_beli"},
{ "mData": "garansi"},
{ "mData": "serial"},
{ "mData": "consume"},
{ "mData": "stok"},
{ "mData": "end_balance"}
]
});
});




$(document).ready( function ()
{
var tabedept = $('#tabedept').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/DeptAll",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_dept"},
{ "mData": "nama_dept"},
{ "mData": "kode_dept"},

]
});
});

$(document).ready( function ()
{
var tabelwo = $('#tabelwo').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/WoAll",
"scrollX": "130px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_wo"},
{ "mData": "id_asset.id_asset"},
{ "mData": "id_pm.id_pm"},
{ "mData": "id_dept.id_dept"},
{ "mData": "kode_wo"},
{ "mData": "nama_dept"},
{ "mData": "title"},
{ "mData": "kode_asset"},
{"mData": "lokasi"},
{"mData": "status_pekerjaan"},
{"mData": "prioritas"},
{ "mData": "action"},
{ "mData": "jenis_pekerjaan"},
{ "mData": "pembuatan"},
{ "mData": "start"},
{ "mData": "end"},
{ "mData": "downtime"},
{ "mData": "uptime"}
]
});
});

$(document).ready( function ()
{
var tabelbwo = $('#tabelbwo').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/WoAll",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_wo"},
{ "mData": "id_asset.id_asset"},
{ "mData": "id_pm"},
{ "mData": "id_dept.id_dept"},
{ "mData": "kode_wo"},
{ "mData": "nama_dept"},
{ "mData": "title"},
{ "mData": "kode_asset"},
{"mData": "lokasi"},
{"mData": "status_pekerjaan"},
{"mData": "prioritas"},
{ "mData": "action"},
{ "mData": "jenis_pekerjaan"},
{ "mData": "start"},
{ "mData": "end"}
]
});
});


$(document).ready( function ()
{
var tabelver = $('#tabelver').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/WoIncoming",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_wo"},
{ "mData": "id_asset.id_asset"},
{ "mData": "id_pm.id_pm"},
{ "mData": "id_dept.id_dept"},
{ "mData": "kode_wo"},
{ "mData": "nama_dept"},
{ "mData": "title"},
{ "mData": "kode_asset"},
{"mData": "lokasi"},
{"mData": "status_pekerjaan"},
{"mData": "prioritas"},
{ "mData": "action"},
{ "mData": "jenis_pekerjaan"},
{ "mData": "pembuatan"},
{ "mData": "start"},
{ "mData": "end"},
{ "mData": "downtime"},
{ "mData": "uptime"}
]
});
});

$(document).ready( function ()
{
var tabelwoend = $('#tabelwoend').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/WoAllEnd",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_wo"},
{ "mData": "id_asset.id_asset"},
{ "mData": "id_pm.id_pm"},
{ "mData": "id_dept.id_dept"},
{ "mData": "kode_wo"},
{ "mData": "nama_dept"},
{ "mData": "title"},
{ "mData": "kode_asset"},
{"mData": "lokasi"},
{"mData": "status_pekerjaan"},
{"mData": "prioritas"},
{ "mData": "action"},
{ "mData": "jenis_pekerjaan"},
{ "mData": "pembuatan"},
{ "mData": "start"},
{ "mData": "end"},
{ "mData": "downtime"},
{ "mData": "uptime"}

]
});
});

$(document).ready( function ()
{
var tabel_log_wo = $('#tabel_log_wo').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/AuditAll",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": 'id_aud_wo'},
{ "mData": 'id_asset.id_asset'},
{ "mData": 'id_pm.id_pm'},
{ "mData": 'id_dept.id_dept'},
{ "mData": "kode_wo"},
{ "mData": "nama_dept"},
{"mData": "title"},
{ "mData": "kode_asset"},
{ "mData": "lokasi"},
{"mData": "status_pekerjaan"},
{"mData": "prioritas"},
{ "mData": "action"},
{ "mData": "jenis_pekerjaan"},
{ "mData": "pembuatan"},
{ "mData": "start"},
{ "mData": "end"},
{ "mData": "downtime"}
]
});
//table.column(0).visible(false);
//table.column(1).visible(false);
//table.column(2).visible(false);
//table.column(3).visible(false);
});


$(document).ready( function ()
{
var tabel_log_fail = $('#tabel_log_fail').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/WoFail",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_wo"},
{ "mData": "id_asset.id_asset"},
{ "mData": "id_pm.id_pm"},
{ "mData": "id_dept.id_dept"},
{ "mData": "kode_wo"},
{ "mData": "nama_dept"},
{"mData": "title"},
{ "mData": "kode_asset"},
{ "mData": "lokasi"},
{"mData": "status_pekerjaan"},
{"mData": "prioritas"},
{ "mData": "action"},
{ "mData": "jenis_pekerjaan"},
{ "mData": "pembuatan"},
{ "mData": "start"},
{ "mData": "end"},
{ "mData": "downtime"}
]
});
});


$(document).ready( function ()
{
var tabelmodep = $('#tabelmodep').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/DeptAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_dept"},
{ "mData": "nama_dept"},
{ "mData": "kode_dept"},

]
});
});

$(document).ready( function ()
{
var tabelmodpm = $('#tabelmodpm').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/PmAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_pm"},
{ "mData": "id_asset.id_asset"},
{ "mData": "kode_asset"},
{ "mData": "deskripsi"}
]
});
});

$(document).ready( function ()
{
var tabelmodaswo = $('#tabelmodaswo').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/AssetAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_asset"},
{ "mData": "serial" },
{ "mData": "nama_asset" },
{ "mData": "kode_asset" },
{ "mData": "tgl_beli_asset" },
{ "mData": "grup"},
{ "mData": "model" },
{ "mData": "lokasi" }
]
});
});

$(document).ready( function ()
{
var tablebiy = $('#tabelbiy').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/BiayaAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_biaya"},
{ "mData": "grup" },
{ "mData": "id_wo.id_wo" },
{ "mData": "kode_wo" },
{ "mData": "id_header_moveout.id_header_moveout" },
{ "mData": "id_header_moveout.referensi" },
{ "mData": "jumlah_orang" },
{ "mData": "biaya"},
{ "mData": "start"},
{ "mData": "deskripsi" }
]
});
$('#referensi').on('click', function ()
 {
    tablebiy.search( this.value ).draw();
} );
});

$(document).ready( function ()
{
var tabelmov = $('#tabelmov').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/MoveoutAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_moveout"},
{ "mData": "id_spare_part.id_spare_part" },
{ "mData": "kode_moveout" },
{ "mData": "kode_spare_part" },
{ "mData": "keterangan" },
{ "mData": "tgl_moveout"},
{ "mData": "jumlah"},
{ "mData": "harga"},
{ "mData": "total"}
]
});
});

$(document).ready( function ()
{
var tabelmodspare = $('#tabelmodspare').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/GetSpare",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_spare_part"},
{ "mData": "id_asset.id_asset"},
{ "mData": "kode_spare_part"},
{ "mData": "id_asset.lokasi"},
{ "mData": "kode_asset"},
{ "mData": "nama_spare_part"},
{ "mData": "vendor"},
{ "mData": "tgl_beli_spare"},
{ "mData": "harga_beli"},
{ "mData": "garansi"},
{ "mData": "serial"},
{ "mData": "consume"},
{ "mData": "stok"},
{ "mData": "end_balance"}
]
});
});


$(document).ready( function ()
{
var tabelmov = $('#tabelmov').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/MoveoutAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_moveout"},
{ "mData": "id_spare_part.id_spare_part" },
{ "mData": "kode_moveout" },
{ "mData": "kode_spare_part" },
{ "mData": "keterangan" },
{ "mData": "tgl_moveout"},
{ "mData": "jumlah"},
{ "mData": "harga"},
{"mData": "total"}
]
});
});


$(document).ready( function ()
{
var tabelmodasspare = $('#tabelmodasspare').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/GetSpare",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_spare_part"},
{ "mData": "id_asset.id_asset"},
{ "mData": "kode_spare_part"},
{ "mData": "id_asset.lokasi"},
{ "mData": "kode_asset"},
{ "mData": "nama_spare_part"},
{ "mData": "vendor"},
{ "mData": "tgl_beli_spare"},
{ "mData": "harga_beli"},
{ "mData": "garansi"},
{ "mData": "serial"},
{ "mData": "consume"},
{ "mData": "stok"},
{ "mData": "end_balance"}
]
});

});


$(document).ready( function ()
{
var tablex = $('#tabel_log_wo_asset').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/WoFail",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_wo"},
{ "mData": "id_asset.id_asset"},
{ "mData": "id_pm.id_pm"},
{ "mData": "id_dept.id_dept"},
{ "mData": "kode_wo"},
{ "mData": "nama_dept"},
{"mData": "title"},
{ "mData": "kode_asset"},
{ "mData": "lokasi"},
{"mData": "status_pekerjaan"},
{"mData": "prioritas"},
{ "mData": "action"},
{ "mData": "jenis_pekerjaan"},
{ "mData": "pembuatan"},
{ "mData": "start"},
{ "mData": "end"},
{ "mData": "downtime"}
]
});

$('#kode_asset').on( 'keyup click', function ()
 {
    tablex.search( this.value ).draw();
} );

$('#kode_spare_part').on( 'click', function ()
 {
    tablex.search( this.value ).draw().readonly();
} );

});


$(document).ready( function ()
{
var tablex = $('#tabelhemovAll').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/header_mov_All",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_header_moveout"},
{ "mData": "referensi"},
{ "mData": "deskripsi"},
{ "mData": "stat_transaction"}
]
});
});


$(document).ready( function ()
{
var tablex = $('#tabelhemov').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/header_Open",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_header_moveout"},
{ "mData": "referensi"},
{ "mData": "deskripsi"},
{ "mData": "stat_transaction"}
]
});
});


$(document).ready( function ()
{
var table = $('#tabelhemovend').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/header_Close",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_header_moveout"},
{ "mData": "referensi"},
{ "mData": "deskripsi"},
{ "mData": "stat_transaction"}
]
});
});


$(document).ready( function ()
{
var table = $('#tabelfail').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/failurAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_failur"},
{ "mData": "referensi"},
{ "mData": "id_wo.id_wo"},
{ "mData": "kode_wo"},
{ "mData": "kode_asset"},
{ "mData": "title"},
{ "mData": "efek"},
{ "mData": "penyebab"},
{ "mData": "tindakan"}
]
});
});


//var table1 = $('#tabelspare').DataTable();
//$('#tabelspare tbody').on( 'click','td', function ()
// {
// tablex.search(table1.cell().data()+3).draw();
//});

//$('#tabelspare tbody').on( 'click', 'td', function () {
//
//   alert( tablex.cell().data()+-1);
//} )



//var table = $('#tabel_log_wo_asset').DataTable();
//
//// #myInput is a <input type="text"> element
//$('#kode_asset').on( 'keyup', function ()
// {
//    table.search( this.value ).draw();
//} );

$(document).ready( function ()
{
var table = $('#tabelaris').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"paging":false,
"label":false,
"searching":false,
"sAjaxSource": "/BarangLaris",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "0"},
{ "mData": "1"},
]
});
});

$(document).ready( function ()
{
var tablev = $('#tabelsafety_spare').DataTable({
"columnDefs":[{"defaultContent":"-","targets":"_all"}],
"sAjaxSource": "/SafetyAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_safety"},
{ "mData": "referensi"},
{ "mData": "keterangan"},
{ "mData": "safety_procedure"},
{ "mData": "alat_safety"}
]
});

$('#safety_referensi').on( 'keyup click', function ()
 {
    tablev.search( this.value ).draw();
});
$('#safety_referensi').on( 'click', function ()
 {
    tablev.search( this.value ).draw();
} );
});

$(document).ready(function() {
    $('#tabelbrgmaster tfoot th').each( function () {
        var title = $(this).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
    } );

    var table = $('#tabelbrgmaster').DataTable();

    table.columns().every( function () {
        var that = this;

        $( 'input', this.footer() ).on( 'keyup change', function () {
            if ( that.search() !== this.value ) {
                that
                    .search( this.value )
                    .draw();
            }
        } );
    } );
} );

$(document).ready(function() {
    $('#tabelbrg tfoot th').each( function () {
        var title = $(this).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
    } );

    var table = $('#tabelbrg').DataTable();

    table.columns().every( function () {
        var that = this;

        $( 'input', this.footer() ).on( 'keyup change', function () {
            if ( that.search() !== this.value ) {
                that
                    .search( this.value )
                    .draw();
            }
        } );
    } );
} );

$(document).ready(function() {
    $('#tabelsal tfoot th').each( function () {
        var title = $(this).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
    } );

    var table = $('#tabelsal').DataTable();

    table.columns().every( function () {
        var that = this;

        $( 'input', this.footer() ).on( 'keyup change', function () {
            if ( that.search() !== this.value ) {
                that
                    .search( this.value )
                    .draw();
            }
        } );
    } );
} );

$(document).ready(function() {
    $('#tabelcamp tfoot th').each( function () {
        var title = $(this).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
    } );

    var table = $('#tabelcamp').DataTable();

    table.columns().every( function () {
        var that = this;

        $( 'input', this.footer() ).on( 'keyup change', function () {
            if ( that.search() !== this.value ) {
                that
                    .search( this.value )
                    .draw();
            }
        } );
    } );
} );


$(document).ready(function() {
    $('#tabeltr tfoot th').each( function () {
        var title = $(this).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
    } );

    var table = $('#tabeltr').DataTable();

    table.columns().every( function () {
        var that = this;

        $( 'input', this.footer() ).on( 'keyup change', function () {
            if ( that.search() !== this.value ) {
                that
                    .search( this.value )
                    .draw();
            }
        } );
    } );
} );

$(document).ready(function() {
    $('#tabelAdjustment tfoot th').each( function () {
        var title = $(this).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
    } );

    var table = $('#tabelAdjustment').DataTable();

    table.columns().every( function () {
        var that = this;

        $( 'input', this.footer() ).on( 'keyup change', function () {
            if ( that.search() !== this.value ) {
                that
                    .search( this.value )
                    .draw();
            }
        } );
    } );
} );

$(document).ready(function() {
    $('#tabeltransfer tfoot th').each( function () {
        var title = $(this).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
    } );

    var table = $('#tabeltransfer').DataTable();

    table.columns().every( function ()
    {
        var that = this;
        $( 'input', this.footer() ).on( 'keyup change', function () {
            if ( that.search() !== this.value ) {
                that
                    .search( this.value )
                    .draw();
            }
        } );
    } );
} );





$("button").click(function(){
$("#tabeltr").table2excel
({
exclude: ".noExl",
name: "Worksheet Name",
filename: "Log Transaksi.xls" //do not include extension
});
});

$("#tdatax").dataTable();
