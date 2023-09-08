/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rolex;

/**
 *
 * @author User
 */
public class MyTime {

    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian = true;

    public MyTime(int hours, int minutes, int seconds, boolean meridian) {
        this.hours = hours > 12 ? 0 : hours;
        this.minutes = minutes >= 60 ? 0 : minutes;
        this.seconds = seconds >= 60 ? 0 : seconds;
        this.meridian = meridian;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getMeridian() {
        return meridian ? "PM" : "AM";
    }

    public void setMeridian(boolean meridian) {
        this.meridian = meridian;
    }

    public void advanceTime(int seconds) {
        for (int i = 0; i < seconds; i++) {
            tickBySecond();
        }
    }

    public void tickBySecond() {
        this.seconds++;
        if (this.seconds >= 60) {
            this.seconds = 0;
            tickByMinute();
        }
    }

    public void tickByMinute() {
        this.minutes++;
        if (this.minutes >= 60) {
            this.minutes = 0;
            tickByHour();
        }
    }

    public void tickByHour() {
        this.hours++;
        if (this.hours >= 12) {
            this.hours -= 12;
            meridian = !meridian;
        }
    }

    public void displayTime12() {
        int displayHours = (hours == 0 || hours == 12) ? 12 : hours % 12;
        System.out.printf("%02d:%02d:%02d %s\n", displayHours, minutes, seconds, getMeridian());
    }

    public void displayTime24() {
        System.out.printf("%02d:%02d:%02d\n", !meridian ? (hours % 12) : 12 + (hours % 12), minutes, seconds);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, getMeridian());
    }

}
