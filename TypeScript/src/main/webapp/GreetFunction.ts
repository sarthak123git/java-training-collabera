function greet(name:string, ...msg:string[]): string {
    return "Hi,"+name+". "+msg.join(", ")+"!";
}
console.log(greet("Dr. Tarkeshwar Barua"));
console.log(greet("Dr. Tarkeshwar Barua","Good Morning","Good Afternoon","Good Evening"));