package com.lmbibbo.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Player {
    @Id
    private Integer playerId;
    private Integer memberNumber;
    private String name;
    private IdentityCard dni;
    private Address address;
    private LocalDateTime created;
    @Indexed(unique = true)
    private String email;
    public Player(Integer playerId, Integer memberNumber, String name, IdentityCard dni, Address address,
            LocalDateTime created, String email) {
        this.playerId = playerId;
        this.memberNumber = memberNumber;
        this.name = name;
        this.dni = dni;
        this.address = address;
        this.created = created;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getCreated() {
        return created;
    }
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Integer getPlayerId() {
        return playerId;
    }
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }
    public Integer getMemberNumber() {
        return memberNumber;
    }
    public void setMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public IdentityCard getDni() {
        return dni;
    }
    public void setDni(IdentityCard dni) {
        this.dni = dni;
    }


    
}
