import { Invoice } from "./Invoice.entity";
import { Vehicle } from "./Vehicle.entity";

export class CarRental {
    private start: Date;
    private finish: Date;
    private vehicle: Vehicle;
    private invoice: Invoice;

    constructor(start: Date, finish: Date, vehicle: Vehicle, invoice: Invoice) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        this.invoice = invoice;
    }

    public getStart(): Date {
        return this.start;
    }

    public setStart(start: Date): void {
        this.start = start;
    }

    public getFinish(): Date {
        return this.finish;
    }

    public setFinish(finish: Date): void {
        this.finish = finish;
    }

    public getVehicle(): Vehicle {
        return this.vehicle;
    }

    public setVehicle(vehicle: Vehicle): void {
        this.vehicle = vehicle;
    }

    public getInvoice(): Invoice {
        return this.invoice;
    }

    public setInvoice(invoice: Invoice): void {
        this.invoice = invoice;
    }
}