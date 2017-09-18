package hasnain.duxeye.com.logging;

/**
 * Created by Hasnain on 18-Sep-17.
 */

final public class Log {
    private String tag;
    private boolean isEnable;

    public Log(String tag, boolean isEnable) {
        this.tag = tag;
        this.isEnable = isEnable;
    }

    public void e(String message){
        if(isEnable){
            android.util.Log.e(tag,message);
        }

    }

    public void d(String message){
        if(isEnable){
            android.util.Log.d(tag,message);
        }

    }

    public void i(String message){
        if(isEnable){
            android.util.Log.e(tag,message);
        }

    }
}
