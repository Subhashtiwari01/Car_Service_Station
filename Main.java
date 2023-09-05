import java.util.*;

class CarServiceStation {
    private Map<String, Integer> servicePrices;
    private Map<String, String> serviceDescriptions;

    public CarServiceStation() {
        servicePrices = new HashMap<>();
        serviceDescriptions = new HashMap<>();

        // Define service prices for each car type and service code
        servicePrices.put("Hatchback-BS01", 2000);
        servicePrices.put("Hatchback-EF01", 5000);
        servicePrices.put("Hatchback-CF01", 2000);
        servicePrices.put("Hatchback-BF01", 1000);
        servicePrices.put("Hatchback-GF01", 3000);

        servicePrices.put("Sedan-BS01", 4000);
        servicePrices.put("Sedan-EF01", 8000);
        servicePrices.put("Sedan-CF01", 4000);
        servicePrices.put("Sedan-BF01", 1500);
        servicePrices.put("Sedan-GF01", 6000);

        servicePrices.put("SUV-BS01", 5000);
        servicePrices.put("SUV-EF01", 10000);
        servicePrices.put("SUV-CF01", 6000);
        servicePrices.put("SUV-BF01", 2500);
        servicePrices.put("SUV-GF01", 8000);

        // Define service descriptions
        serviceDescriptions.put("BS01", "Basic Servicing");
        serviceDescriptions.put("EF01", "Engine Fixing");
        serviceDescriptions.put("CF01", "Clutch Fixing");
        serviceDescriptions.put("BF01", "Brake Fixing");
        serviceDescriptions.put("GF01", "Gear Fixing");
    }

    public int calculateTotalBill(String carType, List<String> serviceCodes) {
        int totalBill = 0;

        for (String code : serviceCodes) {
            String key = carType + "-" + code;
            if (servicePrices.containsKey(key)) {
                totalBill += servicePrices.get(key);
                System.out.println("Charges for " + serviceDescriptions.get(code) + " - Rs. " + servicePrices.get(key));
            }
        }

        System.out.println("Total Bill - Rs. " + totalBill);

        if (totalBill > 10000) {
            System.out.println("Complimentary cleaning provided.");
        }

        return totalBill;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CarServiceStation serviceStation = new CarServiceStation();

        // Example input

        String carType = "Hatchback";
        List<String> serviceCodes = new ArrayList<>();
        serviceCodes.add("BS01");
        serviceCodes.add("EF01");

        int totalBill = serviceStation.calculateTotalBill(carType, serviceCodes);
    }
}
