package com.coolbitx.coolwallet.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by ShihYi on 2016/2/1.
 */

public class ParsingAddress implements Serializable {
    @SerializedName("address")
    public String address;
    @SerializedName("n_tx")
    public int n_tx;
    @SerializedName("total_received")
    public long total_received;
    @SerializedName("total_sent")
    public long total_sent;
    @SerializedName("final_balance")
    public long final_balance;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getN_tx() {
        return n_tx;
    }

    public void setN_tx(int n_tx) {
        this.n_tx = n_tx;
    }

    public long getTotal_received() {
        return total_received;
    }

    public void setTotal_received(long total_received) {
        this.total_received = total_received;
    }

    public long getTotal_sent() {
        return total_sent;
    }

    public void setTotal_sent(long total_sent) {
        this.total_sent = total_sent;
    }

    public long getFinal_balance() {
        return final_balance;
    }

    public void setFinal_balance(long final_balance) {
        this.final_balance = final_balance;
    }
}
