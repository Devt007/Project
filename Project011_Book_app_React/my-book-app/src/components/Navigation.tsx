import React, { MouseEvent} from 'react';
import logo from './Icons/logo512.png';
import BookList from './BookList';
import AddBook from './AddBook';
import SearchList from './SearchList';
import Details from './BookDetail';
import {BrowserRouter as Router, Switch, Route} from 'react-router-dom';


interface IState {
    isHome:boolean;
    isSearch: boolean;
    isAddBook: boolean;
}

interface IProps {

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
                </div>
            </div>
            <Router>
                <Switch>
                    <Route exact path = '/'>
                        {this.state.isHome ? 
                            <BookList /> : (
                                this.state.isSearch ? <SearchList /> : <AddBook />
                            )}
                    </Route>
                    <Route path = '/details/:id' component = {Details} />
                </Switch>
            </Router>

        </div>
        )
    }
}

export default Navigation;