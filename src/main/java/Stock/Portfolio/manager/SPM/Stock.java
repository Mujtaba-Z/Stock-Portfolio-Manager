package Stock.Portfolio.manager.SPM;

import jakarta.persistence.*;

@Entity // Marks this class as a database table
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id;

    private String symbol;       // Stock symbol (e.g., "AAPL")
    private Double quantity;     // Number of shares owned
    private Double purchasePrice; // Purchase price per share

    @ManyToOne // Defines the many-to-one relationship
    @JoinColumn(name = "user_id") // Foreign key column to the User table
    private User user;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
