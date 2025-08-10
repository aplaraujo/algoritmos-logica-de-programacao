import * as readlineSync from 'readline-sync';  
import { Product } from './entities/Product.entity';
import { ImportedProduct } from './entities/ImportedProduct.entity';
import { UsedProduct } from './entities/UsedProduct';

function formatDateToDDMMYYYY(date: Date): string {
    return date.toLocaleDateString('pt-BR');
}
const N: number = Number(readlineSync.question("Enter the number of products: "));
const products: Product[] = [];

for (let i = 1; i <= N; i++) {
    console.log(`Product #${i} data:`);
    const response: string = readlineSync.question("Common, used or imported (c/u/i)? ");
    const name: string = readlineSync.question("Name: ");
    const price: number = Number(readlineSync.question("Price: "));
    
    if (response === 'i') {
        const customsFee: number = Number(readlineSync.question("Customs fee: "));
        const product: ImportedProduct = new ImportedProduct(name, price, customsFee);
        products.push(product);
    } else if (response === 'u') {
        const manufactureDate: Date = new Date(readlineSync.question("Manufacture date (DD/MM/YYYY): "));
        const product = new UsedProduct(name, price, manufactureDate);
        products.push(product);
    } else {
        const product: Product = new Product(name, price);
        products.push(product);
    }
}

console.log("\nPRICE TAGS:");
const productsResult = products.map(prod => ({
  name: prod.getName,
  price: prod.priceTag()
}));

productsResult.forEach(prod => {
  console.log(`${prod.name} - $ ${prod.price.toFixed(2)}`);
});