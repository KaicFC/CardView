package com.cursoandroid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.adapter.PostagemAdapter;
import com.cursoandroid.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Definir Layout para recyclerPostagem
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Preparação da postagem
        this.prepararPostagens();

        //Definir Adapter
        //Criar classe PostagemAdapter e a classe interna MyViewHolder
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Kaic Carvalho", "#TBT Férias", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("João Silva", "#lol Aproveitando a vida", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Maria Cecilia", "#Tchau, vida antiga", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Luna Fernandes", "#Só falta você", R.drawable.imagem4);
        this.postagens.add(p);

    }

}
