
import * as rl from 'readline';

let vrt = rl.createInterface({
    input: process.stdin,
    output: process.stdout
  });


 vrt.question('Enter the number : ', (n) => {

      var a:number=parseInt(n);
      var fact:number=1;
    for(var i:number=1;i<=a;i++)
    {
        fact=fact*i;
    }
 
   console.log("The factorial of a number is  "+fact);
    vrt.close();
  });