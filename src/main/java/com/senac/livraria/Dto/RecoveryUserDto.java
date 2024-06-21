package com.senac.livraria.Dto;

import java.util.List;

import com.senac.livraria.entity.Role;

public record RecoveryUserDto(

        Long id,
        String email,
        List<Role> roles

) {
}
