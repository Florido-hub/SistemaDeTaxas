package application;

import entities.CarRental;
import entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");

        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm: ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.print("retorno (dd/MM/yyyy hh:mm: ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start,finish, new Vehicle(model));

        System.out.print("Entre com o preco por hora: ");
        Double pricePerHour = sc.nextDouble();


        sc.close();
    }
}