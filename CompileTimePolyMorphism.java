/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsdemo;

/**
 *
 * @author K SOMANADH
 */
public class CompileTimePolyMorphism {
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addion is "+c);
    }
    public void add(int a,int b,int c)
    {
        int tot=a+b+c;
        System.out.println("Addion is "+tot);
    }
    public void add(float a,int b)
    {
        float c=a+b;
        System.out.println("Addion is "+c);
    }
    public void add(float a,int b,float c)
    {
        float tot=a+b;
        System.out.println("Addion is "+tot);
    }
    public static void main(String[] args) {
        CompileTimePolyMorphism obj=new CompileTimePolyMorphism();
        obj.add(1, 2);
        obj.add(15.5f, 15);
        obj.add(12,78,89);
        obj.add(87.0f,12,85.0f);
    }
}
