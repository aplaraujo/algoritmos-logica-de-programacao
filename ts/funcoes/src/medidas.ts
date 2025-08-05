export function areaQuadrado(a: number): number {
    return Number((a * a).toFixed(4));
}

export function areaTriangulo(a: number, b: number): number {
    return Number(((a * b) / 2).toFixed(4));    
}

export function areaTrapezio(a: number, b: number, c: number): number {
    return Number((((a + b) * c) / 2).toFixed(4));
}