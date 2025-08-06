export class Product {
    private _name: string
    private _price: number
    private _quantity: number

    constructor(name: string, price: number, quantity: number) {
        this._name = name;
        this._price = price;
        this._quantity = quantity;
    }

    public get getName() {
        return this._name;
    }

    public set setName(name: string) {
        this._name = name;
    }

    public get getPrice() {
        return this._price;
    }

    public set setPrice(price: number) {
        this._price = price;
    }

    public get getQuantity() {
        return this._quantity;
    }

    public totalValueInStock(): number {
        return this._price * this._quantity;
    }

    public addProducts(quantity: number): void {
        this._quantity += quantity;
    }

    public removeProducts(quantity: number): void {
        this._quantity -= quantity;
    }
}