package Stock.Portfolio.manager.SPM;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity // Marks this class as a database table
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id;

    private String username; // Column for username
    private String email;    // Column for email

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) // Defines the one-to-many relationship
    private List<Stock> stocks = new ArrayList<>();

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}