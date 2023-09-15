package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class FeLog {
    private String dept;
    private String g;
    private String s;
    private String trf;
    private String tpt;
    private double sps;

    @JsonProperty("dept")
    public String getDept() { return dept; }
    @JsonProperty("dept")
    public void setDept(String value) { this.dept = value; }

    @JsonProperty("g")
    public String getG() { return g; }
    @JsonProperty("g")
    public void setG(String value) { this.g = value; }

    @JsonProperty("s")
    public String getS() { return s; }
    @JsonProperty("s")
    public void setS(String value) { this.s = value; }

    @JsonProperty("trf")
    public String getTrf() { return trf; }
    @JsonProperty("trf")
    public void setTrf(String value) { this.trf = value; }

    @JsonProperty("tpt")
    public String getTpt() { return tpt; }
    @JsonProperty("tpt")
    public void setTpt(String value) { this.tpt = value; }

    @JsonProperty("sps")
    public double getSps() { return sps; }
    @JsonProperty("sps")
    public void setSps(double value) { this.sps = value; }
}
