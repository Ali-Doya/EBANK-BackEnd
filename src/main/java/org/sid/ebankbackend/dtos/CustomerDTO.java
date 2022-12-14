package org.sid.ebankbackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ebankbackend.entities.BankAccount;

import javax.persistence.*;
import java.util.List;

@Data
public class CustomerDTO {

    private Long id;
    private String name;
    private String email;
}
