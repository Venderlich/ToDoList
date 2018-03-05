package com.example.tristan.todoliste;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Tristan on 05/03/2018.
 */

public class OnClickListenerCreateTask implements View.OnClickListener {
@Override
public void onClick(View view) {
        Context context = view.getRootView().getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View formElementsView = inflater.inflate(R.layout.task_input_form, null, false);
        final EditText editTextTaskTitle = (EditText) formElementsView.findViewById(R.id.editTextTaskTitle);
        final EditText editTextTaskContent = (EditText) formElementsView.findViewById(R.id.editTextTaskContent);
        new AlertDialog.Builder(context)
            .setView(formElementsView)
            .setTitle("Crée une tache")
            .setPositiveButton("Ajouter",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
//                            String taskTitle = editTextTaskTitle.getText().toString();
//                            String taskContent = editTextTaskContent.getText().toString();
//                            ObjectTask objectTask = new ObjectTask();
//                            objectTask.setTitre(taskTitle);
//                            objectTask.setTitre(taskContent);
//                            boolean createSuccessful = new TableControllerTask(context).create(objectTask);
//                            if(createSuccessful){
//                                Toast.makeText(context, "Student information was saved.", Toast.LENGTH_SHORT).show();
//                            }else{
//                                Toast.makeText(context, "Unable to save student information.", Toast.LENGTH_SHORT).show();
//                            }
//                            dialog.cancel();
                        }

                    }).show();
}
}
