package oop2;

import java.util.Objects;

public class C extends B {
    String z;

    public C(String x, String y, String z){
        super(x,y); // super(B) has two parameters in the constructors so here we need to put 3 if we dont want to hardcode z
        this.z=z;
    }

    @Override
    public String toString(){
        return "C:\n \tx: "  + getX()+ "\n \ty: "+ y +"\n \tz: " + z;
    }

    @Override //
    public boolean equals(Object o) {
        if(!super.equals(o))
            return false;
        if (this == o) return true;// is this the same address of memeroy so if it is then the same object an true
        if (!(o instanceof C)) return false; // if the parameter that i am passing is not an instance of C they are not goin got be equals so false
        C c = (C) o;
        return this.z.equals(c.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(z);
    }
}
