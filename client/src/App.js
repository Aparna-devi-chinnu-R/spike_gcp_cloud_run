import userService from "./UserService";
import {useEffect, useState} from "react";

function App() {

    const [users,setUsers] = useState([]);
    const [name, setName] = useState("");

    useEffect(() => {
        getUsers()
    })


    const getUsers = () => {
       return  userService.getUsers().then(response => setUsers(response.data));
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        userService.createUser({"userName": name}).then(response => {
            console.log("Saved successfully",response)
        })
    }
  return (
    <div className="App">
      <header className="App-header">
          <div>
              <form>
                  <label>
                      Name:
                      <input type="text" name="name" onChange={(e)=>setName(e.target.value)} />
                  </label>
                  <input type="submit" value="Submit" onClick={(e)=>handleSubmit(e)}  />
              </form>
          </div>

        <div>
            {users.map(user=><div key={user.id}>{user.userName}</div>)}
        </div>
      </header>
    </div>
  );
}

export default App;
