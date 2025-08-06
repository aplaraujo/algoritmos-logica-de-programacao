import * as readlineSync from 'readline-sync';  
import { Product } from './entities/Product.entity';

console.log("Enter product data:");

const name: string = readlineSync.question("Name: ");
const price: number = Number(readlineSync.question("Price: "));
const quantity: number = Number(readlineSync.question("Quantity in stock: "));

const product: Product = new Product(name, price, quantity);

console.log(`Product data: ${product.getName}, $ ${product.getPrice}, ${product.getQuantity} units, Total: $ ${product.totalValueInStock().toFixed(2)}`);

const quantityToAdd: number = Number(readlineSync.question("Enter the number of products to be added in stock: "));
product.addProducts(quantityToAdd);

console.log(`Updated data: ${product.getName}, $ ${product.getPrice}, ${product.getQuantity} units, Total: $ ${product.totalValueInStock().toFixed(2)}`);

const quantityToRemove: number = Number(readlineSync.question("Enter the number of products to be removed from stock: "));
product.removeProducts(quantityToRemove);

console.log(`Updated data: ${product.getName}, $ ${product.getPrice}, ${product.getQuantity} units, Total: $ ${product.totalValueInStock().toFixed(2)}`);