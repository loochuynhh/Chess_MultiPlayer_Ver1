import { Piece } from "./Piece";
import { Point } from "./Point";
import { Board } from "./Board";

export class Knight extends Piece{
    constructor(white: boolean, image: string) 
    { 
        super(white,image); 
    }
    canMove(board: Board, startPoint: Point, endPoint: Point): boolean { 
        if(endPoint.piece && endPoint.piece.white === this.white){ 
            console.log("knight")
            return false
        }
        let col: number = Math.abs(startPoint.col - endPoint.col)
        let row: number = Math.abs(startPoint.row - endPoint.row)
        return row*col === 2
        throw new Error("Method not implemented.");
    }

}