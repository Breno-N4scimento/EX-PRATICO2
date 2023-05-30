package socialmedias;

import Interfaces.Compartilhamento;
import Interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Escreveu um comentário no Facebook");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("Curtiu uma publicação no Facebook");
    }

    @Override
    public void fazStreming() {
        System.out.println("Realizou uma vídeo conferência no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicação no Facebook");
    }
}
