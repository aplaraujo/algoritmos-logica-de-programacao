import { TaxService } from "./TaxService.interface";

export class Rental {
    private pricePerHour: number;
    private pricePerDay: number;
    private taxService: TaxService;

    constructor(pricePerHour: number, pricePerDay: number, taxService: TaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    
}