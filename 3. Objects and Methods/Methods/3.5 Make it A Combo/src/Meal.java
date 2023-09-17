public class Meal
{
    //Instance attributes//
    private String name;
    private double cost;

    //Class constructor//
    public Meal(String food, double price)
    {
        name = food;
        cost = price;
    }

    //Instance methods//
   public void makeItACombo()
   {
        this.name = this.name + " with fries and soda";
        this.cost += 3.0;
   }

   public String getBill()
   {
        return this.name + ", " + "$"+ this.cost;
   }
}
