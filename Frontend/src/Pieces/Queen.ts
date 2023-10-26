import { Piece } from "./Piece"; 
import { Point } from "src/Point";
import { Board } from "src/Board";
import { Color } from "src/Enum";

export class Queen extends Piece{
    constructor(color: Color, image: string) 
    { 
        super(color,image); 
    }
    canMove(board: Board, startPoint: Point, endPoint: Point): boolean { 
        if(endPoint.piece && endPoint.piece.color === this.color){ 
            console.log("Bishop spy")
            return false
        } 
        if(startPoint.row === endPoint.row || startPoint.col === endPoint.col)
            return true
        else if(Math.abs(startPoint.row - endPoint.row) === Math.abs(startPoint.col - endPoint.col)) 
            return true  
        
        return false
        throw new Error("Method not implemented.");
    }

}