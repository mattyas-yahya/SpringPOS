


(
function() 
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
} 
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run() 
{
//$("#tab_3x").val(document.getElementById('ax').value).hide();
var t = document.getElementById('tabelbrg');
t.onclick = function (event)
 {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');
var f5 = document.getElementById('e');
var f6 = document.getElementById('f');
var f7 = document.getElementById('g');
var f8 = document.getElementById('h');
var f9 = document.getElementById('i');
var f10 = document.getElementById('j');

f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;
f5.value = cells[4].innerHTML;
f6.value = cells[5].innerHTML;
f7.value = cells[6].innerHTML;
f8.value = cells[7].innerHTML;
f9.value = cells[8].innerHTML;
f10.value = cells[9].innerHTML;


//var ccc = document.getElementById ('d').value;
//var output = ccc.substring(18, 28);
$("#id_brg").val(document.getElementById('a').value);
$("#nma").val(document.getElementById('b').value);
$("#hrga_jl").val(document.getElementById('e').value);
$('#units').on( 'input', function ()
 {
    hitung();
});

};
}
})
();

function hitung()
{
var q=parseFloat(document.test.hrga_jl.value);
var b=parseFloat(document.test.units.value);
document.getElementById("total").value =q*b;
}
function hitung2()
{
var q=parseFloat(document.test.totbiy.value);
var b=parseFloat(document.test.bayar.value);
document.getElementById("kembalian").value =q-b;
}




(
function()
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
}
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run()
{
var t = document.getElementById('tabelsal');
t.onclick = function (event) {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');


f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;


$("#id_sales").val(document.getElementById('a').value);
$("#name").val(document.getElementById('b').value);
$("#sales_name").val(document.getElementById('b').value);
$("#email").val(document.getElementById('c').value);
$("#phone_no").val(document.getElementById('d').value);
};
}
})
();

(
function()
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
}
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run()
{
//$("#tab_3x").val(document.getElementById('ax').value).hide();
var t = document.getElementById('tabeleads');
t.onclick = function (event)
 {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');
var f5 = document.getElementById('e');
var f6 = document.getElementById('f');
var f7 = document.getElementById('g');
var f8 = document.getElementById('h');
var f9 = document.getElementById('i');
var f10 = document.getElementById('j');
var f11 = document.getElementById('k');


f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;
f5.value = cells[4].innerHTML;
f6.value = cells[5].innerHTML;
f7.value = cells[6].innerHTML;
f8.value = cells[7].innerHTML;
f9.value = cells[8].innerHTML;
f10.value = cells[9].innerHTML;
f11.value = cells[10].innerHTML;

//var ccc = document.getElementById ('d').value;
//var output = ccc.substring(18, 28);

$("#id_leads").val(document.getElementById('a').value);
$("#l_id_contact").val(document.getElementById('b').value);
$("#l_sales_name").val(document.getElementById ('c').value);
$("#l_contact_name").val(document.getElementById ('d').value);
$("#l_company").val(document.getElementById ('e').value);
$("#l_industry").val(document.getElementById ('f').value);
$("#l_phone_no").val(document.getElementById ('g').value);
$("#lead_status").val(document.getElementById ('h').value);
$("#note").val(document.getElementById ('i').value);
$("#lead_source").val(document.getElementById ('j').value);
$("#annual_revenue").val(document.getElementById ('k').value);
};
}
})
();

//(
//function()
//{
//if (window.addEventListener)
//{
//window.addEventListener('load', run, false);
//}
//else if (window.attachEvent)
//{
//window.attachEvent('onload', run);
//}
//function run()
//{
////$("#tab_3x").val(document.getElementById('ax').value).hide();
//var t = document.getElementById('tabeleads');
//t.onclick = function (event)
// {
//event = event || window.event; //IE8
//var target = event.target || event.srcElement;
//while (target && target.nodeName !== 'TR') { // find TR
//target = target.parentElement;
//}
//var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
//if (!cells.length || target.parentNode.nodeName === 'THEAD') {
//return;
//}
//var f1 = document.getElementById('a');
//var f2 = document.getElementById('b');
//var f3 = document.getElementById('c');
//var f4 = document.getElementById('d');
//var f5 = document.getElementById('e');
//var f6 = document.getElementById('f');
//var f7 = document.getElementById('g');
//var f8 = document.getElementById('h');
//var f9 = document.getElementById('i');
//var f10 = document.getElementById('j');
//var f11 = document.getElementById('k');
//
//
//f1.value = cells[0].innerHTML;
//f2.value = cells[1].innerHTML;
//f3.value = cells[2].innerHTML;
//f4.value = cells[3].innerHTML;
//f5.value = cells[4].innerHTML;
//f6.value = cells[5].innerHTML;
//f7.value = cells[6].innerHTML;
//f8.value = cells[7].innerHTML;
//f9.value = cells[8].innerHTML;
//f10.value = cells[9].innerHTML;
//f11.value = cells[10].innerHTML;
//
////var ccc = document.getElementById ('d').value;
////var output = ccc.substring(18, 28);
//
//$("#id_leads").val(document.getElementById('a').value);
//$("#l_id_contact").val(document.getElementById('b').value);
//$("#l_sales_name").val(document.getElementById ('c').value);
//$("#l_contact_name").val(document.getElementById ('d').value);
//$("#l_company").val(document.getElementById ('e').value);
//$("#l_industry").val(document.getElementById ('f').value);
//$("#l_phone_no").val(document.getElementById ('g').value);
//$("#lead_status").val(document.getElementById ('h').value);
//$("#note").val(document.getElementById ('i').value);
//$("#lead_source").val(document.getElementById ('j').value);
//$("#annual_revenue").val(document.getElementById ('k').value);
//};
//}
//})
//();


(
function()
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
}
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run()
{
//$("#tab_3x").val(document.getElementById('ax').value).hide();
var t = document.getElementById('tabelopor');
t.onclick = function (event)
 {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');
var f5 = document.getElementById('e');
var f6 = document.getElementById('f');
var f7 = document.getElementById('g');
var f8 = document.getElementById('h');
var f9 = document.getElementById('i');
var f10 = document.getElementById('j');
var f11 = document.getElementById('k');
var f12 = document.getElementById('l');
var f13 = document.getElementById('m');
var f14 = document.getElementById('n');
var f15 = document.getElementById('o');

f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;
f5.value = cells[4].innerHTML;
f6.value = cells[5].innerHTML;
f7.value = cells[6].innerHTML;
f8.value = cells[7].innerHTML;
f9.value = cells[8].innerHTML;
f10.value = cells[9].innerHTML;
f11.value = cells[10].innerHTML;
f12.value = cells[11].innerHTML;
f13.value = cells[12].innerHTML;
f14.value = cells[13].innerHTML;
f15.value = cells[14].innerHTML;


//var ccc = document.getElementById ('d').value;
//var output = ccc.substring(18, 28);

$("#id_oportunity").val(document.getElementById('a').value);
$("#o_id_contact").val(document.getElementById('b').value);
$("#oportunity_name").val(document.getElementById ('c').value);
$("#o_sales_name").val(document.getElementById ('d').value);
$("#o_contact_name").val(document.getElementById ('e').value);
$("#o_company").val(document.getElementById ('f').value);
$("#o_industry").val(document.getElementById ('g').value);
$("#o_phone_no").val(document.getElementById ('h').value);
$("#close_date").val(document.getElementById ('i').value);
$("#lead_source").val(document.getElementById ('j').value);
$("#note").val(document.getElementById ('k').value);
$("#Type").val(document.getElementById ('l').value);
$("#Stage").val(document.getElementById ('m').value);
$("#Probability").val(document.getElementById ('n').value);
$("#Amount").val(document.getElementById ('o').value);

};
}
})
();

(
function()
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
}
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run()
{
//$("#tab_3x").val(document.getElementById('ax').value).hide();
var t = document.getElementById('tabelcase');
t.onclick = function (event)
 {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');
var f5 = document.getElementById('e');
var f6 = document.getElementById('f');
var f7 = document.getElementById('g');
var f8 = document.getElementById('h');
var f9 = document.getElementById('i');
var f10 = document.getElementById('j');
var f11 = document.getElementById('k');
var f12 = document.getElementById('l');


f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;
f5.value = cells[4].innerHTML;
f6.value = cells[5].innerHTML;
f7.value = cells[6].innerHTML;
f8.value = cells[7].innerHTML;
f9.value = cells[8].innerHTML;
f10.value = cells[9].innerHTML;
f11.value = cells[10].innerHTML;
f12.value = cells[11].innerHTML;

//var ccc = document.getElementById ('d').value;
//var output = ccc.substring(18, 28);

$("#id_case").val(document.getElementById('a').value);
$("#csid_contact").val(document.getElementById('b').value);
$("#cssales_name").val(document.getElementById ('c').value);
$("#cscontact_name").val(document.getElementById ('d').value);
$("#cscompany").val(document.getElementById ('e').value);
$("#csindustry").val(document.getElementById ('f').value);
$("#csphone_no").val(document.getElementById ('g').value);
$("#status").val(document.getElementById ('h').value);
$("#case_origin").val(document.getElementById ('i').value);
$("#Priority").val(document.getElementById ('j').value);
$("#case_type").val(document.getElementById ('k').value);
$("#case_reason").val(document.getElementById ('l').value);

};
}
})
();









































(
function()
{
if (window.addEventListener)
{
window.addEventListener('load', vv, false);
}
else if (window.attachEvent)
{
window.attachEvent('onload',vv );
}
function vv()
{
now = new Date();
randomNum = '';
randomNum += Math.round(Math.random() * 9);
randomNum += Math.round(Math.random() * 9);
randomNum += now.getTime().toString().slice(-3);
month = '' + (now.getMonth() + 1),
day = '' + now.getDate(),
year = now.getFullYear();
if (month.length < 2) month = '0' + month;
if (day.length < 2) day = '0' + day;
document.getElementById("tanggal").value =  [year, month, day].join('-');
}
})
();


//
////////////////////////////////////////set default id value...///////////////////
(
function()
{
if (window.addEventListener)
{
window.addEventListener('load', cv, false);
}
else if (window.attachEvent)
{
window.attachEvent('onload',cv );
}
$('#bayar').on( 'keyup click', function ()
 {
    cv();
});
function cv()
{
var q=parseFloat(document.test.totbiy.value);
var b=parseFloat(document.test.bayar.value);
document.getElementById("kembalian").value =b-q;
}
})
();
///////////////////////////


///////////////////margin........////////////
(
function()
{
if (window.addEventListener)
{
window.addEventListener('load', cv, false);
}
else if (window.attachEvent)
{
window.attachEvent('onload',cv );
}
$('#harga_jual').on( 'keyup click', function ()
 {
    mrgn();
});
function mrgn()
{
var x=parseFloat(document.test.harga_bli.value);
var xx=parseFloat(document.test.harga_jl.value);
document.getElementById("mrgn").value =x-xx;
}
})
();
/////////////////////////////////////////






