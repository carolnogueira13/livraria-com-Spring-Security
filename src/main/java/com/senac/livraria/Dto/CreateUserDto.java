package com.senac.livraria.Dto;

import com.senac.livraria.Enums.RoleName;

public record CreateUserDto(

        String email,
        String password,
        RoleName role

) {
}
