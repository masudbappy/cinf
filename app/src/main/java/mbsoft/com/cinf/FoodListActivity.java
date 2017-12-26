package mbsoft.com.cinf;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import mbsoft.com.cinf.utils.Toaster;

public class FoodListActivity extends AppCompatActivity {

    private int clickedId;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.tv = (TextView) findViewById(R.id.tv);

        this.clickedId = getIntent().getIntExtra("clickedItem", R.id.inc1);
        this.populateDate(this.clickedId);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void populateDate(int clickedId) {
        switch (clickedId){
                case R.id.inc1:
                    this.tv.setText("cat 1 clicked");
                    break;
                case R.id.inc2:
                    this.tv.setText("cat 2 clicked");
                    break;
                case R.id.inc3:
                    this.tv.setText("cat 3 clicked");
                    break;
                case R.id.inc4:
                    this.tv.setText("cat 4 clicked");
                    break;
                case R.id.inc5:
                    this.tv.setText("cat 5 clicked");
                    break;
                case R.id.inc6:
                    this.tv.setText("cat 6 clicked");
                    break;
                case R.id.inc7:
                    this.tv.setText("cat 7 clicked");
                    break;
                case R.id.inc8:
                    this.tv.setText("cat 8 clicked");
                    break;
                default:
                    break;
        }
    }

}
