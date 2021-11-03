package jc;
public class RGBEditor{
    private int rgb;
    private int r;
    private int g;
    private int b;
    private int a;

    public RGBEditor(int rgb){
        this.rgb = rgb;
    }
    public RGBEditor(int r, int g, int b, int a){
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }
    public int[] getRGBArray(){
        //get alpha
        this.a = (this.rgb>>24) & 0xff;

        //get red
        this.r = (this.rgb>>16) & 0xff;

        //get green
        this.g = (this.rgb>>8) & 0xff;

        //get blue
        this.a = this.rgb & 0xff;
        int[] rgbarray = {this.r,this.g,this.a,this.a};
        return rgbarray;
    }
    public int getRGBint(){
        int rgbint = (this.a<<24) | (this.r<<16) | (this.g<<8) | this.b;
        return rgbint;
    }   
}