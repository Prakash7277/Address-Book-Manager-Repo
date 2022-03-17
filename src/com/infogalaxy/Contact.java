package com.infogalaxy;

public class Contact {
    private String fistName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String  mobNo;
    private String email;
    private String zip;

    public void setFistName(String fistName){
        this.fistName = fistName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setMobNo(String mobNo){
        this.mobNo = mobNo;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCity(String  city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
    public String getFistName(){
        return this.fistName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getMobNo(){
        return this.mobNo;
    }
    public String getAddress(){
        return this.address;
    }
    public String getCity(){
        return this.city;
    }
    public String getState(){
        return this.state;
    }
    public String getEmail(){
        return this.email;
    }
    public String getZip(){
        return  this.zip;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
