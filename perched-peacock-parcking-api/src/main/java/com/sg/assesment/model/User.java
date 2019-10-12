package com.sg.assesment.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
@Entity
public class User {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private long ID;
        @Column(name = "first_name")
        private String firstName;
        @Column(name = "last_name")
        private String lastName;
        @Column(name= "user_name")
        private String username;
    @Column()
    @JsonIgnore
    private String password;
    @Column(name = "vehicle_number")
    private String vehicleNumber;
    @Column
    private String vehicleType;
    @Column(name = "contact_number")
    private String contactNumber;
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


}
