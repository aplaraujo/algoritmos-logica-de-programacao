import { Product } from "./Product.entity";

export class UsedProduct extends Product{
    private _manufactureDate: Date

    constructor(name: string, price: number, manufactureDate: Date) {
        super(name, price);
        this._manufactureDate = manufactureDate;
    }

    get getManufactureDate() {
        return this._manufactureDate;
    }

    set setManufactureDate(manufactureDate: Date) {
        this._manufactureDate = manufactureDate;
    }

    public priceTag() {
        return this.getPrice;
    }
}