package com.asimkilic.secondhomeworkasimkilic.dto.user;

public class UserRegisterDto extends UserDto{

    private String username;
    private String cellPhone;

    public UserRegisterDto() {
    }

    public UserRegisterDto(String firstName, String lastName, String email, String username, String cellPhone) {
        super(firstName, lastName, email);
        this.username = username;
        this.cellPhone = cellPhone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

}
