package com.example.juancho.googleplaystore;

/**
 * Created by juancho on 08/05/17.
 */

public class Product {
    private String titulo;
    private int imageProduct;
    private Double starsProduct;
    private String valorGratis;

    public Product(String titulo, int imageProduct, Double starsProduct, String valorGratis) {
        this.titulo = titulo;
        this.imageProduct = imageProduct;
        this.starsProduct = starsProduct;
        this.valorGratis = valorGratis;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getImageProduct() {
        return imageProduct;
    }

    public Double getStarsProduct() {
        return starsProduct;
    }

    public String getValorGratis() {
        return valorGratis;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
