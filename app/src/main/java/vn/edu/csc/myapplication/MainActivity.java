package vn.edu.csc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    int pos=-1;
    ArrayList<Integer> arrayList;
    ArrayList<String> arrContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView2);
        arrayList =new ArrayList<>();
        arrayList.add(R.drawable.a01);
        arrayList.add(R.drawable.a02);
        arrayList.add(R.drawable.a03);
        arrayList.add(R.drawable.a04);
        arrayList.add(R.drawable.a05);
        arrayList.add(R.drawable.a06);
        arrayList.add(R.drawable.a07);
        arrayList.add(R.drawable.a08);
        arrayList.add(R.drawable.a09);
        arrayList.add(R.drawable.a10);
        arrayList.add(R.drawable.a11);


    }

    public void onclick(View view) {
        switch (view.getId()){
            case R.id.button4:
                pos++;
                if(pos>10) pos=0;
                img.setImageResource(arrayList.get(pos));
                break;

            case R.id.button3:
                pos--;
                if(pos<0) pos=10;
                img.setImageResource(arrayList.get(pos));
                break;

        }
    }
}
