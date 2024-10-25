package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        // Create mock list
        list = MockCityList();

        // Create new city object
        City city = new City("Estevan", "SK");

        // Add the new city to the list
        list.addCity(city);

        // Test if has_city returns true
        assertEquals(true, list.has_city(city));
    }

    @Test
    public void deleteCityTest(){

        // Create mock list
        list = MockCityList();

        // Create new city object
        City city = new City("Estevan", "SK");

        // Add the new city to the list
        list.addCity(city);

        // Assert that there is 1 city in the list
        assertEquals(1, list.getCount());

        // Delete the city from the list
        list.delete_city(city);

        // Assert there is 0 cities in the list
        assertEquals(0, list.getCount());
    }
}
