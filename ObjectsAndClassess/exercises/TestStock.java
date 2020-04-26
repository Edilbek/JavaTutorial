public class TestStock {
  public static void main(String[] args) {
    Stock stock = new Stock("ORCL", "Oracle Corporation");
    stock.previousClosingPrice = 34.5;
    stock.currentPrice = 34.35;
    System.out.println(stock.symbol);
    System.out.println(stock.name);
    System.out.println(stock.getChangePercent());
  }
}

class Stock {
  String symbol, name;
  double previousClosingPrice, currentPrice;

  Stock(String symbol, String name) {
    this.symbol = symbol;
    this.name = name;
  }

  double getChangePercent() {
    return (currentPrice - previousClosingPrice) / previousClosingPrice;
  }
}
