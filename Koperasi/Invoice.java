package Koperasi;

import java.text.DecimalFormat;

public class Invoice implements IPayable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice() {

    }
    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    public int getPricePerItem() {
        return pricePerItem;
    }
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }
    public String toString() {
        DecimalFormat harga = new DecimalFormat("#,###");
        String formattedHarga = harga.format(getPayableAmount());
        return getQuantity() + " buah " + getProductName() + "\t Rp " + formattedHarga; 
    }
}
