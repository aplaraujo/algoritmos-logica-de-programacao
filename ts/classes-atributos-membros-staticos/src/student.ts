export class Student {
    name: string
    grade1: number
    grade2: number
    grade3: number

    constructor(name: string, grade1: number, grade2: number, grade3: number) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    finalGrade() {
        return this.grade1 + this.grade2 + this.grade3;
    }
}