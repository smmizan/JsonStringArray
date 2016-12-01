package com.smmizan.volleyarrayrequest;

/**
 * Created by Mamun on 12/1/2016.
 */

public class Contact {



    private String Name;
    private String Email;


    public Contact(String Name, String Email) {
        this.setName(Name);
        this.setEmail(Email);
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

}
