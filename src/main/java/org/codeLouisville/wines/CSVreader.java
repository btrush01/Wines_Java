package org.codeLouisville.wines;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class CSVreader {
    private ArrayList<wineBean> data = new ArrayList<>();

    public CSVreader(String fileName) {
        System.out.println("Reading wine data");
        try {
            Reader in = new FileReader(fileName);
            Iterable<CSVRecord> records = CSVFormat.newFormat(';').withQuote('"').withFirstRecordAsHeader().parse(in);
            for (CSVRecord record : records) {
                String pH = record.get("pH").trim();
                String sulphates = record.get("sulphates").trim();
                String alcohol = record.get("alcohol").trim();
                String quality = record.get("quality").trim();
                wineBean wine = new wineBean(pH, sulphates, alcohol, quality
                );

                data.add(wine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Wine file not found");
            System.exit(1);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    public ArrayList<wineBean> getData() {
        return data;
    }
}
