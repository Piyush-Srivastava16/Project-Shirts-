import java.util.*;
public class Shirt {
    String brand , color;
    double price;
    int size;

    Shirt(){

    }
     Shirt(String brand , String color , double price, int  size ){
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.size=size;
    }
    
    public String toString (){
        return "Shirts [brand ="+brand+"\tcolor is "+color +"\tprice"+price+"\tSize is "+size+"]";
    }
}

