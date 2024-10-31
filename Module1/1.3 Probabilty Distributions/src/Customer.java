public class Customer {
   private static int increment = 0;
   final private int id;
   private long startTime;
   private long endTime;
   private int arrivalTime;
   private int exitTime;



   Customer(){
       increment++;
       id = increment;
   }

   public int getId() {
       return id;
   }

   public void setStartTime() {
       startTime = System.currentTimeMillis();
   }

   // This is a method that sets each event time as a customer arrival time.
   public void setArrivalTime(int arrivalTime) {
       this.arrivalTime = arrivalTime;
   }

   public long getStartTime() {
       return startTime;
   }

   public int getArrivalTime() { return arrivalTime; }

   public void setEndTime() {
       endTime = System.currentTimeMillis();
   }

    // This is a method that sets each event time as a customer arrival time.
    public void setExitTime(int exitTime) {
        this.exitTime = this.arrivalTime + exitTime;
    }

   public long getEndTime() {
       return endTime;
   }
   public int getExitTime() { return exitTime; }

   public long getTime() {
       return endTime - startTime;
   }
   public int getProcessTime() {return exitTime - arrivalTime;}

   public long timeToSeconds() {
       long time = getTime();
       return time / 1000;
   }

   public long timeToMinutes() {
       long time = getTime();
       return time / 1000 / 60;
   }

}