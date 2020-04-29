package vn.edu.ntu.ngovantien.ngovantien_57131775_widgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    RadioGroup rdgGioitinh;
    RadioButton rdb1,rdb2;
    EditText edt1,edt2,edt3;
    CheckBox cb1,cb2,cb3,cb4,cb5;
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
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        cb5=findViewById(R.id.cb5);
    }
    private void addEvent(){
     btn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             int i =rdgGioitinh.getCheckedRadioButtonId();
             RadioButton rdg = rdgGioitinh.findViewById(i);
             final String name = edt1.getText().toString();
             final String datetime= edt2.getText().toString();
             String check1 = "";
             String check2 = "";
             String check3 = "";
             String check4 = "";
             String check5 = "";
             if(cb1.isChecked()) {
                   check1 = cb1.getText().toString();
             }
             if(cb2.isChecked()) {
                  check2 = cb2.getText().toString();
             }
             if(cb1.isChecked()) {
                 check3 = cb3.getText().toString();
             }
             if(cb1.isChecked()) {
                 check4 = cb4.getText().toString();
             }
             if(cb1.isChecked()) {
                  check5 = cb5.getText().toString();
             }
             String sothichkhac = edt3.getText().toString();
             Toast.makeText(MainActivity.this, name +"\n" +"ngay sinh" + datetime + "Giới tính " + rdg.getText().toString() +"\n"+check1+"\n"+check2+"\n"+check3+"\n"+check4+"\n"+check5+"\n"+sothichkhac, Toast.LENGTH_SHORT).show();
         }
     });
    }
}
