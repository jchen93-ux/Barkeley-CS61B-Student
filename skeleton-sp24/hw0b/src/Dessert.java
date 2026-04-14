public class Dessert {
    public int flavor;
    public int prince;

    public static int numDesserts = 0;

    public Dessert(int flavor, int prince){
    this.flavor = flavor;
    this.prince = prince;
    numDesserts ++;

    }
    public void printDessert(){
        System.out.println(this.flavor + " " + this.prince + " " + numDesserts);
    }

    public static void main(String[] args){
         System.out.println("I love dessert!");
    }
}
