package com.example.usuario.contactos;



import android.app.ActionBar;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import static com.example.usuario.contactos.R.id.lista;

public class ListarContacto extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {
    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
    /*setContentView(R.layout.listView) {

    }

    ListView ListView;
    ArrayAdapter<String> adaptador;

    lista = (ListView)

    ListarContacto(R.id.ListarContacto) {

    }

    adaptador = new ArrayAdapter<String>(this,android.R.layout.ListView);

        lista.setAdapter(adaptador);*/
}