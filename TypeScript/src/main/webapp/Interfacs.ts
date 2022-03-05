interface IEmployee{
    empCode:number;
    empName:string;
    //salray:(number) => number;
    getEmpName(number):string;  // abstract function
}
let obj:IEmployee ={empCode:1,
                    empName:"Tarkeshwar",
                    getEmpName(number):string{return "Tarkeshwar";}};
console.log(obj.getEmpName(1));
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);