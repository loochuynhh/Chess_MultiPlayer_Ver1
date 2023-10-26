import { Piece } from "./Piece"; 
import { Point } from "src/Point";
import { Board } from "src/Board";
import { Color } from "src/Enum";

export class Rook extends Piece{
    constructor(color: Color, image: string) 
    { 
        super(color,image); 
    }
    canMove(board: Board, startPoint: Point, endPoint: Point): boolean { 
        if(endPoint.piece && endPoint.piece.color === this.color){ 
            console.log("rook spy")
            return false
        }
        //Nuoc di binh thuong
        if(startPoint.row === endPoint.row || startPoint.col === endPoint.col)
            return true
        return false
        throw new Error("Method not implemented.");
    }

}