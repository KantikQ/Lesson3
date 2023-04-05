package ru.mirea.zhurin.d.r.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InputActivity extends AppCompatActivity {

    private EditText bookNameEditText;
    private Button sendBookNameButton;
    private TextView textview_book_developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);



        bookNameEditText = findViewById(R.id.book_name_edit_text);
        sendBookNameButton = findViewById(R.id.send_book_name_button);
        textview_book_developer = findViewById(R.id.textview_book_developer);

        sendBookNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bookName = bookNameEditText.getText().toString();
                textview_book_developer.setText("Любимая книга разработчика – " + bookName);
                Intent intent = new Intent();
                intent.putExtra("bookName", bookName);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}