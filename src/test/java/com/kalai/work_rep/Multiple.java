package com.kalai.work_rep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;


@Test_Annotation(value = "100")
public class Multiple {


    //@Test_Annotation(value = "Test")
    public static void main(String[] args) {
        Multiple m = new Multiple();
        m.returnString();

        int table = 0, no_of_rows;
        System.out.println("Please Enter table:");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        try {
            table = Integer.parseInt(reader.readLine());
            System.out.println("Please Enter no of rows");
            no_of_rows = Integer.parseInt(reader.readLine());

            for (int i = 0; i <= no_of_rows; i++) {
                System.out.println(table + " * " + i + " = " + (table * i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test_Annotation(value = "Test")
    public void returnString() {
        Class<?> cl = Multiple.class;
        System.out.println("the value");
        if (cl.isAnnotationPresent(Test_Annotation.class)) {
            Annotation annotation = cl.getAnnotation(Test_Annotation.class);
            Test_Annotation ta = (Test_Annotation) annotation;
            for (int i = 0; i < Integer.parseInt(ta.value()); i++) {
                System.out.println("the value of this %d " + i);
            }
            System.out.println(ta.value());
        }
        System.out.println("On Call This Method");
    }
}
