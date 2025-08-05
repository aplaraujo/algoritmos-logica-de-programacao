export class Product {
    name: string
    price: number
    quantity: number

    constructor(name: string, price: number, quantity: number) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    TotalValueInStock(): number {
        return this.price * this.quantity;
    }

    AddProducts(quantity: number): void {
        this.quantity += quantity;
    }

    RemoveProducts(quantity: number): void {
        this.quantity -= quantity;
    }

}