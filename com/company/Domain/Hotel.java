package com.company.Domain;

import java.util.Objects;

public class Hotel {

    private int id, personNumber, roomNumber, dayNumber;
    private double rating;
    private boolean leftRoom;
    private String feedback;

    public Hotel(int id, int personNumber, int roomNumber, int dayNumber) {
        this.id = id;
        this.personNumber = personNumber;
        this.roomNumber = roomNumber;
        this.dayNumber = dayNumber;
        boolean leftRoom = false;
    }
    public Hotel(int id, int personNumber, int roomNumber, int dayNumber, boolean leftRoom, String feedback, double rating) {
        this.id = id;
        this.personNumber = personNumber;
        this.roomNumber = roomNumber;
        this.dayNumber = dayNumber;
        this.leftRoom = leftRoom;
        this.feedback = feedback;
        this.rating = rating;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPersonNumber() {
        return personNumber;
    }
    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isLeftRoom() {
        return leftRoom;
    }

    public void setLeftRoom(boolean leftRoom) {
        this.leftRoom = leftRoom;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public boolean isEmpty() { return false; }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", personNumber=" + personNumber +
                ", roomNumber=" + roomNumber +
                ", dayNumber=" + dayNumber +
                ", rating=" + rating +
                ", isleftRoom=" + leftRoom +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
