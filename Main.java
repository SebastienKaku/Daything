/*
Sebastien Kaku Ap computer Science p1 Day thing
*/
class Main{
   public static void main(String[] args){
      Day bDay = new Day(2008,5,5);
      Day currentDay = new Day(2023,10,12);
      Day apTest = new Day(2024,5,8);
      System.out.println(-1*bDay.daysFrom(currentDay) + " :days i have been alive");
      System.out.println(-1*currentDay.daysFrom(apTest) + " :days until the ap test");
   }
}