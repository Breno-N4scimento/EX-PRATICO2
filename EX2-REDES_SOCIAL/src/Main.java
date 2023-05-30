import socialmedias.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Facebook facebook = new Facebook();
        GooglePlus googlePlus = new GooglePlus();
        Twitter twitter = new Twitter();
        Instagram instagram = new Instagram();

        ArrayList<RedeSocial> arrayList = new ArrayList<>();

        arrayList.add(facebook);
        arrayList.add(twitter);

        Usuario u1 = new Usuario("Bruno","bruno@email.com", arrayList);
        try {
            u1.getRedeSociais().get(0).postarFoto();
            u1.getRedeSociais().get(1).curtirPublicacao();
            u1.getRedeSociais().get(0).postarComentario();
            u1.getRedeSociais().get(1).postarVideo();

            if (u1.getRedeSociais().get(0) instanceof Facebook) {
                Facebook facebook1 = (Facebook) u1.getRedeSociais().get(0);
                facebook1.fazStreming();
            }
            if (u1.getRedeSociais().get(1) instanceof Twitter) {
                Twitter twitter1 = (Twitter) u1.getRedeSociais().get(1);
                twitter1.compartilhar();
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: referência nula encontrada.");
        }
    }
}

