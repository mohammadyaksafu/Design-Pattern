package FactoryDesign;
import FactoryDesign.Phone.Andriod;
import FactoryDesign.Phone.OS;
import FactoryDesign.Phone.OperatingSystemFactory;
import FactoryDesign.Phone.Windows;

public class FactoryMain{
    public static void main(String[] args) {
        OS obj=new Windows();
        obj.spec();
        OperatingSystemFactory obj1=new OperatingSystemFactory();
        OS o1=obj1.getOS("Open");
        OS o2=obj1.getOS("Closed");
        OS o3=obj1.getOS("Windows");
        o1.spec();
        o2.spec();
        o3.spec();

    }
}