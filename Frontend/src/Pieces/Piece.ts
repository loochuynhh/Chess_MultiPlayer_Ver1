import { Point } from "src/Point";
import { Board } from "src/Board";
import { Color } from "src/Enum";
export abstract class Piece { 
    private _killed : boolean = false
    private _color: Color 
    private _image: string = ""

	constructor (color: Color, image: string) 
	{ 
		this._color = color
        this._image = image
	} 

    public get color(): Color {
        return this._color
    }
    public set color(value: Color) {
        this._color = value
    }
    public get killed(): boolean { 
		return this._killed
	}  
    public set killed(killed: boolean){
        this._killed = killed
    } 
    public get image(): string {
        return this._image
    }
    public set image(value: string) {
        this._image = value
    }
    abstract canMove(board: Board, startPoint: Point, endPoint: Point): boolean 
} 
