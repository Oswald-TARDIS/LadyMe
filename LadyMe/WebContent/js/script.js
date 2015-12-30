window.onload=init;
	function init(){
	}
	function offUsign() {
		var cover=document.getElementById("cover");
		cover.style.position="relative";
		cover.style.bottom="170px";
		var su=document.getElementById("showBut");
		su.style.opacity=1;
	}
	function showUsign() {
		var cover=document.getElementById("cover");
		cover.style.position="relative";
		cover.style.bottom="0px";
		var su=document.getElementById("showBut");
		su.style.opacity=0;
	}
    $(window).load(function() {
        $('#slider').nivoSlider({
        });
    });
    jQuery(function(){
    	var top=$("#div_head").offset().top;
    	$(window).scroll(function () {
    	  if ($(window).scrollTop() >= top) {
    	    $("#div_head").attr("style", "position:fixed;top:0;left:0;z-index:10;");
    	  } else {
    	     $("#div_head").removeAttr("style");
    	  }
    	}).trigger("scroll");
    	});
    function check(){
    	if($("#pwd1").val()==$("#pwd2").val()){
    	    document.getElementById("contact").submit();
    	}
    	else{
    		$("#error").html("<font style='font-size:10px;color:#ff9d6f'>密码不一致</p>");
    	}
    }


