//initialize Spry objects and setup event listeners

/* Spry.Data.Region.debug = true; */

// Declare Spry Widgets
var CollapsiblePanel1;

// Since this JavaScript file can load before the browser has even read in and created the actual
// DOM elements we want to attach attributes to, we need to add a load listener that will set the
// attributes on the appropriate elements after the onload event fires.

Spry.Utils.addLoadListener(function(){
   
   // Initialize the Collapsible Panel 
   CollapsiblePanel1 = new Spry.Widget.CollapsiblePanel("CollapsiblePanel1");
   
});