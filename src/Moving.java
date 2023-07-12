public class Moving {
    int cardboardsNumbers = 34;
    int truckCapacity = 9;
    int tripNumber;
    public void move() {
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
