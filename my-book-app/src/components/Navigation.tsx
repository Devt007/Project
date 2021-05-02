import React, { MouseEvent} from 'react';
import logo from './Icons/logo512.png';
import BookList from './BookList';
import AddBook from './AddBook';
// import SearchList from './SearchList';
import Details from './BookDetail';
import {BrowserRouter as Router, Switch, Route} from 'react-router-dom';


interface IState {
    isHome:boolean;
    isSearch: boolean;
    isAddBook: boolean;
}

interface IProps {
    // history : any;

}

class Navigation extends React.Component<IProps, IState>{
    constructor(props:IProps){
        super(props);
        this.state = {
            isHome : true,
            isSearch : false,
            isAddBook : false
        }
    }

    HomeHandler = ()=> {
        this.setState({
            isHome:true,
            isSearch:false,
            isAddBook : false
        })

    }
    SearchHandler = ()=> {
        this.setState({
            isHome:false,
            isSearch:true,
            isAddBook : false
        })
    }
    handleNav(e:MouseEvent){
        console.log("yes its Working");
    }

    AddHandler = ()=> {
        this.setState({
            isHome:false,
            isSearch:false,
            isAddBook : true
        })
    }

    render(){
        console.log(this.props);
        return (
        <div onWheel = {this.handleNav}>
            <div>
                <div className = "navigation1">
                    <img src = {logo} alt ="Logo" />
                    <h1>The Book App</h1>
                </div>
                
                <div className = "navigation2">
                    <button onClick =  {this.HomeHandler}>HOME</button>
                    <button onClick = {this.SearchHandler}>SEARCH</button>
                    <button onClick = {this.AddHandler}>ADD NEW BOOK</button>
                    {/* <Router>
                    <Link to='/'>HOME</Link>
                    <Link to='/'>SEARCH</Link>
                    <Link to='/addBook'>ADD NEW BOOK</Link>
                    </Router> */}
                </div>
            </div>
            <Router>
                <Switch>
                    <Route exact path = '/' component = {BookList}>
                        {/* <BookList/>  */}
                        {/* {this.state.isHome ? 
                            <BookList csson = {this.state.isSearch}/> : (
                                this.state.isAddBook ? <AddBook /> : null
                            )} */}
                    </Route>
                    <Route path = '/addBook' component = {AddBook}/>
                    <Route path = '/details/:id' component = {Details} />
                </Switch>
            </Router>

        </div>
        )
    }
}

export default Navigation;