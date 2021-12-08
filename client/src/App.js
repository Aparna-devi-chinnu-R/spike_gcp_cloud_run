import './App.css';
import homeService from "./homeService";
import {useEffect, useState} from "react";

function App() {

    const [name,setName] = useState("");

    useEffect(() => {
        getName()
    })


    const getName = () => {
       return  homeService.getResponse().then(response => setName(response.data));
    }
  return (
    <div className="App">
      <header className="App-header">
        <p>
            {name}
        </p>
      </header>
    </div>
  );
}

export default App;
