package com.alm.highfi.springsecurityauthserver.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"username", "enabled","roles"})
@ToString(of = {"username", "enabled","roles"})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name = "ref_user")
public class User {

    @Getter
    @Setter
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer user_id;

    @Getter
    @Setter
    String username;

    @Getter
    @Setter
    @JsonIgnore
    String password;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    List<Role> roles;
}
