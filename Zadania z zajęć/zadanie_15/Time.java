public class Time {
    Integer hours;
    Integer minutes;

    Time(Integer hours, Integer minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time addTime(Time otherTime){
        Time temp = new Time(this.hours,this.minutes);
        temp.minutes += otherTime.minutes;
        if(temp.minutes > 59){
            temp.minutes -= 60;
            temp.hours += 1;
        }
        temp.hours += otherTime.hours;
        if(temp.hours >23) {
            temp.hours -= 24;
        }

        return temp;
    }

}
