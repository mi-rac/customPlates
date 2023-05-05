import React from 'react';
import './App.css';
import SearchInput from "./components/SearchInput";
import {PlateEntityApi} from "./api-generated";

function App() {
    const apiPlates = new PlateEntityApi();
    const handleSearch = (searchTerm: string) => {
        console.log("Searching for:")
        apiPlates.findPlateByRegistrationNumberContainingPlateUsingGET(searchTerm)
            .done((response: any) => console.log("Search results: ", response))
            .fail((error: { response: JQueryXHR; errorThrown: string }) => console.log("Error searching for results: ", error));
    };
  return (
    <div className="App">
        <header className="App-header">
            <h1>Car Registration Number Search</h1>
        </header>
        <main>
            <SearchInput onSearch={handleSearch} />
        </main>
    </div>
  );
}

export default App;
