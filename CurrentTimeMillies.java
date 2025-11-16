
package currenttimemillies;


public class CurrentTimeMillies {

    
    public static void main(String[] args) {
        long total_milli_second = System.currentTimeMillis();
        long total_second = total_milli_second/1000;
        long currentSecond = total_second%60;
        long total_minute = total_second/60;
        long currentMinute = total_minute%60;
        long total_Houre = total_minute/60;
        long currentHoure = total_Houre%24;
        
        System.out.println(currentHoure+(4)+":"+(currentMinute+(30)+":"+currentSecond));
        
        
    }
    
}
