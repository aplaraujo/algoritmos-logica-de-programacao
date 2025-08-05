import {describe, expect, test} from '@jest/globals';
import {areaQuadrado, areaTriangulo, areaTrapezio} from '../src/medidas';

describe("Area quadrado, triangulo, trapezio", () => {
    test("Deve retornar 16.0000, 7.0000 e 19.5000", () => {
        const A: number = 4.0;
        const B: number = 3.5;
        const C: number = 5.2;
        const resultado1: number = areaQuadrado(A);
        const resultado2: number = areaTriangulo(A, B);
        const resultado3: number = areaTrapezio(A, B, C);
        expect(resultado1).toEqual(16.0000);
        expect(resultado2).toEqual(7.0000);
        expect(resultado3).toEqual(19.5000);
    }),
    test("Deve retornar 50.8369, 28.6983 e 90.4121", () => {
        const A: number = 7.13;
        const B: number = 8.05;
        const C: number = 11.912;
        const resultado1: number = areaQuadrado(A);
        const resultado2: number = areaTriangulo(A, B);
        const resultado3: number = areaTrapezio(A, B, C);
        expect(resultado1).toEqual(50.8369);
        expect(resultado2).toEqual(28.6983);
        expect(resultado3).toEqual(90.4121);
    })
})