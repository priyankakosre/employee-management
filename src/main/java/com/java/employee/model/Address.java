package com.java.employee.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Address {
    private String streetName;
    private String buildingNumber;
    private String pinCode;

}
