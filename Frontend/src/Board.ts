import { Point } from "./Point";
import { Knight } from "./Knight";
import { Pawn } from "./Pawn";

export class Board{
    boxes: Point[][]
    getBox(x: number, y: number): Point {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
          throw new Error("Index out of bound");
        } 
        return this.boxes[x][y];
    }
    constructor(){
        this.boxes = []
        this.resetBoard()
    } 
    resetBoard() {
        this.boxes = []; // Khởi tạo mảng chính
    
        for (let i = 0; i < 8; i++) {
            this.boxes[i] = []; // Khởi tạo mảng con cho mỗi hàng
    
            for (let j = 0; j < 8; j++) {
                if (i === 7 && j === 1) {
                    this.boxes[7][1] = new Point(7, 1, new Knight(false, "./assets/Black-Knight.png"));
                } else if (i === 0 && j === 1) {
                    this.boxes[0][1] = new Point(0, 1, new Knight(true, "./assets/White-Knight.png"));
                } else if (i===1){
                    this.boxes[1][j] = new Point(0, 1, new Pawn(true, "./assets/White-Pawn.png")); 
                } else {
                    this.boxes[i][j] = new Point(i, j);
                }
            }
        }
    }
    
}