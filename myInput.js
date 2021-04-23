const MyinputComponent = (props)=>{
    return (
        <div>
            <label>Please enter your name</label>
            <input type="text" placeholder={props.label_1}
            onChange={props.handleChange}></input>
            <br></br><br></br>
            <label>Please enter your name</label>
            <input type="text" placeholder={props.label_2}
            onChange={props.handleChange}></input>
            <br></br><br></br>
            <button onClick={props.handleSave}>Save</button>
            <br></br><br></br>
        </div>
    )
}

export {MyinputComponent}