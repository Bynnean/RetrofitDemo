package retrofit.android.bynnean.bynnean_retrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import retrofit.android.bynnean.builder.BaseApi;
import retrofit.android.bynnean.bynnean_retrofit.convert.Gson2ConvertFactory;
import retrofit.android.bynnean.bynnean_retrofit.convert.StringConvertFactor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.string_convert).setOnClickListener(new View.OnClickListener() {
            /**
             * @param v
             */
            @Override
            public void onClick(View v) {
                new BaseApi().initRetrofitBuilder().addConverterFactory(new StringConvertFactor());
                startActivity(new Intent(MainActivity.this,VideoListActivity.class));
            }
        });

        findViewById(R.id.gson_convert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new BaseApi().initRetrofitBuilder().addConverterFactory(new Gson2ConvertFactory());
                startActivity(new Intent(MainActivity.this,VideoGsonListActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
