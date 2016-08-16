package warrenhong.intronewyork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button downtown;
    Button centralPark;
    Button brooklyn;

    public void downtown() {
        downtown = (Button) findViewById(R.id.downtown);
        downtown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent now = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(now);
            }
        });
    }

    public void centralPark() {
        centralPark = (Button) findViewById(R.id.centralPark);
        centralPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent now = new Intent(MainActivity.this, centralPark.class);
                startActivity(now);
            }
        });
    }

    public void brooklyn() {
        brooklyn = (Button) findViewById(R.id.brooklyn);
        brooklyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent now = new Intent(MainActivity.this, brooklyn.class);
                startActivity(now);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        downtown();
        centralPark();
        brooklyn();
    }
}
