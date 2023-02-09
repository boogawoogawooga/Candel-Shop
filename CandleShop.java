import java.util.Scanner;

public class CandleShop {
   
public static void main(String[]args){
// Create Random Customer that orders between 1-10 candles of random amounts between the 3 types

    // Scanner system
    Scanner ask = new Scanner(System.in);
  // Create Candle Types
  // Candle Type 1
  // Start with asking user for input for name
  System.out.println("Please type the name of the first candle you would like to sell");
  String nam1 = ask.nextLine();
  System.out.println("Please assign a number to this candle 1-3"); // ask user to unput number
  int typ1 = ask.nextInt();
  while (typ1<= 0 || typ1 > 3){ // Make sure user enters number between 1-3
    System.out.println("Whoops, looks like you entered a number outside of the parameters. Try again!");
    typ1 = ask.nextInt();
  }
  System.out.println("Please assing a cost to this candle in dollars"); // ask user to assign price
  double cst1 = (double) ask.nextDouble();
  while (cst1< 0){ // Make sure user enters positive number
    System.out.println("Whoops, looks like you entered a negative number. Try again!");
    cst1 = ask.nextDouble();
  }
  System.out.println("Please input how long you would like this candle to burn for in hours"); // ask user to assign burn time
  int brn1 = ask.nextInt();
  while (brn1< 0){ // Make sure user enters positive number
    System.out.println("Whoops, looks like you entered a negative number. Try again!");
    brn1 = ask.nextInt();
  }
  Candle c1 = new Candle(nam1, typ1, (double) cst1, brn1); // makes candle c1 with parameters listed above
  
  // outprint candle c1 parameters for user
  System.out.println("###############################################################################");
  System.out.println(""); 
  System.out.println("Candle " + c1.getType() + " is called " + c1.getName() + ", will cost $" + c1.getCost() + ", and will last " + c1.getTime() + " hours!");
  System.out.println(""); 
  System.out.println("###############################################################################");

  // Candle Type 2
    // Start with asking user for input for name
  System.out.println("Please type the name of the second candle you would like to sell");
  ask.nextLine();
  String nam2 = ask.nextLine();
  while (nam2 == nam1){ // checks to make sure user does not duplicate name 
    System.out.println("Whoops, looks like you duplicated a name");    
    nam2 = ask.nextLine();
  }
  System.out.println("Please assign a number to this candle 1-3"); // ask user to unput number
  int typ2 = ask.nextInt();
  ask.nextLine();
  while (typ2<= 0 || typ2 > 3 || typ1 == typ2){ // makes sure user keeps number between 1-3 and does not duplicate numbers
    System.out.println("Whoops, looks like you entered a number outside of the parameters or you duplictaed a number. Try again!");
    typ2 = ask.nextInt();
  }
  System.out.println("Please assing a cost to this candle in dollars"); // asks user to assign price
  double cst2 = (double) ask.nextDouble();
  while (cst2< 0){ // Make sure user enters positive number
    System.out.println("Whoops, looks like you entered a negative number. Try again!");
    cst2 = ask.nextDouble();
  }
  System.out.println("Please input how long you would like this candle to burn for in hours"); // asks user to assign burn time
  int brn2 = ask.nextInt();
  while (brn2< 0){ // Make sure user enters positive number
    System.out.println("Whoops, looks like you entered a negative number. Try again!");
    brn2 = ask.nextInt();
  }
  Candle c2 = new Candle(nam2, typ2, (double) cst2, brn2); // makes candle c2 with above parameters

    // outprint candle c2 parameters for user
  System.out.println("###############################################################################");
  System.out.println(""); 
  System.out.println("Candle " + c2.getType() + " is called " + c2.getName() + ", will cost $" + c2.getCost() + ", and will last " + c2.getTime() + " hours!");
  System.out.println(""); 
  System.out.println("###############################################################################");

  // Candle Type 3
    // Start with asking user for input for name
  System.out.println("Please type the name of the third candle you would like to sell");
  ask.nextLine();
  String nam3 = ask.nextLine();
  while (nam3 == nam1 || nam3 == nam2){ // checks to make sure user does not duplicate name 
    System.out.println("Whoops, looks like you duplicated a name");    
    nam3 = ask.nextLine();
  }
  System.out.println("Please assign a number to this candle 1-3"); // asks user to assing number 1-3
  int typ3 = ask.nextInt();
  while (typ3<= 0 || typ3 > 3 || typ3 == typ2 || typ3 == typ1){ // makes sure user assings number 1-3 and does not duplicate number
    System.out.println("Whoops, looks like you entered a number outside of the parameters or you duplictaed a number. Try again!");
    typ3 = ask.nextInt();
  }
  System.out.println("Please assing a cost to this candle in dollars"); // asks user to input price
  double cst3 = (double) ask.nextDouble();
  while (cst3< 0){ // Make sure user enters positive number
    System.out.println("Whoops, looks like you entered a negative number. Try again!");
    cst3 = ask.nextDouble();
  }
  System.out.println("Please input how long you would like this candle to burn for in hours"); // asks user to input burn time 
  int brn3 = ask.nextInt();
  while (brn3< 0){ // Make sure user enters positive number
    System.out.println("Whoops, looks like you entered a negative number. Try again!");
    brn3 = ask.nextInt();
  }
  Candle c3 = new Candle(nam3, typ3, (double) cst3, brn3); // create candle c3 with above parameters

  // outprint candle c3 parameters for user
  System.out.println("###############################################################################");
  System.out.println(""); 
  System.out.println("Candle " + c3.getType() + " is called " + c3.getName() + ", will cost $" + c3.getCost() + ", and will last " + c3.getTime() + " hours!");
  System.out.println(""); 
  System.out.println("###############################################################################");

  // Customer generator 
  // Generate 3 random numbers 1-10 for each candle type
  System.out.println("If you would like to have the customer decide what candels they want, press 1. If you would like to decide for them, press 2");
  int z = ask.nextInt();
    int customerCandle1 = 10;
    int customerCandle2 = 10;
    int customerCandle3 = 10;

    int sumCustomer = customerCandle1 + customerCandle2 + customerCandle3; // creates sum of 3 candel types

    String customer = getRandomName(); // calls on getRanomName method to assing a random name to the customer
    if (z == 1){
      while(sumCustomer > 10){ // makes sure the sum of the customer's candles are not more than 10
        customerCandle1 = (int) (Math.random()*11);
        customerCandle2 = (int) (Math.random()*11);
        customerCandle3 = (int) (Math.random()*11);

        sumCustomer = customerCandle1 + customerCandle2 + customerCandle3; 
      }  
    }
    else {
      System.out.println("Please the quanitity ordered of candle " + c1.getType());
      customerCandle1 = ask.nextInt();
      System.out.println("Please the quanitity ordered of candle " + c2.getType());
      customerCandle2 = ask.nextInt();
      System.out.println("Please the quanitity ordered of candle " + c3.getType());
      customerCandle3 = ask.nextInt();
      sumCustomer = customerCandle1 + customerCandle2 + customerCandle3; 
    }

  // Display the customers order to the user with the given inputs for the 3 candle types 
  ask.nextLine();
  System.out.println("Please press enter for a customer to place their order");
  String y = ask.nextLine(); 

  System.out.println("");
  System.out.println("###############################################################################");
  System.out.println("");
  System.out.println(customer + " ordered " + customerCandle1 + " of candle " + c1.getType() + " " + c1.getName() + ", " + customerCandle2 + " of candle " + c2.getType() + " " + c2.getName() + ", and " + customerCandle3 + " of candle " + c3.getType() + " " + c3.getName() + ".");
  System.out.println(""); 
  System.out.println("###############################################################################");

  // Calculate total 
  double totalPrice = (double) (customerCandle1 * c1.getCost() + customerCandle2 * c2.getCost() + customerCandle3 * c3.getCost());
  int totalBurn = (customerCandle1 * c1.getTime() + customerCandle2 * c2.getTime() + customerCandle3 * c3.getTime());

  // Calculate discount
  double discount = 1; 

  // Create if statements for each discount type given the parameters 
  if(totalPrice>20 && totalPrice<35){
    discount = (double) 0.95;
  }
  if(totalPrice>35 && totalPrice<55){
    discount = (double) 0.93;
  }
  if(totalPrice>55 && totalPrice<100){
    discount = (double) 0.9;
  }
  if(totalPrice>100){
    discount = (double) 0.8;
  }
  double newPrice = (double) (totalPrice * discount);
  double priceSave = (double) (totalPrice - newPrice);
  int displayDiscount = (int) ((1-discount)*100);
  double pricePerBurn = (double) ((totalPrice/totalBurn) / 60);

  // Return customers total price, their discount, and their final cost along with savings
  System.out.println("###############################################################################");
  System.out.println("");
  System.out.println(customer + ", your total today is $" + totalPrice + ". But, you earned a %" + displayDiscount + " discount which brings your new total to $" + newPrice + ", giving you a savings of $" + priceSave + "!");
  System.out.println(customer + ", you will be able to have candles burning for " + totalBurn + " hours; meaning that it will cost $" + pricePerBurn + " per minute you burn your candles!");
  if ((sumCustomer/10) >= 1){
  System.out.println(customer + ", you also earned a total of " + (int) (sumCustomer/10) + " point(s) today");
  }
  System.out.println(""); 
  System.out.println("###############################################################################");
  System.out.println("");
  System.out.println("Please press enter for a histogram displaying the candles ordered");
  String x = ask.nextLine(); 

  // Histogram
  System.out.println("Histogram:");
  System.out.println(customerCandle1 + " type " + c1.getType() + " (" + c1.getName() + ") candles"); 
  for (;customerCandle1 > 0; customerCandle1 --){
    System.out.print("@");
  }
  System.out.println("");
  System.out.println(customerCandle2 + " type " + c2.getType() + " (" + c2.getName() + ") candles"); 
  for (;customerCandle2 > 0; customerCandle2 --){
    System.out.print("#");
  }
  System.out.println("");
  System.out.println(customerCandle3 + " type " + c3.getType() + " (" + c3.getName() + ") candles"); 
  for (;customerCandle3 > 0; customerCandle3 --){
    System.out.print("%");
  }
  System.out.println("");
}

  private static String getRandomName() {
      final int NUMBER_OF_NAMES = 6;
      double r = Math.random();
      int numC = (int) (r * NUMBER_OF_NAMES);
      String customer = "";

      if (numC == 0){
          customer = "Spencer";
      }
      if (numC == 1){
          customer = "John";
      }
      if (numC == 2){
          customer = "Henry";
      }
      if (numC == 3){
          customer = "Jane";
      }
      if (numC == 4){
          customer = "Lauren";
      }
      if (numC == 5){
          customer = "Angie";
      }
      return customer; 
  }
}

 
