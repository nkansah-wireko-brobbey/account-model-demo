package spero.app.account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@MappedSuperclass
public abstract class Account {
    @Id
    @GeneratedValue
    private Integer accountId;

    private Double balance;

    protected abstract void openAccount();
}
