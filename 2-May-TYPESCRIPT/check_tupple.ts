var t={
    "user-1": "shivam",
    "user-2": "palak",
    "user-3": "krishna",
    "user-4": "nitin",
    "user-5": "arvind",
    "user-6": "aakash",
}

function find(val:string):string{
    for(var i in t)
    {
        if(i==val){
            return t[i];
          
        }
    }
    return "No match found";
}

console.log(find("user-1"));
console.log(find("user-8"));