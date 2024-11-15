package net.mohamed.demospringang.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString @Builder
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private LocalDate date;
    private double amount ;
    private PaymentType type ;
    private PaymentStatus status ;
    private String file;
    @ManyToOne
    private Student student ;
}