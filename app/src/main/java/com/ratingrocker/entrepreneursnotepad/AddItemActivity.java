package com.ratingrocker.entrepreneursnotepad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TabHost;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.ratingrocker.entrepreneursnotepad.dbObjects.Problem;
import com.ratingrocker.entrepreneursnotepad.dbObjects.Solution;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddItemActivity extends AppCompatActivity {
    TabHost tabHost;
    private DatabaseReference mDatabase;
    private List<EditText> probleminputs , solutioninputs;
    private List<Spinner> spinnerinputs;
    private MultiSelectionSpinner tagspinner;
    private List<Integer> spinnervals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addnote_layout);
        TabHost host = (TabHost)findViewById(R.id.tabhost);
        host.setup();
        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Problem");
        host.addTab(spec);
        //Tab 2
        spec = host.newTabSpec("Tab Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Solution");
        host.addTab(spec);
        //Tab 3
        spec = host.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Project");
        host.addTab(spec);
        spinnervals = Arrays.asList(6,6,6,6);
        probleminputs = Arrays.asList((EditText)findViewById(R.id.problemtitle),(EditText)findViewById(R.id.problemfactorsprevsolninput),
                (EditText)findViewById(R.id.problemdescription),(EditText)findViewById(R.id.problemmarketinput));
        spinnerinputs = Arrays.asList((Spinner) findViewById(R.id.problemdifficultyspinner),
                (Spinner) findViewById(R.id.problemurgencyspinner),(Spinner) findViewById(R.id.Solutiondifficultyspinner),(Spinner) findViewById(R.id.Solutionimportancespinner));
        solutioninputs = Arrays.asList((EditText)findViewById(R.id.Solutiontitle),(EditText)findViewById(R.id.Solutiondescription),
                (EditText)findViewById(R.id.Solutionweaknessinput),(EditText)findViewById(R.id.Solutionresourcesinput));
        tagspinner = (MultiSelectionSpinner) findViewById(R.id.problemtagspinner) ;
        loadSpinners();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        for (int h=0; h<spinnerinputs.size();h++) {
            final int y = h;
            spinnerinputs.get(h).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long arg3) {
                    spinnervals.set(y, spinnerinputs.get(y).getSelectedItemPosition());
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    spinnervals.set(y, 6);
                }
            });
        }
    }

    private void writeNewProblem(View view) {
       // User user = new User(name, email);
        String key = mDatabase.child("problems").push().getKey();

        Problem problem = new Problem();

        problem.setTitle(String.valueOf(probleminputs.get(0).getText()));
        problem.setSolnPrevFacs(String.valueOf(probleminputs.get(1).getText()));
        problem.setBody(String.valueOf(probleminputs.get(2).getText()));
        problem.setMarketdescription(String.valueOf(probleminputs.get(3).getText()));
        problem.setDifficulty(spinnervals.get(0));
        problem.setUrgency(spinnervals.get(1));
        problem.setTags(tagspinner.getSelectedItemsAsString());

        mDatabase.child("users").child("XhTakILQaINCH3dhR6WwoaROm3Z2").child("problems").setValue(problem);
    }
    private void writeNewSolution(View view) {
        // User user = new User(name, email);
        String key = mDatabase.child("solutions").push().getKey();

        Solution solution = new Solution();

       solution.setTitle(String.valueOf(solutioninputs.get(0).getText()));
        solution.setBody(String.valueOf(solutioninputs.get(1).getText()));
        solution.setPtsofweakness(String.valueOf(solutioninputs.get(2).getText()));
        solution.setResources(String.valueOf(solutioninputs.get(3).getText()));
        solution.setDifficulty(spinnervals.get(1));
        solution.setUrgency(spinnervals.get(2));
        solution.setTags(tagspinner.getSelectedItemsAsString());

        mDatabase.child("users").child("XhTakILQaINCH3dhR6WwoaROm3Z2").child("solutions").setValue(solution);
    }
    public void onAddProblemClicked(View view){
        writeNewProblem(view);
    }
    public void onAddSolutionClicked(View view){
        writeNewSolution(view);
    }
    private void loadSpinners() {

        List<String> difficulty = Arrays.asList("1-easy", "2 sorta hard", "3 hard", "4 very hard", "5- near impossible");
        List<String> urgency = Arrays.asList("1-little risk", "2-sooner rather than later", "3 probably act soon", "4 now", "5-NOWWWW");
        List<String> tags = Arrays.asList("App", "Web-based", "Consumer-focused", "Buisness-faced", "idk");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, difficulty);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, urgency);

        spinnerinputs.get(0).setAdapter(dataAdapter);
        spinnerinputs.get(1).setAdapter(dataAdapter2);
        spinnerinputs.get(2).setAdapter(dataAdapter);
        spinnerinputs.get(2).setAdapter(dataAdapter);
        tagspinner.setItems(tags);
    }
}