package com.spring.entities;

/**
 * @author Ryan
 * @version $Id: Address.Java, v 0.1 2018/4/18 14:30 zy28313 Exp $
 */
public class Address {

    private String province;
    private String city;

    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Getter method for property <tt>province</tt>.
     *
     * @return property value of province
     */
    public String getProvince() {
        return province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    /**
     * Getter method for property <tt>city</tt>.
     *
     * @return property value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter method for property <tt>city</tt>.
     *
     * @param city value to be assigned to property city
     */
    public void setCity(String city) {
        this.city = city;
    }
}
