package com.alm.highfi.springsecurityauthserver.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"name"})
@ToString(of = {"name"})
@Entity(name = "ref_role")
public class Role {

    @Getter
    @Setter
    @Id
    @GeneratedValue
    Integer id;

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    List<User> users;

    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
