import * as rl from 'readline';

 
      let vrt = rl.createInterface({
        input: process.stdin,
        output: process.stdout
      });
    
    
     vrt.question('Enter the String : ', (n) => {

        var c1:number=0;var c2:number=0;var c3:number=0;var c4:number=0;var c5:number=0;
     for(var i:number=0;  i<n.length ;i++)
     {
         switch (n[i]) {
            
                 case 'a':c1++;
                 
                 break;
                 case 'e':c2++;
                 
                 break;
                 case 'i':c3++;
                 
                 break;
                 case 'o':c4++;
                 
                 break;
                 case 'u':c5++;
                 
                 break;         

             default:console.log("No vowels Found");
                 break;
         }
     }
     console.log("occurence of A :"+c1);
     console.log("occurence of E :"+c2);
     console.log("occurence of I :"+c3);
     console.log("occurence of O :"+c4);
     console.log("occurence of U :"+c5);

        vrt.close();
    });