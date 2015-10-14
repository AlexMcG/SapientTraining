$("#updButton").click(function(){
		//var day = $("#day").value;
		//var month = $("#month").value;
		//var year = $("#year").value;
		var day = document.getElementById("day").value;
		var month = document.getElementById("month").value;
		var year = document.getElementById("year").value;
		alert(year + ":" + month + ":" + day);
		$.ajax({
			url: 'rest/date/update',
			type: 'PUT',
			data: {year : year, month : month, day : day},
			success: function(result){ $("#updStatus").html(result); }
		});
});