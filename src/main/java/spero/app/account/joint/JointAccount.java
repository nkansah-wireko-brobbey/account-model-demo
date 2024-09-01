package spero.app.account.joint;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import spero.app.account.Account;
import spero.app.customer.Customer;

import java.util.List;

@Entity
@Setter
@Getter
public class JointAccount extends Account {

    private List<Customer> customerList;

    @Override
    protected void openAccount() {

    }
}
