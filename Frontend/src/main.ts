import type { Board } from "./Board";
import { Game } from "./Game";
import { ComputerPlayer, HumanPlayer } from "./Player";

var selected: Boolean= false
var startX: number = -1
var endX: number = -1
var startY: number = -1
var endY: number = -1
var p1: ComputerPlayer = new ComputerPlayer(false)
var p2: HumanPlayer = new HumanPlayer(true)
var game: Game = new Game()

window.onload = function(){ 

    game.initialize(p1,p2) 
    console.log("haha")
    init(game.board)
}
function init(board: Board) {
    //i row, j col
    for (let i = 0; i < 8; i++) {
        for (let j = 0; j < 8; j++) {
            let coordinates: string = i.toString()+j.toString()
            let imgPiece = document.getElementById(coordinates)
            if(imgPiece){
                imgPiece.addEventListener("click",() => ClickPiece(coordinates))
                imgPiece.src = board.getBox(i,j).piece?.image
                // if(board.getBox(i,j).piece?.image)
            }
        }
    }
}  
function ClickPiece(coordinates: string){
    console.log(coordinates)
    if(selected){
        console.log("secleted")
        // console.log(" sx" +startX + " sy" + startY + 
        //     " ex" +parseInt(coordinates.charAt(0))+ " ey" +
        //     parseInt(coordinates.charAt(1))  )
        if(game.playerMove(p2,startX,startY,parseInt(coordinates.charAt(0)),parseInt(coordinates.charAt(1)))){
            // reset()
            init(game.board)
            console.log("canmove"+ startX +startY +coordinates.charAt(0) + parseInt(coordinates.charAt(1)))

        }else{
            console.log("cantmove"+ startX +startY +coordinates.charAt(0) + parseInt(coordinates.charAt(1)))
        }
        selected = false
        startX = -1
        startY = -1
        endX = -1
        endY = -1
    }else{
        console.log("!secleted")
        selected = true
        startX = parseInt(coordinates.charAt(0))
        startY = parseInt(coordinates.charAt(1)) 
    }
}

// // let pieces = document.getElementsByClassName('peice');
// // for (let i = 0; i<pieces.length;i++){
// //     pieces[i].addEventListener("dragstart",drag)

// // }
// // function allowDrop(ev){
// //     ev.preventDefault()
// // }
// // function drag(ev){
// //     const piece = ev.target

// // }
// // if (point) {
// //     point.addEventListener('click', () => {
// //         console.log('hi');
// //     });
// // }

