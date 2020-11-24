package gmibank.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
<<<<<<< HEAD
@JsonIgnoreProperties(ignoreUnknown = true)

public class States {
=======

@JsonIgnoreProperties(ignoreUnknown = true)
public class States {
    private int id;
    private String name;
>>>>>>> api

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

<<<<<<< HEAD
    private int id;

=======
>>>>>>> api
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    private String name;

=======
>>>>>>> api
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    private Country country;
<<<<<<< HEAD


}
=======
}
>>>>>>> api
