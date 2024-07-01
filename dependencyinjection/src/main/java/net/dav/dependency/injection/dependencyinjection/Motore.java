package net.dav.dependency.injection.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Motore {
    
    private String id = "1234A";

    //public Motore(String id){
    //    this.id = id;
    //}

    public String getId(){
        return id;
    }

    public void setId( String id){
        this.id = id;
    }

}
