package com.cvrp.ga;

/**
 * Created by sarja on 8/23/2016.
 */
import java.util.ArrayList;
import java.util.List;

//import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;


public class MyPartitionTest {

    public void partitiontest() {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        list.add("eleven");
        List<List<String>> partition = MyPartition.partition(list, 3);
        for(int x=0; x<= partition.size(); x++)
        System.out.println(partition.get(x));


        // now let assume you want to have x number of buckets
        // How many elements must placed in a list?
        // Take x as 3


    }


    public static void main(String[] args) {

        MyPartitionTest driver = new MyPartitionTest();
        driver.partitiontest();


    }
}
