package sg.edu.rp.c346.id20009530.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textViewTranslatedText;
    TextView textViewTranslatedText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTranslatedText = findViewById(R.id.textViewTranslatedText);
        textViewTranslatedText2 = findViewById(R.id.textViewTranslatedText2);

        registerForContextMenu(textViewTranslatedText);
        registerForContextMenu(textViewTranslatedText2);


    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            textViewTranslatedText.setText("Hello");
            textViewTranslatedText2.setText("Bye");
            return true;
        } else if (id == R.id.italianSelection) {
            textViewTranslatedText.setText("Ciao");
            textViewTranslatedText2.setText("Addios");
            return true;
        } else {
            textViewTranslatedText.setText("Error translation");
            textViewTranslatedText2.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);

    }



}