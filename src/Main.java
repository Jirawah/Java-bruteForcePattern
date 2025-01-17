public class Main {
    public static void main(String[] args) {
        String[] bibliotheque = {
                "Le Choc des civilisations",
                "La géopolitique, ça sert à quoi ?",
                "Le Destin de l'Empire : Histoire et géopolitique de l'Empire américain",
                "L’Art de la guerre",
                "La Guerre de 30 ans : La géopolitique du Moyen-Orient",
                "La géopolitique de la Russie", "L’Empire du chaos",
                "La géopolitique de la mer", "La Route de la soie : Une histoire du monde",
                "Les géopolitiques de l’énergie"
        };

        String titreRecherche = "L’Art de la guerre";
        livreTrouverParForceBrute(titreRecherche, bibliotheque);
    }

    public static void livreTrouverParForceBrute (String titreRecherche, String[] bibliotheque){
        int livresNombre  = bibliotheque.length;
        int compteur = 0;
        String titreCourant = "";

        while (compteur != livresNombre) {
            titreCourant = bibliotheque[compteur];

            if (titreCourant.equals(titreRecherche)){
                System.out.println("Le livre a été trouvé");
                return;
            }
            compteur ++;
        }
        System.out.println("le livre n'a pas été trouvé");
    }
}