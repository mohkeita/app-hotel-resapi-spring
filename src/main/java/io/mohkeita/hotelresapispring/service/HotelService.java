package io.mohkeita.hotelresapispring.service;

import io.mohkeita.hotelresapispring.models.Hotel;

import java.util.List;

public interface HotelService {

    void addHotel(Hotel hotel);
    void updateHotel(Hotel hotel);
    Hotel getHotelById(int hotelId);
    void deleteHotel(int hotelId);

    List<Hotel> getHotelsByCity(String city);
    List<Hotel> getHotelsByMenu(String menuName);
    List<Hotel> getHotelsByDelivery(String partnerName);
    List<Hotel> getHotelsByLocation(String location);
    List<Hotel> getHotelsByLocationAndMenu(String location, String menuName);
}
