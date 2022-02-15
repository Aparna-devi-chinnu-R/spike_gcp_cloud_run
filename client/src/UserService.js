import axios from "axios";

// const BASE_URL="https://spike-api-6ekkrcnqiq-el.a.run.app"
const BASE_URL="http://localhost:8080"
const userService = () => {

    return {
        getUsers:  () => {
            return  axios.get(BASE_URL+"/api/users");
        },
        createUser:  (user) => {
            return  axios.post(BASE_URL+"/api/users", user);
        },
    }
}

export default userService();