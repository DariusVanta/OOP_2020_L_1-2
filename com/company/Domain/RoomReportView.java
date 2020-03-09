package com.company.Domain;

public class RoomReportView {
    private int roomNumber;
    @Override
    public String toString() {
        return "RoomReportView{" +
                "roomNumber=" + roomNumber +
                ", ratingAverage=" + ratingAverage +
                '}';
    }
    private float ratingAverage;
    public RoomReportView(int roomNumber, float ratingAverage) {
        this.roomNumber = roomNumber;
        this.ratingAverage = ratingAverage;
    }
    public int getRoomNumber() {
        return roomNumber;    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;    }

    public float getRatingAverage() {
        return ratingAverage;    }

    public void setRatingAverage(float ratingAverage) {
        this.ratingAverage = ratingAverage;    }
}
