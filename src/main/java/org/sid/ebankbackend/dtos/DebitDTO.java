package org.sid.ebankbackend.dtos;

import lombok.Data;
@Data
public class DebitDTO {

    private String accountId;
    private double amount;
    private String description;
}
