package io.mohkeita.hotelresapispring;

import io.mohkeita.hotelresapispring.models.Address;
import io.mohkeita.hotelresapispring.models.Delivery;
import io.mohkeita.hotelresapispring.models.Hotel;
import io.mohkeita.hotelresapispring.models.Menu;
import io.mohkeita.hotelresapispring.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AppHotelResapiSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AppHotelResapiSpringApplication.class, args);
    }

    @Autowired
    HotelService hotelService;

    @Override
    public void run(String... args) throws Exception {

        Address address = new Address("ABC nagar", "Banaglore", 567890, "KAR");
        Menu menu1 = new Menu("Paratha", 20);
        Menu menu2 = new Menu("Pizza", 120);
        Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1, menu2));

        Delivery del1 = new Delivery("swiggy", 120);
        Delivery del2 = new Delivery("uber", 130);
        Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(del1,del2));

        Hotel hotel1 = new Hotel("A2B", address, menuList, deliveryList);
        hotelService.addHotel(hotel1);

    }
}



















