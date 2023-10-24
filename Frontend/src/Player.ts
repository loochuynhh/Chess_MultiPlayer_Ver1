export abstract class Player {
    whiteSide: boolean;
    humanPlayer: boolean;

    constructor(whiteSide: boolean, humanPlayer: boolean) {
        this.whiteSide = whiteSide;
        this.humanPlayer = humanPlayer;
    }

    isWhiteSide(): boolean {
        return this.whiteSide;
    }

    isHumanPlayer(): boolean {
        return this.humanPlayer;
    }
}

export class HumanPlayer extends Player {
    constructor(whiteSide: boolean) {
        super(whiteSide, true);
    }
}

export class ComputerPlayer extends Player {
    constructor(whiteSide: boolean) {
        super(whiteSide, false);
    }
}
