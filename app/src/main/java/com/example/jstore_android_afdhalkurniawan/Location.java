package com.example.jstore_android_afdhalkurniawan;


public class Location
{
    /**
     * Provinsi dari Object Location yang dibuat
     */
    private String province;

    /**
     * Deskripsi dari Object Location yang dibuat
     */
    private String description;

    /**
     * Kota dari Object Location yang dibuat
     */
    private String city;

    /**
     * Method Location merupakan Constructor dari Location Class
     *
     * @param province       Provinsi dari objek location yang dibuat
     * @param description    Deskripsi dari objek location yang dibuat
     * @param city           Kota dari objek location yang dibuat
     */
    public Location(String province,   String description,
                    String city)
    {
        // initialise instance variables
        this.province=province;
        this.description=description;
        this.city=city;
    }

    /**
     * Accessor Method untuk mengambil String Province dari objek Location
     * @return String Province dari Location Object
     */
    public String getProvince(){
        return province;
    }

    /**
     * Accessor Method untuk mengambil String City dari objek Location
     * @return String City dari Location Object
     */
    public String getCity(){
        return city;
    }

    /**
     * Accessor Method untuk mengambil String Description dari objek Location
     * @return String Description dari Location Object
     */
    public String getDescription(){
        return description;
    }

    /**
     * Mutator Method untuk mengubah Name dari objek Location
     * @param province String Province yang diinginkan
     */
    public void setProvince(String province){
        this.province=province;
    }

    /**
     * Mutator Method untuk mengubah Name dari objek Location
     * @param city String City yang diinginkan
     */
    public void setCity(String city){
        this.city=city;
    }

    /**
     * Mutator Method untuk mengubah Name dari objek Location
     * @param description String Description yang diinginkan
     */
    public void setDescription(String description){
        this.description=description;
    }

    /**
     * Sebuah Method untuk melakukan Print Data dari Object Location (province)
     */

    public String toString()
    {
        return "========LOCATION========"+
                "\nprovinsi:"+province+
                "\nkota:"+city+
                "\ndeskripsi:"+description;
    }
    public void printData(){
        System.out.println("==========LOCATION=======");
        System.out.println("Provinsi :" + this.province);
        System.out.println("Kota :" + this.city);
        System.out.println("Deksripsi :" + this.description);
    }


}



