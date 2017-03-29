package mxy.com.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        StaggeredGridLayoutManager layoutManger = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);

        //LinearLayoutManager layoutManger = new LinearLayoutManager(this);
        //layoutManger.setOrientation(LinearLayoutManager.HORIZONTAL);

        recyclerView.setLayoutManager(layoutManger);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }


    private String getRandomLengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++){
            builder.append(name);
        }

        return builder.toString();
    }
    private void initFruits() {

        for(int i = 0; i < 20; i++){
            Fruit apple = new Fruit(getRandomLengthName("apple"), R.mipmap.ic_launcher);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("banana"), R.mipmap.ic_launcher);
            fruitList.add(banana);
            Fruit pear = new Fruit(getRandomLengthName("pear"), R.mipmap.ic_launcher);
            fruitList.add(pear);
            Fruit orange = new Fruit(getRandomLengthName("orange"), R.mipmap.ic_launcher);
            fruitList.add(orange);
        }
    }
}
