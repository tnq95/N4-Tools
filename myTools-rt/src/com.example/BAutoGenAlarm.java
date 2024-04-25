package com.example;

import javax.baja.sys.BComponent;

public class BAutoGenAlarm extends BComponent {

    

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BAutoGenAlarm.class);

}
