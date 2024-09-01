package spero.app.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Customer {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private List<String> phone;



}
