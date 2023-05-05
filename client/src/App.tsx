import React, { useState } from 'react';
import './App.css';
import SearchInput from "./components/SearchInput";
import { PlateEntityApi } from "./api-generated";
import PlatesTable from './components/PlatesTable';
import { Plate } from './api-generated';

function App() {
    const [plates, setPlates] = useState<Plate[]>([]);
    const apiPlates = new PlateEntityApi("server:8080");

    const handleSearch = (searchTerm: string) => {
        console.log("Searching for: ", searchTerm);
        apiPlates.findPlateByRegistrationNumberContainingPlateUsingGET(searchTerm)
            .done((response: any) => {
                const platesData = response.body._embedded.plates;
                setPlates(platesData);
            })
            .fail((error: { response: JQueryXHR; errorThrown: string }) => console.log("Error searching for results: ", error));
    };

    return (
        <div className="App">
            <header className="App-header">
                <h1>Car Registration Number Search</h1>
            </header>
            <main>
                <SearchInput onSearch={handleSearch} />
                {plates.length > 0 && <PlatesTable plates={plates} />}
            </main>
        </div>
    );
}

export default App;
