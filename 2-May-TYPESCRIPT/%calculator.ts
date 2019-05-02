
var a,b,c;
a=parseInt(prompt("Enter marks in first subject:"));
b=parseInt(prompt("Enter marks in second subject:"));
c=parseInt(prompt("Enter marks in third subject:"));

if(a>=40)
{
    if(b>=40)
    {
        if(c>=40)
        {
            if((a+b+c)>=125)
            console.log("PASSED !!");
        }
    }
}
else

console.log("BETTER LUCK NEXT TIME");

