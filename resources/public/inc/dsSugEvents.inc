<?php
/* dsSugEvents Spry XMLDataSet
   Code Logic: 
   1) initialize the Args class
   2) check to see if there is any _GET data. 
   3) if there isn't any _GET data, create an unfiltered Spry XMLDataSet.
   4) else, if there is any _GET data, create a filtered Spry XMLDataSet. 
* /
/* initialize instance of args to handle filters if any */
$Args = new args();
/* check to see if there is any _GET data by load up the contents of _GET global array */
$Args->LoadGET();
/* if there are no valid args in _GET, create unfiltered XMLDataSet */
if($Args->getNumValidArgs() == 0)
   echo "<script language='JavaScript' type='text/javascript'>var dsSugEvents = new Spry.Data.XMLDataSet('data/class.xmlFrmPrcssr1.php', 'events/event',  {entityEncodeStrings: false});</script>";
else echo "<script language='JavaScript' type='text/javascript'>var dsSugEvents = new Spry.Data.XMLDataSet('data/class.xmlFrmPrcssr1.php?" .$Args->getStrFilter(). "', 'events/event',  {entityEncodeStrings: false});</script>"; 
?>