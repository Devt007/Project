import React, { useState } from 'react';
// import { useParams } from 'react-router';
// import { useParams } from 'react-router-dom';
const records = localStorage.getItem('records');

interface IProps {
    match :{
        params : {
            id :String
        }
    }
}

interface IState {
    id : String
}



const BookDetail=(props:IProps) =>{
    // console.log(account);
    // console.log(params);
    const deleteHandler = () => {
        const data = JSON.parse(records!);
        // const value = props.match.params.id;
        for (let i = 0; i < data.length; i++) {
            const value = id;
            if(data[i]._id === value)
                data.splice(i, 1);
        }
        const new_data = JSON.stringify(data);
        localStorage.setItem('records', new_data);
    }

    const [id, setid] = useState({id: props.match.params.id});
    const data = JSON.parse(records!);
    const value = props.match.params.id;
    
    
    console.log(value);
    console.log(data);
    var got:any;
    for (let i = 0; i < data.length; i++) {
        if(data[i]._id === value){
            got = data[i];
        }
    }
    console.log(got);
    return(
        <div>
            <div>
                <h2>{got.title}</h2>
                <p>By {got.author}  | RS. {got.price}  | {got.rating}</p>
            </div>
            <div>
                <img src = {got.cover} alt = "Dumbass"></img>
                <div>
                    <p>{got.description}</p>
                </div>
            </div>
            <button onClick = {deleteHandler}> DELETE BOOK</button>

        </div>
    )
    
}

export default BookDetail;