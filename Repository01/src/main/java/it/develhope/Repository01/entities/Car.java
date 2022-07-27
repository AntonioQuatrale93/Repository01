package it.develhope.Repository01.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, name = "Car_model_name")
    private String modelName;
    @Column(nullable = false, name = "Serial_Number")
    private String serialnumber;
    @Column(name = "Current_car_prize")
    private double currentPrice;
}
