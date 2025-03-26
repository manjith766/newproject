package com.neoteric.tsrtcbusbooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelDBService {
    Map<String,Bus>busdata =  new HashMap<>();
    List<Bus> busList=new ArrayList<>();

     public TravelDBService(){
   populatebusdata();

    }
    public void populatebusdata(){
        Bus bus1 =new Bus();
        bus1.busno = " 22333";
        bus1.busservice ="viz- hyd";
        bus1.fromlocation = "vizag";
        bus1.tolocation = "hyderbad";
        busdata.put("vizag - hyderbab",bus1);

        Bus express= new Bus();
        express.busno = "2233";
        express.busservice = "viz - hyd";
        express.fromlocation = "vizg";
        express.tolocation ="hyderbad";
        busdata.put("vizg-hyderbad",express);

        Bus bus2 = new Bus();
        bus2.busno = "33444";
        bus2.busservice ="hyd - viz";
        bus2.fromlocation ="hyd";
        bus2.tolocation ="viz";
        busdata.put("hyd-viz",bus2);

        Bus superluxry= new Bus();
        superluxry.busno = "3344";
        superluxry.busservice ="hyd - viz";
        superluxry.fromlocation ="hyd";
        superluxry.tolocation ="viz";
        busdata.put("hyd-viz",superluxry);

        busList.add(bus1);
        busList.add(bus2);
        busList.add(superluxry);
        busList.add(express);

    }


     public List<Bus> findBuses(String from, String to) {
    List<Bus> availableBuses = new ArrayList<>();
    for (Bus bus : busList) {
        if (bus.fromlocation.equalsIgnoreCase(from) && bus.tolocation.equalsIgnoreCase(to)) {
            availableBuses.add(bus);
        }
    }
    return availableBuses;
}
}

