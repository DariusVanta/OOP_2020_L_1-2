package com.company.Domain;

public class HotelValidator {

    public void validate(Hotel hotel) {

        String errors = "";

        if (hotel.getDayNumber() <= 0) {
            throw new RuntimeException("The day number need to be positive!");
        }

        if (!hotel.isLeftRoom() && hotel.getRating() < 1 || hotel.getRating() > 5) {
            throw new RuntimeException("The rating can be between 1 and 5!");
        }

        if (hotel.getPersonNumber() <= 0){
            throw new RuntimeException("The number of persons cannot be 0 or negative!");

        }
    }
}
