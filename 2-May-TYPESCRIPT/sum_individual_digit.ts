
import * as rl from 'readline';

let vrt = rl.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  
  vrt.question('Enter the number: ', (n) => {

      var a:number=parseInt(n);
      var d:number=0;
      var r:number;
    while(a > 0)
    {
    r=Math.floor(a%10);
    d=d+r;
    a=Math.floor(a/10);
    }
 
   console.log("The sum of each digit is : "+Math.floor(d));
    vrt.close();
  });


