import React, { useState } from "react";
import "./SearchInput.css";

type Props = {
    onSearch: (searchTerm: string) => void;
};

const SearchInput: React.FC<Props> = ({ onSearch }) => {
    const [searchTerm, setSearchTerm] = useState("");

    const handleChange = (event: React.ChangeEvent<HTMLInputElement>) => {
        setSearchTerm(event.target.value);
    };

    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();
        onSearch(searchTerm);
    };

    return (
        <form className="searchForm" onSubmit={handleSubmit}>
            <input
                className="searchInput"
                type="text"
                value={searchTerm}
                onChange={handleChange}
                placeholder="Search for similar car registration numbers"
            />
            <button className="searchButton" type="submit">
                Search
            </button>
        </form>
    );
};

export default SearchInput;