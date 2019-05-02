function add(n)  //variable arguments
{

var s:number=0;
var i:number;
for(i=1;i<=n;i++)
{
    s=s+i;  
}
console.log("SUM IS "+s);
}

add(100);