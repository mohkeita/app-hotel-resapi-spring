package io.mohkeita.hotelresapispring.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Delivery {
    @Id
    @GeneratedValue(generator = "del_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "del_id", sequenceName = "delivery_id")
    private Integer deliveryId;
    private String partnerName;
    private double charges;
    @ManyToMany(mappedBy = "delivery")
    private Set<Hotel> hotelList = new HashSet<>();

    public Delivery(String partnerName, double charges) {
        super();
        this.partnerName = partnerName;
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "partnerName='" + partnerName + '\'' +
                ", charges=" + charges +
                '}';
    }
}
