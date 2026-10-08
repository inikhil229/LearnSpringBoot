const userData = {
    id:1,
    name:"Nikhil",
    email:"nr099@gmail.com",
    age: 20,
    rollNo: 19,
    subject:"Java spring boot"
}

async function call(user){
    const f = await fetch("http://localhost:8080/api/student/2",{
        method:"DELETE",
        headers:{
            "content-type":"application/json"
        },
        // body:JSON.stringify(user)
    })
    const data = await f.text();
    console.log(data)
}

call(userData)