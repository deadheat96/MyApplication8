package vn.edu.csc.myapplication;

/**
 * Created by HV on 2/2/2018.
 */

public class Image {
    int id;
    String dec;

    public Image(int id, String dec) {
        this.id = id;
        this.dec = dec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }
}
