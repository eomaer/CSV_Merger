package info.swenhome.csv_merger;

import info.swenhome.Amazon_Merge.Listing_Tools.CSV_LIST;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class MAIN {
    private int anzahl;
    private List<CSV_LIST> csvs= new ArrayList<>();
    public static void main(String[] args){
        JOptionPane.showMessageDialog(new JFrame(),"Bitte auswählen wieviele CSVs Zusammengefasst werden sollen","Hinweis!", JOptionPane.INFORMATION_MESSAGE);


        System.exit(0);
    }
}
