package com.iphone.model;

import com.iphone.service.AparelhoTelefonico;
import com.iphone.service.NavegadorInternet;
import com.iphone.service.ReprodutorMusical;

public class Smarthphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Pausando a música...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador...");
    }

    @Override
    public void ligar() {
        System.out.println("Chamando número...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Gravando correio de voz...");
    }
    
}
