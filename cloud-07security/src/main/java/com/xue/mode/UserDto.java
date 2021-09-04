package com.xue.mode;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;
}
