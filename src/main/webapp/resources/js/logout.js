$(function(){
	$("#logout").click(function(){
		$.ajax({
			method : "POST",
			url : "/lms/logout",
			success : function() {

					$("#modal1").modal({show:true});
					
					//메인페이지 이동			
					$("#modal1").on("hidden.bs.modal", function(){
						document.location.href="/lms/index/";

					});
					
			},
			error : function(request, status,
					error) {
				alert("code: " + request.status
						+ "\n" + "error:"
						+ error);
			}
		});
	});
});


/*
// 메인페이지 이동
$("#modal1").on("hidden.bs.modal", function(){
	document.location.href="/lms/index/";
	alert("a");
});*/

