package edu.moranrvcu.onevote;

/**
 * Created by phambd on 11/7/15.
 */
public class VoterInfo {
    private String fName;
    private String lName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String birth;
    private String tNumber;

    public VoterInfo(){
        this.fName = "";
        this.lName = "";
        this.address = "";
        this.city = "";
        this.state = "";
        this.zip = "";
        this.birth = "";
        this.tNumber = "";
    }


    public VoterInfo(String fName, String lName, String address, String city, String state, String zip, String birth, String tNumber) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.birth = birth;
        this.tNumber = tNumber;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getBirth() {
        return birth;
    }

    public String gettNumber() {
        return tNumber;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void settNumber(String tNumber) {
        this.tNumber = tNumber;
    }
}
