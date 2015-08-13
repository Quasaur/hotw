<!-- HTML fragment containing results info for pvSugEvents Page View -->
<p id="resultsInfo">
   Page <strong>{ds_PageNumber}</strong> of <strong>{ds_PageCount}</strong>.<br />
   Total Records Retrieved: <strong>{ds_PageTotalItemCount}</strong>
   </p>
   <input id="bFirst" type="button" value="First" onclick="pvSugEvents.firstPage(); " />
   <input id="bPrev" type="button" value="Prev" onclick="pvSugEvents.previousPage(); " />
   <input id="bNext" type="button" value="Next" onclick="pvSugEvents.nextPage(); " />
   <input id="bLast" type="button" value="Last" onclick="pvSugEvents.lastPage(); " />
   <p><strong>Record sets (by page):</strong></p>
   <p id="ppvInfo">
   <a id="rsGrps" href="#" onclick="pvSugEvents.goToPage('{ds_PageNumber}'); ">{ds_PageFirstItemNumber}-{ds_PageLastItemNumber}</a>
   <span id="curPage" class="currentPage">{ds_PageFirstItemNumber}-{ds_PageLastItemNumber}</span>
   </p>
   