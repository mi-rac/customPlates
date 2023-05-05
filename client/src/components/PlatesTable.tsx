// PlatesTable.tsx
import React from 'react';
import './PlatesTable.css';
import PlateRow from './PlateRow';
import { Plate } from '../api-generated';

interface PlatesTableProps {
  plates: Plate[];
}

const PlatesTable: React.FC<PlatesTableProps> = ({ plates }) => {
  return (
    <table className={"platesTable"}>
      <thead>
        <tr>
          <th>Registration Number</th>
          <th>Sold</th>
          <th>Price</th>
        </tr>
      </thead>
      <tbody>
        {plates.map((plate) => (
          <PlateRow key={plate.registrationNumber} plate={plate} />
        ))}
      </tbody>
    </table>
  );
};

export default PlatesTable;