
package estateagent1;


// EstateAgent interface
public interface IEstateAgent {
    double estateAgentSales(double[] propertySales);
    double estateAgentCommission(double propertySales);
    int topEstateAgent(double[] totalSales);
}

