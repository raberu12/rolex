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
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
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

    public String isMeridian() {
        return meridian ? "PM" : "AM";
    }

    public void setMeridian(boolean meridian) {
        this.meridian = meridian;
    }

    public void advanceTime(int seconds) {

    }

    public void tickBySecond() {
        
        if(seconds > 59){
            seconds -= 60;
            minutes += 1;
        }else{
            seconds++;
        }
        
    }

    public void tickbyMinute() {

    }

    public void tickbyHour() {

    }

    public void displayTime12() {
        System.out.printf("%02d:%02d:%02d %s\n", hours, minutes, seconds, isMeridian());
    }

    public void displayTime24() {
        if(hours > 11){
            hours = 0;
            System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
        }else{
            System.out.printf("%02d:%02d:%02d\n", hours + 12, minutes, seconds);
        }
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
