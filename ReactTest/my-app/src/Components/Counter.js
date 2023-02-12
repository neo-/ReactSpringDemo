import React, { Component } from "react";

class Counter extends Component {

    constructor() {
        super()
        this.state = {
            count: 0
        }
    }

    increment() {
        console.log("Incrementing")
        this.setState((prevState) => { return { count: prevState.count + 1 }; }, () => { console.log("Callback increment " + this.state.count) })
    }

    increment5() {
        console.log("Incrementing call 1")
        this.increment()
        console.log("Incrementing call 2")
        this.increment()
        console.log("Incrementing call 3")
        this.increment()
        console.log("Incrementing call 4")
        this.increment()
        console.log("Incrementing call 5")
        this.increment()
    }

    render() {
        console.log("Rendering")
        return (
            <div>
                <div>Counter {this.state.count}</div>
                <button onClick={() => this.increment5()}>Increment</button>
            </div>
        )
    }

}

export default Counter