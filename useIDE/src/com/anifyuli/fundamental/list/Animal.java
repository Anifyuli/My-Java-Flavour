package com.anifyuli.fundamental.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animal {

    public static void main(String[] args) {
        // membuat array berisi String bernama reptil sebanyak 3 data
        // array ini tidak dapat dihapus dengan method remove()
        String[] reptils = new String[3];
        reptils[0] = "comodo";
        reptils[1] = "crocodile";
        reptils[2] = "alligator";
        //reptils[3] = "snake"; //menyebabkan error karena jumlah String yang dideklarasikan oleh reptil hanya 3 data

        //mencetak array reptils
        System.out.println("Animals from reptils class is " + Arrays.toString(reptils));

        //menggunakan ArrayList
        List<String> reptil = new ArrayList<>();
        //method add untuk menambahkan objek ke List
        reptil.add("turtle");
        reptil.add("tortoise");
        reptil.add("lizard");
        reptil.add("gecko");
        reptil.add("chameleon");
        // objek lainnya masih bisa terus ditambahkan ke List

        //mencetak List reptil
        System.out.println("Lists of reptil is : ");
        //menggunakan method size() untuk mencari ukuran List reptil
        for (int i = 0; i < reptil.size(); i++) {
            //method get() untuk melihat isi List pada index i
            System.out.println("index " + i + " = " + reptil.get(i));
        }

        //menggunakan remove() untuk menghapus "alligator" dari List reptil
        reptil.remove("gecko");

        System.out.println("List reptil after removing alligator from reptil");
        for (int i = 0; i < reptil.size(); i++) {
            System.out.println("index " + i + " " + reptil.get(i));
        }

    }

}
