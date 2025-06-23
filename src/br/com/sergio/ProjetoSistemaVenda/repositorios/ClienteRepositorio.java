package br.com.sergio.ProjetoSistemaVenda.repositorios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ClienteRepositorio {
    private static final Gson gzon = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    private static final Path ARQUIVO = Paths.get("data/clientes.json");

}
