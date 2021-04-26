import React from 'react';
import {Stars} from './star-rating';
// import Details from './BookDetail';
import { Link} from 'react-router-dom';

const records = localStorage.getItem('records');

class BookList extends React.Component{

    // handleDetailRoute = () => {
    //     console.log('clicked');
    //     // console.log('cpming herer');
    //     const history = useHistory();

    //     // return(useHistory.())
        
    // }

    handleMouserOver = (rating:number) => {
        console.log("Rating"+ rating);
    }

    render(){
        const data = JSON.parse(records!);
        // for (let i = 0; i < data.length; i++) {
        //     console.log("This index: \n"+i, data[i]);          
        // }
        // const data2 = [{"name":"test1"}, {"name":"test2"}];
        // const listdata = data.map((d:any) => <li key={d._id}>{d.title}</li>);
        var linkstyle = {
            margin: '100px',
        }
        return (
            <div>
                {data.map((book:any) =>
                <div className = "book" key = {book._id}>
                    <img src = {book.cover} alt = "BookCard"></img>
                    <div className = "book-card">
                        <h2>{book.title}</h2>
                        <div className = "bookspecification">
                            <div className = "specialization">
                                <p>Title: {book.title}</p>
                                <p>Author: {book.author}</p>
                            </div>
                            <div className = "specialization">
                                <div className = "rating" onMouseEnter = {() => this.handleMouserOver(book.rating)}><span>Rating : </span><Stars current = {book.rating} outof = {5} minof = {1}/></div>
                                <p>Price: {book.price}</p>
                            </div>
                        </div>
                        <Link style = {linkstyle} to= {"/details/"+book._id}>Click to Details</Link>
                    </div>
                    {/* <li key={d._id}>{d.title}</li> */}
                </div>
                )}
            </div>
        );
    }
}

export default BookList;