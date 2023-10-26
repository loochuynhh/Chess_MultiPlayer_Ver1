import { Piece } from "./Piece"; 
import { Point } from "src/Point";
import { Board } from "src/Board";
import { Color } from "src/Enum";

export class King extends Piece{
    constructor(color: Color, image: string) 
    { 
        super(color,image); 
    }
    canMove(board: Board, startPoint: Point, endPoint: Point): boolean { 
        if(endPoint.piece && endPoint.piece.color === this.color){ 
            console.log("king spy")
            return false
        } 
        let row = Math.abs(startPoint.row - endPoint.row)
        let col = Math.abs(startPoint.col - endPoint.col)
        if((startPoint.row === endPoint.row && col === 1) || (startPoint.col === endPoint.col && row === 1))
            return true
        else if(row === col && (row ===1 || col === 1)) 
            return true  
        
        return false
    }

}