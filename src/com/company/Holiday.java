package com.company;

public class Holiday {

    private String name;
    private int month;
    private int date;
    private String description;
    private boolean recognized;

    public Holiday(String name) 
    {
        this.name = name;
        int month;
        int date;
        String description;
        boolean recognized;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    
    public void setMonth(int month)
    {
        this.month = month;
    }
    public int getMonth()
    {
        return month;
    }
    public void setDate(int date)
    {
        this.date = date;
    }
    public int getDate()
    {
        return date;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return getDescription();
    }
    public void setRecognition(boolean recognized)
    {
        this.recognized = recognized;
    }
    public boolean getRecognition()
    {
        return recognized;
    }
    public String celebrate()
    {
        return "Splendid Unicorning!";
    }
    public boolean isToday(int today)
    {
        return month == today;
    }

}
