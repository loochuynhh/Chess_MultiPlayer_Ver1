import { Piece } from "./Piece";
import { Point } from "./Point";
import { Board } from "./Board";

export class Pawn extends Piece{
    constructor(white: boolean, image: string) 
    { 
        super(white,image); 
    }
    canMove(board: Board, startPoint: Point, endPoint: Point): boolean { 
        if(endPoint.piece && endPoint.piece.white === this.white){ // Cannot kill allies
            console.log("pawn")
            return false
        }
        let col: number = Math.abs(startPoint.col - endPoint.col)
        let row: number = Math.abs(startPoint.row - endPoint.row)
        return row+col === 1
        throw new Error("Method not implemented.");
    }

}