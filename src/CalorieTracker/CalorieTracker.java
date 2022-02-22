package CalorieTracker;

public class CalorieTracker {
    public float weightLostInAMonth(int cycling, int running, int swimming, int calorieIntake){
        int calorieBurnt = cycling+running+swimming;
        int totalCalorie = calorieBurnt-calorieIntake;
        int calorieInMonth = totalCalorie*4;
        int extraCalorie = 30*100;
        int totalCalorieInAMonth = calorieInMonth+extraCalorie;
        if(totalCalorieInAMonth>0){
            return (float) (totalCalorieInAMonth/1000);
        }
        return -1;
}
    public static void main(String[] args){
        CalorieTracker ct = new CalorieTracker();
        System.out.println("Weight Lost By Anne in a month is: "+ct.weightLostInAMonth(200,200,200,100)+" Pound");
    }
}
