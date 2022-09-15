import * as React from 'react';
import Box from '@mui/material/Box';

export default function Logo() {
    return (
        <Box
        component="img"
        sx={{
        height: 70,
        width: 70,
        m: 1,
        }}
        alt="The house from the offer."
        src="./icon"
        />
    );
}