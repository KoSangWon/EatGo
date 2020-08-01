package kr.co.kswspring.eatgo.domain;

public class Restaurant {
    private final String name;
    private final String address;
    private final Long id;
//
//    public Restaurant(String name) {
//        this.name = name;
//    }

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return name + " in " + address;
    }

    public String getAddress() {
        return address;
    }

    public Long getId() {
        return id;
    }
}
