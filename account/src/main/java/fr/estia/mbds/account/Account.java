package fr.estia.mbds.account;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Currency;
import java.util.Date;

@Entity
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    @Id
    private String id;
    private Double balance;
    @CreationTimestamp
    private LocalDate dateCreated;
    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;
    @Transient
    private Customer customer;
    private Long customerId;
}
