import { Point } from "./Point"
import { Board } from "./Board" 
export abstract class Piece { 
    private _killed : boolean = false
    private _white : boolean = false
    private _image: string = ""

	constructor (white: boolean, image: string) 
	{ 
		this._white = white
        this._image = image
	} 

	get white(): boolean { 
		return this._white
	} 
    get killed(): boolean { 
		return this._killed
	} 

    set white(white: boolean){
        this._white = white
    }
    set killed(killed: boolean){
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
