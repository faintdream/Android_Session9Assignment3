/*
 * In this program we demo use of HashMap to store key value pair
 * of an employee_name and employee_code , and display just the values for each key
 */
package hashmapdemo;

import java.util.HashMap; //importing hashmap class


public class HashMapDemo {              //main class 

    public static HashMap<Integer,String> map=new HashMap<>();   //declaring  a hashmap  : map with key value pair
                                                                 // of Integer and String
    public static void main(String[] args) {
            map.put(101, "Akash Dubey");                        //adding key, value to map
            map.put(102, "Sajid Khursi");                       // "-"
            map.put(103, "Shabana Janeman Khan");               // "-"
            map.put(110, "Anthony Gonzalvez tiwari");           //adding key, value to map

            for(Integer item:map.keySet()){                     //looping over hasmap
                System.out.println("Employee Name: "+ map.get(item));          //feding key to print its value
            }
    }
    
}
