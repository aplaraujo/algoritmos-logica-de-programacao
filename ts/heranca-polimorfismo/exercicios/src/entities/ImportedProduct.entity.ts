import { Product } from "./Product.entity";

export class ImportedProduct extends Product {
    private _customsFee: number

    constructor(name: string, price: number, customsFee: number) {
        super(name, price);
        this._customsFee = customsFee;
    }

    get getCustomsFee() {
        return this._customsFee;
    }

    set setCustomsFee(customsFee: number) {
        this._customsFee = customsFee;
    }

    public totalPrice(): number {
        return this._customsFee + this.getPrice;
    }

    public priceTag(): number {
        return this.totalPrice();
    }
}