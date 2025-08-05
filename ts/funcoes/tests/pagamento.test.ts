import {describe, expect, test} from '@jest/globals';
import { pagamento } from '../src/pagamento';

describe("Pagamento", () => {
    test("Deve retornar 3000.00", () => {
        const valorHora: number = 50.00;
        const horas: number = 60;
        const resultado: number = pagamento(valorHora, horas);
        expect(resultado).toEqual(3000.00);
    }),
    test("Deve retornar 6000.00", () => {
        const valorHora: number = 60.00;
        const horas: number = 100;
        const resultado: number = pagamento(valorHora, horas);
        expect(resultado).toEqual(6000.00);
    })
})