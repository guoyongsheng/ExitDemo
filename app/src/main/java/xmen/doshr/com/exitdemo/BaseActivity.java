package xmen.doshr.com.exitdemo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

/**
 * Created by wesley on 2016/4/14.
 */
public class BaseActivity extends Activity
{

    private IntentFilter intentFilter;
    private MyBroadCastReserver myBroadCastReserver = new MyBroadCastReserver();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        initView();
    }

    //初始化
    private void initView()
    {
        intentFilter = new IntentFilter();
        intentFilter.addAction("com.doshr.finish");
        registerReceiver(myBroadCastReserver, intentFilter);
    }

    private final class MyBroadCastReserver extends BroadcastReceiver
    {
        @Override
        public void onReceive(Context context, Intent intent)
        {
            String action = intent.getAction();
            if (action.equals("com.doshr.finish"))
            {
                finish();
            }
        }
    }


    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(myBroadCastReserver);
    }
}
