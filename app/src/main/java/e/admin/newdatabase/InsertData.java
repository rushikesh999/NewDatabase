package e.admin.newdatabase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class InsertData extends AppCompatActivity {
    EditText e_roll,e_name,e_marks;
    String rollNo,name,marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
        e_roll = findViewById(R.id.roll);
        e_name = findViewById(R.id.name);
        e_marks = findViewById(R.id.marks);
    }

    public void request(View view) {
        rollNo = e_roll.getText().toString();
        name = e_name.getText().toString();
        marks = e_marks.getText().toString();
        //  Toast.makeText(this, "Name"+name,"Email"+email+ "Contact"+contact+ "Password"+password Toast.LENGTH_SHORT).show();
        String method = "register";
        InsertDataBackgroundTask backgroundTask = new InsertDataBackgroundTask(this);
        backgroundTask.execute(method, rollNo,name, marks);
        finish();
    }
}
