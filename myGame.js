import React from "react"; // create components
//import ReactDOM from "react-dom";

import { Board } from "./myBoard.js";
import { CreateTable } from "./myTable.js";
import { MyinputComponent } from "./myInput.js";
//import { Mytimer } from "./timer.js";

class Game extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      history: [
        {
          squares: Array(9).fill(null),
        },
      ],
      xIsNext: true,
      stalemate: 0,
      player_1: "xyz",
      player_2: "abc",
      gameStatus : "Off",
      player_1_time : 200,
      player_2_time : 200,
      player_status : true,
      time_stamp: false
    };
  }
  //For reset
  resetFunc = () => {
    window.location.reload(false);
  };
  //My input boxes
  handleChange = (text) => {
    console.log(text.target.value);
    this.setState({player_2: text.target.value})
  };
  handleSave = () => {
    if(this.state.player_1==="xyz")
      this.setState({player_1: this.state.player_2})
    else
      console.log(this.state.player_1,this.state.player_2)
  };

  //For button Handle click
  handleClick(i) {
    const history = this.state.history;
    const current = history[history.length - 1];
    const squares = current.squares.slice();
    if (calculateWinner(squares) || squares[i]) {
      return;
    }
    squares[i] = this.state.xIsNext ? "X" : "O";
    this.setState({
      history: history.concat([
        {
          squares: squares,
        },
      ]),
      xIsNext: !this.state.xIsNext,
      player_status : !this.state.player_status
    });
    //var count = squares.indexOf(squares[i])
    //console.log(squares[i])
    //console.log(count)
    const stale_count = this.state.stalemate;
    this.setState({
      stalemate: stale_count + 1,
    });

    console.log(this.state.stalemate);
  }
  //status of Game
  changeGame(){
    /*if(this.state.player_1!=="xyz" && this.state.player_1!=="abc"){
      this.setState({
        gameStatus: "on"
      })
    }
    else{
      console.log("Enter yout input")
    }*/
    this.setState({
      gameStatus: "on"
    })
  }
  //Timer Status
  countTimer(){
    if(!this.state.time_stamp){
    if(this.state.player_status){
      console.log(this.state.player_status)
      this.myinterval = setTimeout(() => {
        this.setState({
          player_1_time: this.state.player_1_time - 1
        }) 
      }, 500);
    }
    else{
      this.myinterval_1 = setTimeout(() => {
        this.setState({
          player_2_time: this.state.player_2_time - 1
        })  
      }, 500);
    }
  }
  }
  //Rendering All inputs
  renderInput(){
    return (
        <div>
          <MyinputComponent label_1="Player 1"
          label_2="Player 2"
          handleChange={(text)=>this.handleChange(text)}
          handleSave={()=>this.handleSave()}
          />
          <button onClick={this.resetFunc}>Reset</button>
          <div>
            <br></br>
          <button onClick={()=>{this.changeGame()}}>Start Game</button>
          </div>
        </div>
    )
  }
  renderContent() {
    const history = this.state.history;
    const current = history[history.length - 1];
    const winner = calculateWinner(current.squares);

    var winners = null;
    let status = "";
    if (winner) {
      this.setState({
        time_stamp : true
      })
      if(winner[0]==="X"){
        //status = "Winner: " + winner[0];
        status = "Winner: " + this.state.player_1;
      }
      else
        status = "Winner: " + this.state.player_2;
      winners = [winner[1], winner[2], winner[3]];
    } else {
      if (this.state.stalemate - 1 === 8) status = "Draw, Both you need practice";
      else status = "Next player: " + (this.state.xIsNext ? this.state.player_1
         : this.state.player_2); 
      //status = "Next player: " + (this.state.xIsNext ? "X" : "O");
    }

    return (
      <div>
        <div className="game">
          <div className="game-board">
            <Board
              squares={current.squares}
              onClick={(i) => this.handleClick(i)}
              winners={winners}
            />
          </div>

          <div className="game-info">
            <div>{status}</div>
            <br></br>
            <button onClick={this.resetFunc}>Reset</button>
            <div>
              <br></br>
            {this.countTimer()}
            <label class="space">{this.state.player_1}</label>
              <p>{this.state.player_1_time}</p>
             <label class="space">{this.state.player_2}</label>
             <p>{this.state.player_2_time}</p>
              </div>
            <br></br>
            <br></br>
            <table>
              <tbody>
                <tr>
                  <th>Sl no</th>
                  <th>Object</th>
                  <th>Index</th>
                </tr>
                <CreateTable list={current.squares} />
              </tbody>
            </table>
          </div>
        </div>
      </div>
    );
  }
  render(){
    if(this.state.gameStatus==="on")
      return this.renderContent()
    else
      return this.renderInput()
  }
}



function calculateWinner(squares) {
  const lines = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6],
  ];
  for (let i = 0; i < lines.length; i++) {
    const [a, b, c] = lines[i];
    if (squares[a] && squares[a] === squares[b] && squares[a] === squares[c]) {
      return [squares[a], a, b, c];
    }
  }
  return null;
}

export { Game };
