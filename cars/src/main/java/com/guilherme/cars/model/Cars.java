package com.guilherme.cars.model;

public class Cars {

        private String title;
        private String brand;

    @Override
    public String toString() {
        return "Cars{" +
                "title='" + title + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", age=" + age +
                '}';
    }

    private String price;
        private int age;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
