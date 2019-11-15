package com.example.useshapeexample;
//形狀顏色程式碼去drawable看
//尤其可參考rextangle跟oval
//用shape改變元件形狀,在drawable右鍵New Drawbale resource file
//xml第2行的selector改shape
//(參考指定形狀類型)複製: android:shape=" 形狀四選一">
//(參考指定形狀的填充色)
//間距 圓角 描邊
//步驟:background套用形狀
//到res/style/(13)套用(ring)xml
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
