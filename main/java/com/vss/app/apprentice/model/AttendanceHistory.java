package com.vss.app.apprentice.model;

public class AttendanceHistory {

    private String monthAndYear;
    private String totalLeave;
    private String leaveTaken;
    private String availableLeave;

    public AttendanceHistory(String monthAndYear, String totalLeave, String leaveTaken, String availableLeave) {
        this.monthAndYear = monthAndYear;
        this.totalLeave = totalLeave;
        this.leaveTaken = leaveTaken;
        this.availableLeave = availableLeave;
    }

    public String getMonthAndYear() {
        return monthAndYear;
    }

    public String getTotalLeave() {
        return totalLeave;
    }

    public String getLeaveTaken() {
        return leaveTaken;
    }

    public String getAvailableLeave() {
        return availableLeave;
    }
}
