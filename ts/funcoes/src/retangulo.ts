export function area(base: number, altura: number): number {
    const calcArea:number = base * altura;
    return Number(calcArea.toFixed(4));
}

export function perimetro(base: number, altura: number): number {
    const calcPerimetro : number = 2 * (base + altura);
    return Number(calcPerimetro.toFixed(4));
}

export function diagonal(base: number, altura: number): number {
    const calcDiagonal:number = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    return Number(calcDiagonal.toFixed(4));
}