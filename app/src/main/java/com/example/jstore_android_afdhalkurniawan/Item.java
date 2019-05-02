package com.example.jstore_android_afdhalkurniawan;

public class Item
{
    /**
     * ID dari Object Item yang dibuat
     */
    private int id;

    /**
     * Nama dari Object Item yang dibuat
     */
    private String name;


    /**
     * Harga dari Object Item yang dibuat
     */
    private int price;

    /**
     * Kategori dari Object Item yang dibuat
     */
    private String category;


    private String status;


    /**
     * Supplier dari Object Item yang dibuat
     */
    private Supplier supplier;

    /**
     * Method Item merupakan Constructor dari Item Class
     *
     * @param id         ID dari objek barang yang dibuat
     * @param name       Nama dari objek barang yang dibuat

     * @param price      Harga dari objek barang yang dibuat
     * @param category   Kategori dari objek barang yang dibuat
     * @param Supplier   Supplier dari objek barang yang dibuat
     */
    public Item(int id, String name,  int price, String category, String status, Supplier supplier)
    {
        //id=DatabaseItem.getLastItemID()+1;
        this.id=id;
        this.name=name;
        this.price=price;
        this.category=category;
        this.status=status;
        this.supplier=supplier;
    }

    /**
     * Accessor Method untuk mengambil nilai ID dari objek Item
     * @return Nilai ID dari Item Object
     */
    public int getId(){
        return id;
    }

    /**
     * Accessor Method untuk mengambil String Nama dari objek Item
     * @return String Nama dari Item Object
     */
    public String getName(){
        return name;
    }



    /**
     * Accessor Method untuk mengambil nilai Price dari objek Item
     * @return Nilai Price dari Item Object
     */
    public int getPrice(){
        return price;
    }

    /**
     * Accessor Method untuk mengambil String Category dari objek Item
     * @return String Category dari Item Object
     */
    public String getCategory(){
        return category;
    }


    public String getStatus(){
        return status;
    }



    /**
     * Accessor Method untuk mengambil Supplier dari objek Item
     * @return Supplier dari Item Object
     */
    public Supplier getSupplier(){
        return supplier;
    }

    /**
     * Mutator Method untuk mengubah ID dari objek Item
     * @param id Nilai ID yang diinginkan
     */
    public void setId(int id){
        this.id=id;
    }

    /**
     * Mutator Method untuk mengubah Name dari objek Item
     * @param name String Name yang diinginkan
     */
    public void setName(String name){
        this.name=name;
    }



    /**
     * Mutator Method untuk mengubah Price dari objek Item
     * @param price Nilai Price yang diinginkan
     */
    public void setPrice(int price){
        this.price=price;
    }

    /**
     * Mutator Method untuk mengubah Category dari objek Item
     * @param category String Category yang diinginkan
     */
    public void setCategory(String category){
        this.category=category;
    }


    public void setStatus(String status){
        this.status=status;
    }


    /**
     * Mutator Method untuk mengubah Supplier dari objek Item
     * @param supplier Supplier yang diinginkan
     */
    public void setSupplier(Supplier supplier){
        this.supplier=supplier;
    }

    /**
     * Sebuah Method untuk melakukan Print Data dari Object Item (name)
     */

    public String toString()
    {
        return "==========ITEM======="+
                "\nID :" + id+
                "\nName :"  + name+
                //"\nStok :" + stock+
                "\nKategori :" + category+
                "\nStatus :" + status;
//        "\nSupplier :" + supplier.getName();
    }

    public void printData(){
        //System.out.println("==========ITEM==========");
        //System.out.println("ID: " + this.id);
        //System.out.println("Name: " + this.name);
        //System.out.println("Stock: " + this.stock);
        //System.out.println("Category: " + this.category);
        //System.out.println("Status: " + this.status);
        //System.out.println("Supplier: " + supplier.getName());

    }


}

