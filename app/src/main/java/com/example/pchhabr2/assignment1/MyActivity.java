package com.example.pchhabr2.assignment1;

import android.app.ActionBar;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        float values[] = {2.9f,5.6f,34f,81f,8.5f,89f,54f,2.3f,67.4f,45.56f,90.34f,22.22f,21.45f};
        final float values2[] = {0f,0f};
        String title = "Graph";
        String[] horlabels = {"1.0","2.0","3.0"};
        String[] verlabels = {"1.0","2.0","3.0"};
        final GraphView graph = new GraphView(this, values, "GraphViewDemo",horlabels, verlabels, GraphView.LINE);
        Button Run = (Button)findViewById(R.id.run);
        Button Clear = (Button)findViewById(R.id.clear);
        Run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                addContentView(graph,new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT));
            }
        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                graph.setValues(values2);
                addContentView(graph, new ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
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
    /*public double randomGenerator(){
        double leftLimit = 1D;
        double rightLimit = 10D;
        double generatedDouble = leftLimit + new Random().nextDouble() * (rightLimit - leftLimit);
        return generatedDouble;
    }

    public void plotGraph(){
        float values[] = {2.9f,5.6f,34f,81f,8.5f,89f,54f,2.3f,67.4f,45.56f,90.34f,22.22f,21.45f};
        String title = "Graph";
        String[] horlabels = {"1.0","2.0","3.0"};
        String[] verlabels = {"1.0","2.0","3.0"};
        GraphView graph = new GraphView(this, values, "GraphViewDemo",horlabels, verlabels, GraphView.LINE);

        setContentView(graph);
    }*/


}
