package com.sasini.hobby_app.Modal;

public class Data {

    private String name;
    private  String description;
    private String id;
    private  String date;
    private  String mobilenum;
    private  String homenum;
    private  String hobby1;
    private  String hobby2;

    public  Data()
    {}

    public Data(String name, String description, String id, String date,String mobilenum,
                String homenum,String hobbyone,String hobbytwo) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.date = date;
        this.mobilenum = mobilenum;
        this.homenum = homenum;
        this.hobby1 = hobbyone;
        this.hobby2 = hobbytwo;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }
    public String getMobilenum() {
        return mobilenum;
    }
    public String getHomenum() {
        return homenum;
    }

    public void setHomenum(String homenum) {
        this.homenum = homenum;
    }

    public String getHobby1() {
        return hobby1;
    }

    public void setHobby1(String hobby1) {
        this.hobby1 = hobby1;
    }

    public String getHobby2() {
        return hobby2;
    }

    public void setHobby2(String hobby2) {
        this.hobby2 = hobby2;
    }
    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(String data) {
        this.date = date;
    }
}
