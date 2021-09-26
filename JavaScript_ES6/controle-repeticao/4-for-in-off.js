let arr = [3,5,7];
arr.foo = "foo";

for (let i in arr){ // somente index
    console.log(i) //  "0",1",2","foo"
}

for (let i of arr){ // somente values
    console.log(i) //  "3","5","7","foo"
}