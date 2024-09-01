package spero.app.account.savings;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import spero.app.account.Account;
import spero.app.customer.Customer;

@Entity
@Setter
@Getter
public class SavingsAccount extends Account {

    private Customer customer;

    @Override
    protected void openAccount() {

    }
}
