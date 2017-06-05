/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author user
 */
@ManagedBean( name = "code")
@SessionScoped
public class Code{

    
    private String code;
    private String error;
    private double LQ = 0.0;
    private double L = 0.0;
    private double W = 0.0;
    private double WQ = 0.0;
    private double usage = 0.0;
    private boolean showL, showLQ, showW, showWQ, showUsage;

    
    public Code() {
        showL = showLQ = showW = showWQ = showUsage = false;
    }
    
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getLQ() {
        return LQ;
    }

    public void setLQ(double LQ) {
        this.LQ = LQ;
    }

    public double getL() {
        return L;
    }

    public void setL(double L) {
        this.L = L;
    }

    public double getW() {
        return W;
    }

    public void setW(double W) {
        this.W = W;
    }

    public double getWQ() {
        return WQ;
    }

    public void setWQ(double WQ) {
        this.WQ = WQ;
    }
 
    public double getUsage() {
        return usage;
    }

    public void setUsage(double usage) {
        this.usage = usage;
    }

    public boolean isShowL() {
        return showL;
    }

    public void setShowL(boolean showL) {
        this.showL = showL;
    }

    public boolean isShowLQ() {
        return showLQ;
    }

    public void setShowLQ(boolean showLQ) {
        this.showLQ = showLQ;
    }

    public boolean isShowW() {
        return showW;
    }

    public void setShowW(boolean showW) {
        this.showW = showW;
    }

    public boolean isShowWQ() {
        return showWQ;
    }

    public void setShowWQ(boolean showWQ) {
        this.showWQ = showWQ;
    }

    public boolean isShowUsage() {
        return showUsage;
    }

    public void setShowUsage(boolean showUsage) {
        this.showUsage = showUsage;
    }
    
    
    
    public void process()
    {
        System.out.println(code);
        Simulator S = new Simulator();
        S.simulate(code);
        
        L = S.getL();
        LQ = S.getLQ();
        W = S.getW();
        WQ = S.getWQ();
        error = S.getError();
        usage = S.getUsage();
        showL = S.showL();
        showLQ = S.showLQ();
        showW = S.showW();
        showWQ = S.showWQ();
        showUsage = S.showUsage();
    }    
}
