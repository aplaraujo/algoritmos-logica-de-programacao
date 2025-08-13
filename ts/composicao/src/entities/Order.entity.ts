import { OrderStatus } from "./OrderStatus.enum"

export class Order {
    private _id: number
    private _moment: Date
    private _status: OrderStatus

    constructor(id: number, moment: Date, status: OrderStatus) {
        this._id = id;
        this._moment = moment;
        this._status = status;
    }

    get getId() {
        return this._id;
    }

    set setId(id: number) {
        this._id = id;
    }

    get getMoment() {
        return this._moment;
    }

    set setMoment(moment: Date) {
        this._moment = moment;
    }

    get getStatus() {
        return this._status;
    }

    set setStatus(status: OrderStatus) {
        this._status = status;
    }
}