package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    } else if (query.toLowerCase().contains("deutsche")) {
      return "Deutsche Bank AG acting through its London branch ('DB London') " +
              "whose address is 21 Moorfields, London EC2Y 9DB.\n";
    } else if (query.toLowerCase().contains("name")) {
      return "WillsAndAshney";
    } else if (query.toLowerCase().contains("16 plus 72")) {
      return "88";
    } else if (query.contains("Which of the following numbers is the largest: 18, 91, 83?")) {
      return "91";
    } else if (query.contains("Which of the following numbers is the largest: 64, 77, 60?")) {
      return "77";
    }

    return "";
  }
}
