package comp110.lecture07;

class PizzaCalculator {

  /* Instance Variables (Properties) */
  boolean _extraCheese;
  int _size;
  boolean _coupon;

  /* Constructor */
  PizzaCalculator() {
    _extraCheese = false;
    _size = 10;
    _coupon = false;
  }

  /* Methods */

  /*
   * calculatePrice should follow these rules:
   * 
   * - Extra cheese costs $1.00
   * 
   * - Pizzas 10 inches or smaller are $12.00, larger are $16.00
   * 
   * - Coupon reduces cost of 14" pizzas by 25%
   */
  double calculatePrice() {
    double price = 0.0;

    // TODO: Implement price rules here

    return price;
  }

  /* Accessor Methods - These Allow Callers to Ask for Instance Variables */
  boolean getExtraCheese() {
    return _extraCheese;
  }

  int getInches() {
    return _size;
  }

  boolean getCoupon() {
    return _coupon;
  }

  /* Mutator Methods - These Allow Callers to Change Instance Variables */
  void setExtraCheese(boolean extraCheese) {
    _extraCheese = extraCheese;
  }

  void setSize(int size) {
    _size = size;
  }

  void setCoupon(boolean coupon) {
    _coupon = coupon;
  }

}
