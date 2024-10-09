package com.project.sections.DataStructures;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Portugal","Lisboa");
        capitalCities.put("Espanha","Madrid");
        capitalCities.put("França","Paris");
        capitalCities.put("Bélgica","Bruxelas");

        System.out.println(capitalCities); // {Bélgica=Bruxelas, França=Paris, Espanha=Madrid, Portugal=Lisboa}

        String capitalDePortugal = capitalCities.get("Portugal");

        System.out.println(capitalDePortugal);// Lisboa

        int HashMapSize = capitalCities.size();

        System.out.println(HashMapSize);// 4

        //Loop through an HashMap
            // Using the entrySet method we can easily access both keys and values  at the same time;

        for(Map.Entry<String, String> entry : capitalCities.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("This is the key: " + key);
            System.out.println("This is the value: " + value);


        }

        
    }
}