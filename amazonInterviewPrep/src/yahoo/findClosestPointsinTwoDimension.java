package yahoo;

public class findClosestPointsinTwoDimension {
    public static void main(String[] args) {
        int[][] point ={{1,2}, {2,1}, {0,1}, {2,2}};
        findDistance(point);
    }

    private static void findDistance(int[][] point) {
        double distance = Integer.MAX_VALUE;
        int i =0;
        int iInd=-1;
        int jInd=-1;
        for( int j=i+1;j<point.length; j++ )
        {
            double meansqare = Math.sqrt(Math.pow((point[j][0]-point[i][0]),2) +
                    Math.pow((point[j][1]-point[i][1]),2) );
            if(meansqare < distance) {
                distance = meansqare;
                iInd = i;
                jInd = j;
            }
        }
        System.out.println(distance +" coardinate {"+point[iInd][0]+","+point[iInd][1]+"} and  {"+point[jInd][0]+","
                +point[jInd][1]+"}");
    }
}
