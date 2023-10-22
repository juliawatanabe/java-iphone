import com.iphone.model.Smarthphone;
import com.iphone.service.AparelhoTelefonico;
import com.iphone.service.NavegadorInternet;
import com.iphone.service.ReprodutorMusical;

public class Iphone{
    public static void main(String[] args) {
        Smarthphone iphone = new Smarthphone();

        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;
        ReprodutorMusical reprodutorMusical = iphone;

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorInternet.adicionarNovaAba();
        navegadorInternet.exibirPagina();
        navegadorInternet.atualizarPagina();

        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
    }

}
