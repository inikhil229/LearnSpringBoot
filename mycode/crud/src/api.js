const userData = {
    id:2,
    name:"Nikhil",
    email:"nr099@gmail.com",
    age: 20,
    rollNo: 19,
    subject:"Java spring boot"
}

async function call(user){
    const f = await fetch("http://localhost:8080/api/student",{
        method:"POST",
        headers:{
            "content-type":"application/json"
        },
        body:JSON.stringify(user)
    })
    const data = await f.json();
    console.log(data)
}

call(userData)