var multi:number[][] = [[1,2,3],[3,7,9],[2,4,5]];
var i:number;
var j:number;
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        if((i+j)<=2)
        console.log(multi[i][j]);
    }
}
