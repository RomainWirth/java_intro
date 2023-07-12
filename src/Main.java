public class Main {
    static int cardboardsNumbers = 34;
    static int truckCapacity = 9;
    static int tripNumber;

    public static void main(String[] args) {
        tripNumber = 0;
        while(cardboardsNumbers > 0) {
            tripNumber += 1;
            if(cardboardsNumbers >= truckCapacity) {
                cardboardsNumbers -= truckCapacity;
                System.out.println("voyage n° " + tripNumber);
                System.out.println("un voyage de " + truckCapacity + " cartons");
            } else {
                System.out.println("voyage n° " + tripNumber);
                System.out.println("un voyage de " + cardboardsNumbers + " cartons");
                cardboardsNumbers -= cardboardsNumbers;
            }
        }
    }
}