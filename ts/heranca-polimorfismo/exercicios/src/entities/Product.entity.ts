export class Product {
    private _name: string
    private _price: number

    constructor(name: string, price: number) {
        this._name = name;
        this._price = price;
    }

    get getName() {
        return this._name;
    }

    set setName(name: string) {
        this._name = name;
    }

    get getPrice() {
        return this._price;
    }

    set setPrice(price: number) {
        this._price = price;
    }

    public priceTag(): number {
        return this._price;
    }
}