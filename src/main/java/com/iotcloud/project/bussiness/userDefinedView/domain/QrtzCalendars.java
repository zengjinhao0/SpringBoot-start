package com.iotcloud.project.bussiness.userDefinedView.domain;

public class QrtzCalendars {
    private String schedName;

    private String calendarName;

    private byte[] calendar;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName == null ? null : schedName.trim();
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName == null ? null : calendarName.trim();
    }

    public byte[] getCalendar() {
        return calendar;
    }

    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }
}