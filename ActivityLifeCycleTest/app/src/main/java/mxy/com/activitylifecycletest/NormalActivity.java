package mxy.com.activitylifecycletest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class NormalActivity extends AppCompatActivity {

    TextView tv = null;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
        tv = (TextView) findViewById(R.id.tvSex);
        RadioGroup group = (RadioGroup) findViewById( R.id.radioGroup);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int radioButtonId = group.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(radioButtonId);
                tv.setText("您的性别是："+ rb.getText());
            }
        });

        CheckBox cb = (CheckBox) findViewById(R.id.cb);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(NormalActivity.this, isChecked ? "已婚选中":"已婚未选中", Toast.LENGTH_SHORT).show();
            }
        });

        CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(NormalActivity.this, isChecked ? "有孩子选中":"有孩子未选中", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClickButton(View view){
        Toast.makeText(this, "已提交", Toast.LENGTH_SHORT).show();
    }
}
