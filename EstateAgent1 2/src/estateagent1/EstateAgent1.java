package estateagent1;

public class EstateAgent1 {

    EstateAgent1(String joe_Bloggs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double estateAgentSales(double[] propertySale) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double estateAgentCommission(double totalSale) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int topEstateAgent(double[] totalSales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // EstateAgent class implementing IEstateAgent interface
    public class EstateAgent implements IEstateAgent {

        private String name;
        // Constructor

        public EstateAgent(String name) {
            this.name = name;
        }

        // Calculate total property sales for an estate agent
        public double estateAgentSales(double[] propertySales) {
            double totalSales = 0;
            for (double sale : propertySales) {
                totalSales += sale;
            }
            return totalSales;
        }

        // Calculate 2% commission for an estate agent
        public double estateAgentCommission(double totalSales) {
            return 0.02 * totalSales;
        }

        // Find the top-performing estate agent
        public int topEstateAgent(double[] totalSales) {
            double maxSales = totalSales[0];
            int topAgentIndex = 0;

            for (int i = 1; i < totalSales.length; i++) {
                if (totalSales[i] > maxSales) {
                    maxSales = totalSales[i];
                    topAgentIndex = i;
                }
            }

            return topAgentIndex;
        }
    }
}
