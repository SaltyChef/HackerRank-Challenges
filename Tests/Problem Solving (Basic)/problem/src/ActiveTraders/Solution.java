package ActiveTraders;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {

    static class Customer implements Comparable<Customer>{
        String name;
        int count = 1;
        float tradesPercentage;


        public Customer(String name){
            this.name = name;
        }

        public void add(){this.count++;}

        public void setTradesPercentage(int total){
            this.tradesPercentage =  (((float)(count)) / ((float)(total))) * 100f;
        }


        @Override
        public String toString(){
            return "[" + name + " , " + count +  " , " + tradesPercentage + "]";
        }

        @Override
        public int compareTo(Customer o) {
            return this.name.compareTo(o.name);
        }
    }

    public static List<String> mostActive(List<String> customers) {
        List<String> listCustomers = new ArrayList<>();
        List<Customer> list = new ArrayList<>();
        List<Customer> result = new ArrayList<>();

        for(String customer : customers){
            if(listCustomers.contains(customer)){
                for(Customer c : list)
                    if(c.name.equals(customer))
                        c.add();
            }
            else{
                listCustomers.add(customer);
                list.add(new Customer(customer));
            }
        }

        for(Customer c : list){
            c.setTradesPercentage(customers.size());
            if(c.tradesPercentage >= 5.0)
                result.add(c);
        }

        Collections.sort(result);

        List<String> finalList = new ArrayList<>();
        for(Customer c: result){
            finalList.add(c.name);
        }


        return finalList;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int customersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> customers = IntStream.range(0, customersCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result.mostActive(customers);

//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
