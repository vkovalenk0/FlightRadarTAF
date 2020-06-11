package com.mentorship.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class UserDto {

    private String email;
    private String password;

    public UserDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equal(email, userDto.email) &&
                Objects.equal(password, userDto.password);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email, password);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("email", email)
                .add("password", password)
                .toString();
    }
}
