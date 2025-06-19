const Hobbies=['Reading','Teaching',8,true];
for(let hobby of Hobbies){
    console.log(hobby);
}

const table =()=>{
    let table = '';
    for(let i=1; i<=10; i++){
        table += `2 x ${i} = ${2*i}\n`;
    }
    return table;
}
