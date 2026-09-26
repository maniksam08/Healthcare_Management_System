package com.example.Pratham.HealthManage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jspecify.annotations.Nullable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestDto {

    private String username;
    private String password;

    public @Nullable Object getUsername() {
        return username;
    }

    public @Nullable Object getPassword() {
        return password;
    }
}
