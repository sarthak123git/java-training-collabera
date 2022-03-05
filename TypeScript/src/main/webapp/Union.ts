function displayType(code:(string|number))
{
	if(typeof(code)==="number")
		console.log("code is number")
	else if(typeof(code)==="string")
		console.log("code is String")
}
displayType(123);
displayType("Tushar");
//displayType(true);

//-----------------------------------------------------------------------------------

