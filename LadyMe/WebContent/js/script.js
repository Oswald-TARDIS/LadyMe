window.onload=headMove;
	function headMove(){
		
	}
	function offUsign() {
		var cover=document.getElementById("cover");
		cover.style.position="relative";
		cover.style.bottom="170px";
		var su=document.getElementById("su");
		su.style.opacity=1;
	}
	function showUsign() {
		var cover=document.getElementById("cover");
		cover.style.position="relative";
		cover.style.bottom="0px";
		var su=document.getElementById("su");
		su.style.opacity=0;
	}