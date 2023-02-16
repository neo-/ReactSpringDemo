import React from "react";

const heading = {
    fontSize: '100px',
    color: 'blue'
}

function Inline() {
    return (
        <div>
            <h1 className='error'>Error in Inline</h1>
            <h1 style={heading}>Inline</h1>
        </div>
    )
}

export default Inline