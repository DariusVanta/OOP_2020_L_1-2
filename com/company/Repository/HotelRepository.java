package com.company.Repository;
import com.company.Domain.Hotel;
import com.company.Domain.HotelValidator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class HotelRepository {
    private Map<Integer, Hotel> hotels = new HashMap<>();
    private HotelValidator validator;

    public HotelRepository(HotelValidator validator) {
        this.validator = validator;
    }

    public void add(Hotel hotel) {
        if (hotels.containsKey(hotel.getId())) {
            throw new RuntimeException("The registry number with that ID already exists!");        }
        validator.validate(hotel);
        hotels.put(hotel.getId(), hotel);
    }
    public List<Hotel> getAll() {
        return new ArrayList<>(hotels.values());    }

    public void update(Hotel hotel)  {
        if (!hotels.containsKey(hotel.getId())) {
            throw new RuntimeException("The entry ID does not exist!");
        }
        validator.validate(hotel);
        hotels.put(hotel.getId(), hotel);   }
}
