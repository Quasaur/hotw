//initialize Spry objects and setup event listeners

/* Spry.Data.Region.debug = true; */
var dsEvents = new Spry.Data.XMLDataSet("data/eventxml.php", "events/event",  {entityEncodeStrings: false});
var pvEvents = new Spry.Data.PagedView( dsEvents ,{ pageSize: 16 });
var pvInfo = pvEvents.getPagingInfo();

// Declare Spry Widgets
/* var CollapsiblePanel1, Accordion1;
var bFirst, bPrev, bNext, bLast;
dsEvents.setColumnType("yBible", "number");
dsEvents.setColumnType("yGreg", "number");
dsEvents.setColumnType("eType", "text");
dsEvents.setColumnType("eLoc", "text");
dsEvents.setColumnType("eDesc", "text");
dsEvents.setColumnType("eSrc", "text");
pvEvents.setColumnType("yBible", "number");
pvEvents.setColumnType("yGreg", "number");
pvEvents.setColumnType("eType", "text");
pvEvents.setColumnType("eLoc", "text");
pvEvents.setColumnType("eDesc", "text");
pvEvents.setColumnType("eSrc", "text"); */

// Since this JavaScript file can load before the browser has even read in and created the actual
// DOM elements we want to attach attributes to, we need to add a load listener that will set the
// attributes on the appropriate elements after the onload event fires.

Spry.Utils.addLoadListener(function(){
   // Attach the spry detail:region namespace to the Results Displayed Accordion panel
   Spry.$$("#resultsInfo").setAttribute("spry:detailregion", "pvEvents"); //id=resultsInfo
   Spry.$$("#ppvInfo").setAttribute("spry:region", "pvInfo"); //id=ppvInfo
   Spry.$$("#ppvInfo").setAttribute("spry:repeatchildren", "pvInfo");//id=ppvInfo
   Spry.$$("#rsGrps").setAttribute("spry:if", "{ds_CurrentRowNumber} != {ds_RowNumber}");//id=rsGrps
   Spry.$$("#curPage").setAttribute("spry:if", "{ds_CurrentRowNumber} == {ds_RowNumber}");//id=curPage
   Spry.$$("#content").setAttribute("spry:region", "pvEvents");//id=content
   Spry.$$("#thistory th:nth-child(3)").setAttribute("spry:sort", "yBible");
   Spry.$$("#thistory th:nth-child(4)").setAttribute("spry:sort", "yGreg");
   Spry.$$("#thistory tr:nth-child(3)").setAttribute("spry:repeat", "pvEvents");
   
   // Tell Spry to process regions within the document.
   
   Spry.Data.initRegions();
   // CollapsiblePanel1 = new Spry.Widget.CollapsiblePanel("CollapsiblePanel1");
   // Accordion1 = new Spry.Widget.Accordion("Accordion1");
   
});