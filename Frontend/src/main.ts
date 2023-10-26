import type { Board } from "./Board";
import { Color } from "./Enum";
import { Game } from "./Game";
import { Self, Opponent } from "./Player";

var selected: Boolean= false
var startX: number = -1
var endX: number = -1
var startY: number = -1
var endY: number = -1
var p1: Self = new Self(Color.WHITE)            //Chua co socket => Tam thoi setting ban than la trang
var p2: Opponent = new Opponent(Color.BLACK)    //Chua co socket => Tam thoi setting ban than la den
var game: Game = new Game()

window.onload = function(){ 

    game.initialize(p1,p2) 
    console.log("tao game thanh cong")
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
                let imgPiece1 = document.getElementById("i" + coordinates)
                if(board.getBox(i,j).piece?.image && imgPiece1)
                    imgPiece1.src = board.getBox(i,j).piece?.image 
                else if(imgPiece1){
                    imgPiece1.src = ""
                }  

                // let coordinates: string = i.toString()+j.toString()
                // let imgPiece = document.getElementById(coordinates)
                // if(imgPiece){
                //     imgPiece.addEventListener("click",() => ClickPiece(coordinates))
                //     imgPiece.src = board.getBox(i,j).piece?.image 
                // }
            }
        }
    }
}  
//Chi ap dung cho self, khong ap dung cho opponent
function ClickPiece(coordinates: string){
    console.log(coordinates)
    if(selected){
        console.log("secleted") 
        if(game.playerMove(p1,startX,startY,parseInt(coordinates.charAt(0)),parseInt(coordinates.charAt(1)))){
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
