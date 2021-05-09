package oop2;

import java.util.Objects;

public class A {

   private String x;


    public A(String x){
        this.x=x;
    }

    @Override
    public String toString(){
        return "A:\n \tx: "  + x;
    }

    public String getX(){
        return x;
    }

    @Override //
    public boolean equals(Object o) {
        if (this == o) return true;// is this the same address of memeroy so if it is then the same object an true
        if (!(o instanceof A)) return false; // if the parameter that i am passing is not an instance of C they are not goin got be equals so false
        A c = (A) o;
        return this.x.equals(c.x);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}

