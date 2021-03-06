package alicja.examples.timbuchalka;

public class CanPack {

    //Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
    //The parameter bigCount represents the count of big flour bags (5 kilos each).
    //The parameter smallCount represents the count of small flour bags (1 kilo each).
    //The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
    //Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
    // The method should return true if it is possible to make a package with goal kilos of flour.
    //If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
    // For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided.
    // However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.
    //If any of the parameters are negative, return false.
    //EXAMPLE INPUT/OUTPUT:
    //* canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
    //* canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
    public static void main(String[] args) {
        System.out.println(canPack(-3,2,11));

    }
    public static boolean canPack(int bigCount,int smallCount, int goal){
        int bigCountTotal=bigCount*5;
        int remainingGoal=0;
        int sum=((bigCount*5)+smallCount);
        if((bigCount<0)||(smallCount<0)|| (goal<0)){
            return false;
        }
        if(sum<goal){
            return false;
        }
        if(sum>=goal){
            if(sum==goal){
                return true;
            }
            if(sum>goal){
                //This if else calculates the remaining goal to use with small bags
                if(bigCountTotal>goal){
                   remainingGoal=goal%5;
                }else{
                    remainingGoal=goal-bigCountTotal;
                }
                //Here we are going to check if we can fill the goal with small bags
                if(remainingGoal<=smallCount){
                    return true;
                }
            }

        }

        return false;
    }
}
