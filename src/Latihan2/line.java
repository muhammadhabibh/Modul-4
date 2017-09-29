/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;
/**
 *
 * @author SMK TELKOM
 */
public class line extends Relation{
    private final double x1;
    private final double x2;
    private final double y1;
    private final double y2;
    
    public line(double x1, double x2, double y1, double y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    
    public double getLenght(){
        double lenght=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return lenght;
    }
    
    public boolean isGreater(Object a, Object b){
       double aLen=((Line)a).getLenght();
       double bLen=((Line)b).getLenght();
       return (aLen>bLen);
    }
    
    public boolean isLess(Object a, Object b){
       double aLen=((Line)a).getLenght();
       double bLen=((Line)b).getLenght();
       return (aLen<bLen);
    }
    
    public boolean isEqual(Object a, Object b){
       double aLen=((Line)a).getLenght();
       double bLen=((Line)b).getLenght();
       return (aLen==bLen);
    }
}
