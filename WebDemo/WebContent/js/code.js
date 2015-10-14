function replaceMessage() {
	document.getElementById('message').innerHTML = 'Hello';
}
function access(func) {
	func();
}
var employee = {
		firstName: 'Alex',
		lastName: 'McCarten-Gibbs',
		netSalary:function(){
			alert('Total Salary');
		}
};
//employee.netSalary();
var btnClickRef = document.getElementById('btnClick');

name = new Name("Susan", "John");
var eventHandler = function(){
//	employee.firstName = 'Anil';
//	alert(employee.firstName);
//	employee.netSalary();
	alert(name.fullName());
};

function Name(){
	this.firstName="";
	this.lastName="";
	this.fullName=function(){
		return this.firstName + ' ' + this.lastName;
	};
	this.display=function(){
		alert(this.fullName());
	};
}


btnClickRef.addEventListener("click", eventHandler);

var para = document.createElement("P"); //Creates a new HTML paragraph element.
var node=document.createTextNode("This is new."); //creates a text node.
para.appendChild(node); //Appends the text node to the paragraph element created.
var element = document.getElementById("div1"); //Gets hold of the division tag whose id is div1

para.setAttribute("style", "color:blue; text-align: center;");

//Appends the paragraph element to the div targeted in the previous statement.
element.appendChild(para);


//set javascript to alert user every 3 seconds
//setInterval(function() {alert("hello")}, 3000);