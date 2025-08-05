export function pagamento(valor: number, hora: number): number {
    return Number((valor * hora).toFixed(2));    
}