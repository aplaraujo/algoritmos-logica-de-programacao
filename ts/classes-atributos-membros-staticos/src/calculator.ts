export class Calculator {
    radius: number

    constructor(radius: number) {
        this.radius = radius;
    }

    public static pi: number = 3.14159;

    public static circumference(radius: number): number {
        return 2 * this.pi * radius;
    }

    public static volume(radius: number): number {
        return 4 * this.pi * Math.pow(radius, 3) / 3;
    }
}