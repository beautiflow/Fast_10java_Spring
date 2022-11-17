package Part_02_Object_Oriented_Programming.Chapter_02.ch10;

public class BirthDay {

    private int day;
    private int month;
    private int year;

    private boolean isVaild;

    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if( month <1 || month > 12){
            isVaild = false;
        }
        else {
            isVaild = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate(){
        if(isVaild){
            System.out.println( year + "년 " + month + "월 " + day + "일 입니다.");
        }
        else{
            System.out.println("유효하지 않은 날짜 입니다.");
        }
    }

    public boolean getIsVaild(){
        return isVaild;
    }
}
