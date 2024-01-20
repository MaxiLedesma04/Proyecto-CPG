package com.CLUBPG.SocialNetworking.dtos;

public class UsuarioDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String educacion;
    private String fotoPerfil;

    public UsuarioDTO(Long id, String username, String password, String email, String educacion, String fotoPerfil) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.educacion = educacion;
        this.fotoPerfil = fotoPerfil;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getEducacion() {
        return educacion;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }
}
