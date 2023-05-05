import React from 'react';
import { Plate } from '../api-generated';

interface PlateRowProps {
    plate: Plate;
}

const PlateRow: React.FC<PlateRowProps> = ({ plate }) => {
    return (
        <tr>
            <td>{plate.registrationNumber}</td>
            <td>{plate.sold ? 'Yes' : 'No'}</td>
            <td>{plate.price}</td>
        </tr>
    );
};

export default PlateRow;