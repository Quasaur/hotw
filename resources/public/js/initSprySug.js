//initialize Spry objects and setup event listeners

/* Spry.Data.Region.debug = true; */
var pvSugEvents = new Spry.Data.PagedView( dsSugEvents ,{ pageSize: 16 });
var pvSugInfo = pvSugEvents.getPagingInfo();

// Declare Spry Widgets
var CollapsiblePanel1, Accordion;

// Since this JavaScript file can load before the browser has even read in and created the actual
// DOM elements we want to attach attributes to, we need to add a load listener that will set the
// attributes on the appropriate elements after the onload event fires.

Spry.Utils.addLoadListener(function(){
   // Attach the spry detail:region namespace to the Results Displayed Accordion panel
   Spry.$$("#resultsInfo").setAttribute("spry:detailregion", "pvSugEvents"); //id=resultsInfo
   Spry.$$("#ppvInfo").setAttribute("spry:region", "pvSugInfo"); //id=ppvInfo
   Spry.$$("#ppvInfo").setAttribute("spry:repeatchildren", "pvSugInfo");//id=ppvInfo
   Spry.$$("#rsGrps").setAttribute("spry:if", "{ds_CurrentRowNumber} != {ds_RowNumber}");//id=rsGrps
   Spry.$$("#curPage").setAttribute("spry:if", "{ds_CurrentRowNumber} == {ds_RowNumber}");//id=curPage
   Spry.$$("#content").setAttribute("spry:region", "pvSugEvents");//id=content
   Spry.$$("#thistory th:nth-child(3)").setAttribute("spry:sort", "yBible");
   Spry.$$("#thistory th:nth-child(4)").setAttribute("spry:sort", "yGreg");
   Spry.$$("#thistory tr:nth-child(3)").setAttribute("spry:repeat", "pvSugEvents");
   
   // Tell Spry to process regions within the document.
   
   Spry.Data.initRegions();
   CollapsiblePanel1 = new Spry.Widget.CollapsiblePanel("CollapsiblePanel1");
   Accordion = new Spry.Widget.Accordion("Accordion");
   
});