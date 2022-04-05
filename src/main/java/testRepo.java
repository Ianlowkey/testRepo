public class testRepo {

    private String firstName, lastName;
    private int cellPhone, housePhone;

    public testRepo() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public int getHousePhone() {
        return housePhone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setHousePhone(int housePhone) {
        this.housePhone = housePhone;
    }

    @Override
    public String toString() {
        return "testRepo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cellPhone=" + cellPhone +
                ", housePhone=" + housePhone +
                '}';
    }
}
