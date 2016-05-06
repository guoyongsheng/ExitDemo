package xmen.doshr.com.exitdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by wesley on 2016/4/14.
 */
public class ThirdActivity extends BaseActivity
{
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews()
    {
        button = (Button) findViewById(R.id.button);
        button.setText("退出");
    }

    public void click(View view)
    {
       // Intent intent = new Intent();
        //intent.setAction("com.doshr.finish");
       // sendBroadcast(intent);


        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
