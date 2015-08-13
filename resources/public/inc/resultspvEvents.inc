<!-- HTML fragment containing results info for pvEvents Page View -->
<p id="resultsInfo">
   Page <strong>{ds_PageNumber}</strong> of <strong>{ds_PageCount}</strong>.<br />
   Total Records Retrieved: <strong>{ds_PageTotalItemCount}</strong>
   </p>
   <input id="bFirst" type="button" value="First" onclick="pvEvents.firstPage(); " />
   <input id="bPrev" type="button" value="Prev" onclick="pvEvents.previousPage(); " />
   <input id="bNext" type="button" value="Next" onclick="pvEvents.nextPage(); " />
   <input id="bLast" type="button" value="Last" onclick="pvEvents.lastPage(); " />
   <p><strong>Record sets (by page):</strong></p>
   <p id="ppvInfo">
   <a id="rsGrps" href="#" onclick="pvEvents.goToPage('{ds_PageNumber}'); ">{ds_PageFirstItemNumber}-{ds_PageLastItemNumber}</a>
   <span id="curPage" class="currentPage">{ds_PageFirstItemNumber}-{ds_PageLastItemNumber}</span>
   </p>
   