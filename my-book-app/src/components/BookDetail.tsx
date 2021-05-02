import React, { useState } from 'react';
// import { useParams } from 'react-router';
// import { useParams } from 'react-router-dom';
const records = localStorage.getItem('records');
// console.log(JSON.parse(records!));

interface IProps {
    match :{
        params : {
            id :String
        }
    }
}



const BookDetail=(props:IProps) =>{
    // console.log(account);
    // console.log(params);
    const deleteHandler = () => {
        console.log('function clicked');
        const data = JSON.parse(records!);
        // const value = props.match.params.id;
        for (let i = 0; i < data.length; i++) {
            console.log(id.id);
            if(data[i]._id === id.id){
                console.log('deleting '+value);
                data.splice(i, 1);
            }
        }
        const new_data = JSON.stringify(data);
        localStorage.setItem('records', new_data);
        return(
            <p>Deleted Sucessfully</p>
        )
    }

    const [id] = useState({id: props.match.params.id});
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
        <div className = "details-book">
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