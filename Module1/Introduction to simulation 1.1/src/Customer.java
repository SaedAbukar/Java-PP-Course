public class Customer {
   private static int increment = 0;
   final private int id;
   private long startTime;
   private long endTime;



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

   public long getStartTime() {
       return startTime;
   }

   public void setEndTime() {
       endTime = System.currentTimeMillis();
   }

   public long getEndTime() {
       return endTime;
   }

   public long getTime() {
       return endTime - startTime;
   }

   public long timeToSeconds() {
       long time = getTime();
       return time / 1000;
   }

   public long timeToMinutes() {
       long time = getTime();
       return time / 1000 / 60;
   }

}