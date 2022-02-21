/**
 * 
 */
 $(document).ready(function(){
	//function body
	console.log("first j query")
	
	
	$("#btn5").click(function(){
	//let v=$("#f").val();
//	console.log(v);
	//$("#f").val("sarthak");
	
	//let c=$("#content").text();
	//console.log(c);
	let s=$('.image').attr('src');
	console.log(s);
});
	
});


// fade function

$("#fadeIN").click(function(){
	console.log("click");
	//$("#container").hide();
	$("#container").fadeOut(3000, function(){
		alert("gone");
	});
});
$("#fadeOUT").click(function(){
	console.log("click");
	//$("#container").show();
	$("#container").fadeIn();
});
$("#fadeTOGGLE").click(function(){
	$("#container").fadeToggle();
});

$("#fadeTO").click(function(){
	$("#container").fadeTo(500,0.2);
});

// slide up, down, toggle

$("#btn2").click(function(){
	$("#container").slideUp(3000);
});

$("#btn1").click(function(){
	$("#container").slideDown(4000);
});

$("#btn3").click(function(){
	$("#container").slideToggle(3000);
});

// animate
$("#btn4").click(function(){
	$("#container").animate({width: "+=100", height: "+=100", opacity:0.5, left:"250px"}, 3000,
	 function(){
	$("#container").animate(
		{borderRadious: "20px",
			left:"0",width: "100", height: "+=100"});
	});
});
// val function Get and Set data in field





