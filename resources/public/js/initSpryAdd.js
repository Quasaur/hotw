//initialize Spry objects and setup event listeners

var CollapsiblePanel1, Accordion;

//load AccordionPanelContents with proper fragments
function loadAccd(){
   Spry.Utils.updateContent("fOV","inc/addRec.inc");
   Spry.Utils.updateContent("fInstr","inc/instrAdd.inc");
}

//function to change background color of radio button text to clarify selection
function radioFocus(radioID){
   var selTypes,nType2;
   if(radioID == "tExist"){
      // The Current List radio input is selected...
      // remove all styles from the nType2 text input field
      Spry.$$("#nType2").removeClassName("inormal");
      // disable the nType2 text input field
      Spry.$$("#nType2").setAttribute("disabled", "disabled");
      // remove the lselected class name from the lNType label
      Spry.$$("#lNType").removeClassName("lselected");
      Spry.$$("#lNType").addClassName("ldisabled");
      // remove the disabled attribute from the selTypes listbox
      Spry.$$("#selTypes").removeAttribute("disabled");
      // restore style to the selTypes listbox
      Spry.$$("#selTypes").addClassName("snormal");
      // add the lselected class name to the Current List label
      Spry.$$("#cList").removeClassName("ldisabled");
      Spry.$$("#cList").addClassName("lselected");
   }
   else{
      // The New Type radio input is selected...
      // remove all styles from the selTypes listbox
      Spry.$$("#selTypes").removeClassName("snormal");
      // disable the selTypes listbox
      Spry.$$("#selTypes").setAttribute("disabled", "disabled");
      // remove the lselected class name from the Current List label
      Spry.$$("#cList").removeClassName("lselected");
      Spry.$$("#cList").addClassName("ldisabled");
      // remove the disabled attribute from the nType2 text input field
      Spry.$$("#nType2").removeAttribute("disabled");
      // restore style to the nType2 text input field
      Spry.$$("#nType2").addClassName("inormal");
      // add the lselected class name to the lNType label
      Spry.$$("#lNType").removeClassName("ldisabled");
      Spry.$$("#lNType").addClassName("lselected");
   }
}

// event handler for Original Helptext button
function btnHndlr(){Spry.Utils.updateContent('fInstr','inc/instrAdd.inc');}

// Since this JavaScript file can load before the browser has even read in and created the actual
// DOM elements we want to attach attributes to, we need to add a load listener that will set the
// attributes on the appropriate elements after the onload event fires.

Spry.Utils.addLoadListener(function(){
   //When mouse is moved over Bible Year Text Input, display specific helptext
   Spry.Utils.addEventListener("nBible", "mouseover", function(e){Spry.Utils.updateContent('fInstr','inc/instrAdd1.inc');return false;}, false);
   //When mouse is moved over Gregorian Year Text Input, display specific helptext
   Spry.Utils.addEventListener("nGreg", "mouseover", function(e){Spry.Utils.updateContent('fInstr','inc/instrAdd2.inc'); return false;}, false); 
   //When mouse is moved over Event Type Current List Label, display specific helptext
   Spry.Utils.addEventListener("cList", "mouseover", function(e){Spry.Utils.updateContent('fInstr','inc/instrAdd3.inc');return false;}, false); 
   //When mouse is moved over Event Type New Type Label, display specific helptext
   Spry.Utils.addEventListener("lNType", "mouseover", function(e){Spry.Utils.updateContent('fInstr','inc/instrAdd4.inc');return false;}, false); 
   //When mouse is moved over Event Type listbox, display specific helptext
   Spry.Utils.addEventListener("selTypes", "mouseover", function(e){Spry.Utils.updateContent('fInstr','inc/instrAdd3.inc');return false;}, false); 
   //When mouse is moved over Event Type New Type text input, display specific helptext
   Spry.Utils.addEventListener("nType2", "mouseover", function(e){Spry.Utils.updateContent('fInstr','inc/instrAdd4.inc');return false;}, false); 
   //When mouse is moved over Event Location listbox, display specific helptext
   Spry.Utils.addEventListener("selNLL", "mouseover", function(e){Spry.Utils.updateContent('fInstr','inc/instrAdd5.inc');return false;}, false); 
   //When mouse is moved over Event Description textarea, display specific helptext
   Spry.Utils.addEventListener("eDesc", "mouseover", function(e){Spry.Utils.updateContent('fInstr','inc/instrAdd6.inc');return false;}, false); 
   //When mouse is moved over Event Source text input, display specific helptext
   Spry.Utils.addEventListener("nLink", "mouseover", function(e){Spry.Utils.updateContent('fInstr','inc/instrAdd7.inc');return false;}, false); 
   
   
   //When mouse is moved over the Form Fields AccordionPanelContent, display default helptext
   //Spry.$$("#btnHelp").setAttribute("onfocus", "Spry.Utils.updateContent('fInstr','inc/instrAdd.inc');");
   //Spry.Utils.addEventListener("btnHelp", "onclick", btnHndlr, false);
   //Spry.$$("#btnHelp").addEventListener("onclick", "btnHndlr();", false);
   
   //setup event handler for radio inputs
   Spry.Utils.addEventListener("tExist", "click", function(e){radioFocus('tExist');return false;}, false); 
   Spry.Utils.addEventListener("tNew", "click", function(e){radioFocus('tNew');return false;}, false); 
   
   //set with for div holding reCAPTCHA
   Spry.$$("#recaptcha_widget_div").setStyle("width:319px;");
   
   //Create Widgets for Add Events page
   CollapsiblePanel1 = new Spry.Widget.CollapsiblePanel("CollapsiblePanel1");
   Accordion = new Spry.Widget.Accordion("Accordion");
});

loadAccd();