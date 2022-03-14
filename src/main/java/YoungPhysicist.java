public class YoungPhysicist {
    public String Equilibrium(int n,int arrX[],int arrY[], int arrZ[]){
        int xValue=0,yValue=0,zValue=0;
        for(int i=0; i< n; i++){
            xValue+=arrX[i];
            yValue+=arrY[i];
            zValue+=arrZ[i];
        }
        if(xValue!=0||yValue!=0||zValue!=0){
            return "NO";
        }else{
            return "YES";
        }
    }
}
