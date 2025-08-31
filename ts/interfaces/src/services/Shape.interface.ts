export interface IShape {
    getArea(width: number, height: number): number;
    getPerimeter(width: number, height: number): number;
    getDiagonal(width: number, height: number): number;
}