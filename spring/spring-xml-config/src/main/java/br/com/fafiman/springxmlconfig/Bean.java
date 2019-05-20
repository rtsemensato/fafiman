package br.com.fafiman.springxmlconfig;

import java.io.Serializable;

/**
 *
 * @author fernando
 */
public class Bean implements Serializable {

    private String name;

    public Bean() {
        name = "Fernando";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
