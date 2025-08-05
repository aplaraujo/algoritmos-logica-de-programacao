import * as readlineSync from 'readline-sync';  
import { Product } from './product';

console.log("Enter product data: ");
const name: string = readlineSync.question("Name: ");
const price: number = Number(readlineSync.question("Price: "));
const quantity: number = Number(readlineSync.question("Quantity in stock: "));

const product: Product = new Product(name, price, quantity);

console.log(`Product data: ${product.name}, $ ${product.price.toFixed(2)}, ${product.quantity} units, Total: $ ${product.TotalValueInStock().toFixed(2)}`);

let quantityToAdd: number = Number(readlineSync.question("Enter the number of products to be added in stock: "))
product.AddProducts(quantityToAdd);

console.log(`Updated data: ${product.name}, $ ${product.price.toFixed(2)}, ${product.quantity} units, Total: $ ${product.TotalValueInStock().toFixed(2)}`);

let quantityToRemove: number = Number(readlineSync.question("Enter the number of products to be removed from stock: "));
product.RemoveProducts(quantityToRemove);

console.log(`Updated data: ${product.name}, $ ${product.price.toFixed(2)}, ${product.quantity} units, Total: $ ${product.TotalValueInStock().toFixed(2)}`);
