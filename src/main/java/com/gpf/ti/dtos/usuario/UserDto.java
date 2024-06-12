package com.gpf.ti.dtos.usuario;

import com.gpf.ti.enums.GeneroType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record UserDto(
        @NotNull String login,
        @NotNull String senha,
        @NotNull Boolean admin,
        @NotNull String nomeCompleto,
        @NotNull LocalDate dataNascimento,
        @NotNull GeneroType genero,
        @NotNull String telefone
) {}
