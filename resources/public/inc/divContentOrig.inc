<!-- START SPRY:REGION dsEvents/dsSugEvents id ContentOrig -->
<div id="cOrig">
<table width="100%" id="thistory" class="filterable">
<tbody>
      <tr>
      <th class="col1a theading" colspan="2">YEAR</th>
      <th class="col1a theading" colspan="4">EVENT</th>
      </tr>
      <tr>
	 <th class="col1a theading">Bible<br />(364.8 days)</th>
	 <th class="col2a theading">Gregorian<br />(365.2425 days)</th>
	 <th class="col3a theading">Type</th>
	 <th class="col4a theading">Location</th>
	 <th class="col5a theading">Description</th>
	 <th class="col6a theading">Source</th>
      </tr>
<tr>
<td align="right" class="col1">{yBible}</td>
<td align="right" class="col2">{yGreg}</td>
<td class="col3">{eType}</td>
<td class="col4">{eLoc}</td>
<td class="col5">{eDesc}</td>
<td class="col6">{eSrc}</td>
</tr>
</tbody>
</table>
<?php
echo "<script language='javascript' type='text/javascript'>
//<![CDATA[
//setup function to remove background-image when it is no longer needed
var divContent = document.getElementById('contentOrig');
function RemoveBG(){
   divContent.style.backgroundImage = 'none';
}

// setup zebra rows on table
var table = document.getElementById('thistory');
if (! table) exit;
var tbodies = table.getElementsByTagName('tbody');
for (var h = 0; h < tbodies.length; h++) {
   var even = true;
   var trs = tbodies[h].getElementsByTagName('tr');
   for (var i = 0; i < trs.length; i++) {
      trs[i].onmouseover=function(){
	 // remove Loading... background image from div 
	 RemoveBG();
	 this.className += ' ruled'; return false;
      }
      trs[i].onmouseout=function(){this.className = this.className.replace('ruled', '');return false;}
      if(even)trs[i].className += 'even';
      even = !even;
   }
}
//]]>
</script>";
?>
</div><!-- END SPRY:REGION dsEvents/dsSugEvents id ContentOrig -->
