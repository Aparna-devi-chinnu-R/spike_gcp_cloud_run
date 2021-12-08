import axios from "axios";
import "regenerator-runtime/runtime";

const homeService = () => {

    return {

        getResponse:  () => {
            return  axios.get(`https://spike-api-6ekkrcnqiq-el.a.run.app`);
        },
        //log
    }
}

export default homeService();