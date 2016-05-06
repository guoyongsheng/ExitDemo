package xmen.doshr.com.exitdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by wesley on 2016/4/14.
 */
public class SecondActivity extends BaseActivity
{
    private Button textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView()
    {
        textView = (Button) findViewById(R.id.button);
        textView.setText("第二个界面");
    }


    public void click(View view)
    {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

}
