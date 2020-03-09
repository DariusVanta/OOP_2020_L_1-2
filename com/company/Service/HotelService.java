package com.company.Service;


import com.company.Domain.Hotel;
import com.company.Domain.RoomReportView;
import com.company.Repository.HotelRepository;

import java.util.*;

public class HotelService {

    private HotelRepository repo;

    public HotelService(HotelRepository repo) {
        this.repo = repo;
    }

    public void enterHotel(int id, int personNumber, int roomNumber, int dayNumber) {

        Hotel hotel = new Hotel (id, personNumber, roomNumber, dayNumber);
        List<Hotel> rooms = repo.getAll();
        for (Hotel c : rooms) {
            if (c.getRoomNumber() == roomNumber && !c.isLeftRoom()) {
                throw new RuntimeException("That room is already taken by another guess!");
            }
        }
        repo.add(hotel);
    }

    public void leaveRoom(int roomNumber, String feedback, double rating) {

        Hotel roomNumber1 = null;
        List<Hotel> hotels = repo.getAll();
        for (Hotel hotel : hotels) {
            if (hotel.getRoomNumber() == roomNumber && !hotel.isLeftRoom()) {
                roomNumber1 = hotel;
            }
        }
        if (roomNumber1 != null) {
            roomNumber1.setFeedback(feedback);
            roomNumber1.setRating(rating);
            roomNumber1.setLeftRoom(true);
            repo.update(roomNumber1);
        }
        else {
            throw new RuntimeException("There is no room with the given number");
        }
    }

    public List<Hotel> getAll(){
        return repo.getAll();
    }

    public List<RoomReportView> getRoomNumber() {

        List<RoomReportView> results = new ArrayList<>();

        Map<Integer, List<Double>> roomRatings = new HashMap<>();

        for (Hotel c : repo.getAll()) {
            if (c.isLeftRoom()) {
                int room = c.getRoomNumber();
                double rating = c.getRating();

                if (!roomRatings.containsKey(room)) {
                    roomRatings.put(room, new ArrayList<>());
                }

                roomRatings.get(room).add(rating);

            }
        }

        for (Integer no : roomRatings.keySet()) {
            List<Double> ratings = roomRatings.get(no);
            float average = 0;
            for (double r : ratings) {
                average += r;
            }
            average /= ratings.size();
            results.add(new RoomReportView(no, average));
        }

        results.sort((r1, r2) -> {
            if (r1.getRatingAverage() > r2.getRatingAverage())
                return -1;
            else if (r1.getRatingAverage() == r2.getRatingAverage())
                return 0;
            else
                return 1;
        });

        return results;
    }

}
