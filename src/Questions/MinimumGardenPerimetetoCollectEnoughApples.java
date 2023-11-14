package Questions;
//1954. https://leetcode.com/problems/minimum-garden-perimeter-to-collect-enough-apples/description/
public class MinimumGardenPerimetetoCollectEnoughApples {

        public long minimumPerimeter(long neededApples) {
            long count=0;

            while(2*count*(count+1)*(1+2*count)<neededApples){
                count++;
            }
            return 8*count;
        }
    }

