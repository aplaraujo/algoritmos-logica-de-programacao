// Classe
export class Triangle {
    a: number
    b: number
    c: number
    // Função construtora
    constructor(a: number, b: number, c: number) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // Método
    area() {
        const p: number = (this.a + this.b + this.c) / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c)); 
    }
}
