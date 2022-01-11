package com.sample.google_cloud_run_demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class Users{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    @NotNull
    @Column(name = "id")
    private Long id;

    @JsonProperty
    @NotNull
    @Column(name = "userName")
    private String userName;

    public String getUserName() {
        return this.userName;
    }
}
