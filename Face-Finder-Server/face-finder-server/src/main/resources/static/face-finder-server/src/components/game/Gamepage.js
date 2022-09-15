import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';

/**
 * Hinweis:
 * Diese Komponente wurde nicht im Rahmen des Projektes implementiert.
 * Quelle: https://github.com/mui/material-ui/blob/v5.10.5/docs/data/material/components/app-bar/ButtonAppBar.tsx
 */

export default function Gamepage() {
  return (
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <TextField id="filled-basic" label="Vorname Nachname" variant="filled" />
    </Box>
  );
}
