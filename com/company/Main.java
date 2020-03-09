package com.company;
import com.company.Domain.HotelValidator;
import com.company.Repository.HotelRepository;
import com.company.Service.HotelService;
import com.company.UI.Console;
public class Main {
    public static void main(String[] args) {
        HotelValidator hotelValidator = new HotelValidator();
        HotelRepository hotelRepository = new HotelRepository(hotelValidator);
        HotelService hotelService = new HotelService(hotelRepository);
        Console console = new Console(hotelService);
        console.run();    }}
