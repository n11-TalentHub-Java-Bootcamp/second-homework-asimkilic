package com.asimkilic.secondhomeworkasimkilic.dto.user;

public class UserUpdateDto extends UserDto{
    private Long id;
    private String cellPhone;

    public UserUpdateDto() {
    }

    public UserUpdateDto(String firstName, String lastName, String email, Long id, String cellPhone) {
        super(firstName, lastName, email);
        this.id = id;
        this.cellPhone = cellPhone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
}
