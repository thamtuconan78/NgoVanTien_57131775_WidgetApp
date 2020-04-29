package vn.edu.ntu.ngovantien.ngovantien_57131775_widgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    RadioGroup rdgGioitinh;
    RadioButton rdb1,rdb2;
    EditText edt1,edt2,edt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvent();
    }
    private void addViews(){
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        edt3=findViewById(R.id.edt3);
        rdgGioitinh=findViewById(R.id.rdgGioitinh);
        btn1=findViewById(R.id.btn1);
        rdb1=findViewById(R.id.rdbNam);
        rdb2=findViewById(R.id.rdbNu);

    }
    private void addEvent(){

    }
}
