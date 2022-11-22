package org.example;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private int productRating;
    private String productDescription;

    public Product(int productId, String productName, double productPrice, int productRating, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productRating=" + productRating +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
