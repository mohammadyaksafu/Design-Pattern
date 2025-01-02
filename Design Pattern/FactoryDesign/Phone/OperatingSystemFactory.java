package FactoryDesign.Phone;

public class OperatingSystemFactory {
    
    public OS getOS(String str) {
        if(str.equals("Open"))
            return new Andriod();
        else if(str.equals("Closed"))
         return new IOS();
        else
         return new Windows();
    }
}
