package com.example.hussainsiddiqui.bggym.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.hussainsiddiqui.bggym.R;
import com.example.hussainsiddiqui.bggym.other.CustomListview;

public class GroupListActivity extends AppCompatActivity {

    ListView listView;
    Integer[] IMAGES = {R.drawable.biceps, R.drawable.fitness, R.drawable.general_training,
            R.drawable.weight_gain, R.drawable.thaiboxing, R.drawable.weight_loss};

    String[] NAMES = {"Body Building", "Fitness", "General Training", "Weight Gain", "Thaiboxing", "Weight Loss"};

    String[] DESCRIPTION = {"Display 1", "Display 2", "Display 3", "Display 4", "Display 5", "Display 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_list);

        ListView listView = findViewById(R.id.ListView);

        CustomListview custListview = new CustomListview(this, NAMES, DESCRIPTION, IMAGES);
        listView.setAdapter(custListview);

    }
}

