/*
* File: Storage.java
* Author: Siegenthaler Alexandra
* Copyright: 2026, Siegenthaler Alexandra
* Group: Szoft II-E
* Date: 2026-03-31
* Github: https://github.com/completefullstack/
* Licenc: MIT
*/

package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {
   public static void writeContent(String areaStr){
        try{
            trywriteContent(areaStr);

    } catch(IOException e) {
        System.err.println("Hiba nem írható");
        System.err.println(e.getMessage());
    }
    }
    public static void trywriteContent(String areaStr) throws IOException{
        FileWriter fileWriter = new FileWriter("teruletek.txt", true);
        fileWriter.write(areaStr+"\n");
        fileWriter.close();

    }
} 

