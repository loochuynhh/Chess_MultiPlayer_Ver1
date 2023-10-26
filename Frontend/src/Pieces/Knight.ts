import { Piece } from "./Piece"; 
import { Point } from "src/Point";
import { Board } from "src/Board";
import { Color } from "src/Enum";

export class Knight extends Piece{
    constructor(color: Color, image: string) 
    { 
        super(color,image); 
    }
    canMove(board: Board, startPoint: Point, endPoint: Point): boolean { 
        if(endPoint.piece && endPoint.piece.color === this.color){ 
            console.log("knight spy")
            return false
        }
        let col: number = Math.abs(startPoint.col - endPoint.col)
        let row: number = Math.abs(startPoint.row - endPoint.row)
        return row*col === 2
        throw new Error("Method not implemented.");
    }

}