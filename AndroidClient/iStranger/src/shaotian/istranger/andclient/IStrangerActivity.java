package shaotian.istranger.andclient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import shaotian.istranger.network.WebServiceUtil;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class IStrangerActivity extends Activity {
    /** Called when the activity is first created. */
	public String t;    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView txt=(TextView)findViewById(R.id.txt); 
        JSONObject json=new JSONObject();
        final String requestUrl = "http://192.168.0.10/webservice/RestServiceImpl.svc/json/1";
        final String method = "GET";
        final Map<String, String> params = new HashMap<String, String>();
       runOnUiThread(new Runnable() {
            public void run() {try {
            	
				t=WebServiceUtil.sendHttpRequest(requestUrl, method, params).toString();
            	Log.d("asdaaaaaaaaaaaaaaaaaaaaaa", t);
            } catch (IOException e) {
            	e.printStackTrace();
            }
            }});
       txt=null;
    }
}