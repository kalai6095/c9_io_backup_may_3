package com.kalai.work_rep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple {
    public static void main(String[] args) {
        int table=0,no_of_rows;
        System.out.println("Please Enter table:");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        try {
            table=Integer.parseInt(reader.readLine());
            System.out.println("Please Enter no of rows");
            no_of_rows=Integer.parseInt(reader.readLine());

            for (int i=0;i<=no_of_rows;i++){
                System.out.println(table +" * "+ i +" = "+ (table*i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
