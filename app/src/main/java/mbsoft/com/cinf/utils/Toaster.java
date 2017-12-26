package mbsoft.com.cinf.utils;

import android.content.Context;
import android.widget.Toast;

import mbsoft.com.cinf.config.AppConfig;

/**
 * Created by bappy on 12/26/2017.
 */

public class Toaster {
    public static void show(Context context, String message) {
        if (AppConfig.DEBUG)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
