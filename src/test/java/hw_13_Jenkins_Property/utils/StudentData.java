package hw_13_Jenkins_Property.utils;

public class StudentData {

    private String firstName;
    private String lastName;
    private String userEmail;
    private String gender;
    private String userPhone;
    private String hobby;
    private String subject;
    private String day;
    private String month;
    private String year;
    private String filePath;
    private String address;
    private String state;
    private String city;

    public StudentData thisFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentData thisLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentData thisUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public StudentData thisGender(String gender) {
        this.gender = gender;
        return this;
    }

    public StudentData thisUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    public StudentData thisHobby(String hobby) {
        this.hobby = hobby;
        return this;
    }

    public StudentData thisSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public StudentData thisDay(String day) {
        this.day = day;
        return this;
    }

    public StudentData thisMonth(String month) {
        this.month = month;
        return this;
    }

    public StudentData thisYear(String year) {
        this.year = year;
        return this;
    }

    public StudentData thisFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public StudentData thisAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentData thisState(String state) {
        this.state = state;
        return this;
    }

    public StudentData thisCity(String city) {
        this.city = city;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getGender() {
        return gender;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getHobby() {
        return hobby;
    }

    public String getSubject() {
        return subject;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }


}
