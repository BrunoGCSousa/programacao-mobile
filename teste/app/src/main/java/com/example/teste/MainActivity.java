package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextNumero;
    private EditText editTextCpf;
    private EditText editTextRg;
    private EditText editTextEndereco;
    private EditText editTextTelefone;
    private EditText editTextBairro;
    private EditText editTextcodigo;

    private Button buttonEnviar;

    private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText editTextNome = findViewById(R.id.edt_nome);
        EditText editTextTelefone = findViewById(R.id.edt_tel);
        EditText editTextCpf = findViewById(R.id.edt_cpf);
        EditText editTextRg = findViewById(R.id.edt_rg);
        EditText editTextEndereco = findViewById(R.id.edt_endereco);
        EditText editTextBairro = findViewById(R.id.edt_bairro);
        EditText editTextcodigo = findViewById(R.id.txtCodigo);
        EditText editTextNumero = findViewById(R.id.edt_numero);
        Button buttonEnviar = findViewById(R.id.btnSalvar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                String telefone = editTextTelefone.getText().toString();
                String cpf = editTextCpf.getText().toString();
                String rg = editTextRg.getText().toString();
                String endereco = editTextEndereco.getText().toString();
                String bairro = editTextBairro.getText().toString();
                String numero = editTextNumero.getText().toString();
                String codigo = editTextcodigo.getText().toString();

                minhaReferencia.child("cadastros").child(codigo).child("Nome").setValue(nome);
                minhaReferencia.child("cadastros").child(codigo).child("Telefone").setValue(telefone);
                minhaReferencia.child("cadastros").child(codigo).child("CPF").setValue(cpf);
                minhaReferencia.child("cadastros").child(codigo).child("RG").setValue(rg);
                minhaReferencia.child("cadastros").child(codigo).child("Endereço").setValue(endereco);
                minhaReferencia.child("cadastros").child(codigo).child("Número").setValue(numero);
                minhaReferencia.child("cadastros").child(codigo).child("Bairro").setValue(bairro);



            }
        });
    }
}