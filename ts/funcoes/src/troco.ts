export function obterTroco(a: number, b: number, c: number): number {
    const troco:number = c - (a * b);
    return Number(troco.toFixed(2));
}