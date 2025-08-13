package services;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
    }

    public void processInvoice(CarRental carRental){
        carRental.setInvoice(new Invoice());
    }
}
