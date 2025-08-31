export class Value {
    private val1: number;
    private val2: number;

    constructor(val1: number, val2: number) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public getVal1() {
        return this.val1;
    }

    public setVal1(val1: number) {
        this.val1 = val1;
    }

    public getVal2() {
        return this.val2;
    }

    public setVal2(val2: number) {
        this.val2 = val2;
    }

    public getSum(): number {
        return this.val1 + this.val2;
    }
}