package fr.hillsongcoding.encounter18.utilitaires;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Item {

    private String productName;
    private String maker;
    private Drawable productImg;
    private String price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public Drawable getProductImg() {
        return productImg;
    }

    public void setProductImg(Drawable productImg) {
        this.productImg = productImg;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
