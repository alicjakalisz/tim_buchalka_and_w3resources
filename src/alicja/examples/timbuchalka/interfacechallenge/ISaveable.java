package alicja.examples.timbuchalka.interfacechallenge;

import java.util.ArrayList;

public interface ISaveable {

    public boolean doImport(ArrayList<String> fields);// assigin values to the fields from the passed ArrayList
    public ArrayList<String> doExport();// is going to convert attributes of the object into Arraylist of strings
}
