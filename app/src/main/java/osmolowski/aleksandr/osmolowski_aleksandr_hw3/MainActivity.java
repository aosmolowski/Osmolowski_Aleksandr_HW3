package osmolowski.aleksandr.osmolowski_aleksandr_hw3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnCall = (ImageButton) findViewById(R.id.btnCallId);
        ImageButton btnSMS = (ImageButton) findViewById(R.id.btnSMSId);
        Button btnApp = (Button) findViewById(R.id.btnAppId);

        btnCall.setOnClickListener(this);
        btnSMS.setOnClickListener(this);
        btnApp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCallId:
                runCallBtn();
                break;
            case R.id.btnAppId:
                runAppBtn();
                break;
            case R.id.btnSMSId:
                runSMSBtn();
                break;
        }
    }

    private void runCallBtn() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }

    private void runAppBtn() {
        Intent intent = new Intent(this, EmptyActivity.class);
        startActivity(intent);
    }

    private void runSMSBtn() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        startActivity(intent);
    }
}
