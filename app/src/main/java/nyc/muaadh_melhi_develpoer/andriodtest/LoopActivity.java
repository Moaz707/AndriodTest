package nyc.muaadh_melhi_develpoer.andriodtest;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;


public class LoopActivity extends AppCompatActivity {
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);
        textView = (TextView) findViewById(R.id.output);

        MyThread myThread = new MyThread();
        myThread.execute(0);
    }


  private  class MyThread extends AsyncTask<Integer, Integer, Integer> {
        private int counter = 0;

        @Override
        protected void onPreExecute() {
            textView.setText(" start looping .....");
        }

        @Override
        protected Integer doInBackground(Integer... value) {

            for (int i = value[0]; i <= 100000; i++) {

                publishProgress(counter++);

            }


            return counter;
        }

        @Override
        protected void onProgressUpdate(Integer... progress) {
            textView.setText("Loops completed: "+progress[0]);
        }


        @Override
        protected void onPostExecute(Integer result) {
            textView.setText("Loops completed: "+result);
            Intent intent = new Intent(LoopActivity.this, LoginActivity.class);
            startActivity(intent);
        }


    }
}