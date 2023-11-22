package estateagent1;

// Main class to run the program
public  class Main {

    public static void main(String[] args) {
        // Two estate agents
        EstateAgent1 joeBloggs = new EstateAgent1("Joe Bloggs");
        EstateAgent1 janeDoe = new EstateAgent1("Jane Doe");

        // Property sales for January, February, and March
        double[][] propertySales = {
            {800000, 700000},
            {1500000, 1200000},
            {2000000, 1600000}
        };

        // Calculate and print total property sales and commission for each estate agent
        double[] totalSales = new double[2];
        double[] totalCommission = new double[2];

        for (int i = 0; i < 2; i++) {
            totalSales[i] = joeBloggs.estateAgentSales(propertySales[i]);
            totalCommission[i] = joeBloggs.estateAgentCommission(totalSales[i]);

            System.out.println("Total sales for " + (i == 0 ? "Joe Bloggs" : "Jane Doe") + ": R" + totalSales[i]);
            System.out.println("Commission earned: R" + totalCommission[i]);
            System.out.println();
        }

        // Find and print the top-performing estate agent
        int topAgentIndex = joeBloggs.topEstateAgent(totalSales);
        System.out.println("Top estate agent: " + (topAgentIndex == 0 ? "Joe Bloggs" : "Jane Doe"));
    }
}

