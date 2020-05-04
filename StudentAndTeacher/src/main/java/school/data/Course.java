package school.data;

import school.services.PublicHolidayService;

import java.time.DayOfWeek;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.List;

public class Course {

    public String courseName;
    public Integer courseEAP;
    public ZonedDateTime courseStartDate;
    public ZonedDateTime courseEndDate;
    public Teacher teacher;

    private PublicHolidayService publicHolidayService = new PublicHolidayService();


    public Course(ZonedDateTime courseStartDate, ZonedDateTime courseEndDate) {
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
    }

    public Course() {

    }

    public String getCourseName() {
        return courseName;
    }

    public Integer getCourseEAP() {
        return courseEAP;
    }

    public ZonedDateTime getCourseStartDate() {
        return courseStartDate;
    }

    public ZonedDateTime getCourseEndDate() {
        return courseEndDate;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseEAP=" + courseEAP +
                ", courseStartDate=" + courseStartDate +
                ", courseEndDate=" + courseEndDate +
                '}';
    }

    public long getNumberOfWorkDays() {
        if (courseEndDate.isAfter(courseStartDate) && courseEndDate.getYear() == courseStartDate.getYear()) {

            ZonedDateTime date = courseStartDate;
            long result = 0;
            String yearString = String.valueOf(courseStartDate.getYear());
            List<ZonedDateTime> publicHolidays = publicHolidayService.getPublicHolidays(yearString);

            Period period = Period.parse("P1D");
            while (date.isBefore(courseEndDate) || date.isEqual(courseEndDate)) {

                System.out.println(date);
                date = date.plus(period);

                if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY && !publicHolidays.contains(date)) {
                    result += 1;
                }
            }
            return result;

        } else {
            throw new IllegalArgumentException("wtf");
        }
    }

}

//            final int startW = courseStartDate.getDayOfWeek().getValue();
//            final int startW2 = courseStartDate.getMonthValue();
//            final int endW = courseEndDate.getDayOfWeek().getValue();
//            final int endW2 = courseEndDate.getMonthValue();



//            final long days = ChronoUnit.DAYS.between(courseStartDate, courseEndDate) +1;
//            long result = days - 2*(days/7);



//            if (courseStartDate.getDayOfWeek() == DayOfWeek.SATURDAY || courseEndDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
//                result = days - 1*(days/7);
//            } if (courseStartDate.getDayOfWeek() == DayOfWeek.SUNDAY || courseEndDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
//                result = days - 2*(days/7);
//            }


//            if (days % 7 != 0) {
//                if(startW2 == 2 && startW == 24) {
//                    result -= 1;
//                } else if(endW2 == 2 && endW2 == 24) {
//                    result -= 1;
//                }
//            }

//            if (days % 7 != 0) {
//                if (startW == 7) {
//                    result -= 1;
//                } else if (endW == 7) {
//                    result -= 1;
//                } else if (endW < startW) {
//                    result -= 2;
//                }
//            }


            //return result;