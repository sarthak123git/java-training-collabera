/**
 * 
 */
 function myFunction(){
    var name="open my name";
    function printName(){
        alert("My Name is : "+name);
        console.log("My Name is : "+name);
    }
    printName();
}
var yourFunction=myFunction();
yourFunction();