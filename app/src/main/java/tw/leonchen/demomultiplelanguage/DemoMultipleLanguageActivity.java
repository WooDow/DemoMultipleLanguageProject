package tw.leonchen.demomultiplelanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DemoMultipleLanguageActivity extends AppCompatActivity {

    private Button btn_submit;
    private TextView tv_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_multiple_language);

        tv_msg = (TextView)findViewById(R.id.tv_msg);
        btn_submit = (Button)findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_msg.setText(R.string.message);
            }
        });
    }
}
