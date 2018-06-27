import java.lang.reflect.Array;
import java.util.Arrays;

public class Seat {

    private int seatCap;
    private int porrTemp;

    int[][] inputsGoldi = {{100, 80}, {30, 50}, {130, 75}, {90, 60}, {150, 85}, {120, 70}, {200, 200}, {110, 100}};

    public Seat(int seatCap, int porrTemp){

        this.porrTemp = porrTemp;
        this.seatCap = seatCap;

    }

    public void setSeatCap(int seatCap){
        this.seatCap = seatCap;
    }

    public int getSeatCap(){
       return seatCap;
    }

    public void setPorrTemp(int porrTemp){
        this.porrTemp = porrTemp;
    }

    public int getPorrTemp(){
        return porrTemp;
    }

    public  void calGoldi () {

        for(int[] row: inputsGoldi){
            System.out.println(Arrays.toString(row));
        }
    }

    private void display(int[][] x) {
        for (int[] v: inputsGoldi ) {


            System.out.println();
        }
    }

}
