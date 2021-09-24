package com.anas74khan.xtoast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;
import android.widget.Toast;

public class xtoast extends CordovaPlugin {

    private CallbackContext callbackContext;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("showToast")) {
            
            boolean messageError = false;
            String message = "";
            int duration = Toast.LENGTH_LONG;

            try{
                JSONObject options = args.getJSONObject(0);
                message = options.getString("message");
                if(message.length() == 0) messageError = true;
            }
            catch (JSONException exp){
                messageError = true;
            }
            try{
                JSONObject options = args.getJSONObject(0);
                duration = options.getInt("duration");
                if(duration == 0) duration = Toast.LENGTH_LONG;
            }
            catch (JSONException exp){
                duration = Toast.LENGTH_LONG;
            }

            if(messageError) callbackContext.error("No message specified!");
            else{
                Toast.makeText(webView.getContext(), message, duration).show();
                callbackContext.success("Toast displayed successfully.");
            }
            return true;
        }
        return false;
    }
}
