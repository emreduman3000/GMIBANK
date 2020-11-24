package gmibank.utilities;

import gmibank.pojos.Customer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
public class WriteToText2 {
    public static void saveDataInFileWithPojo(String fileName, List<Customer> customer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i <customer.size() ; i++) {
                writer.append(customer.get(i).getFirstName() + " , " + customer.get(i).getLastName() + " , " + customer.get(i).getEmail() + "\n");
            }
            writer.close();
        } catch (Exception e) {
        }
    }
    public static void saveDataInFileWithJsonListString(String fileName, List<String> json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append( json + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }
    public static void saveDataInFileWithJsonListMap(String fileName, List<Map<String,Object>> json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i <json.size() ; i++) {
                writer.append(json.get(i).get("id") + " , " + json.get(i).get("name") + " , " + json.get(i).get("states") + "\n");
            }
            writer.close();
        } catch (Exception e) {
        }
    }
}




