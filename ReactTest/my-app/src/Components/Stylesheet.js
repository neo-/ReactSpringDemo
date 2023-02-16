import React from "react";
import './myStyles.css'

function StyleSheet(props) {

    let className = props.primary ? 'primary' : ''
    return (
        <div>
            <h1 className={`${className} font_xl`}>Style Sheet</h1>
        </div>
    )
}

export default StyleSheet