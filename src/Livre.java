public class Livre {

    private String titre;
        private String auteur;
        private double prix;

        // Propriétés pour les attributs
        public String getTitre() {
            return titre;
        }
        public void setTitre(String titre) {
            this.titre = titre;
        }
        public String getAuteur() {
            return auteur;
        }
        public void setAuteur(String auteur) {
            this.auteur = auteur;
        }
        public double getPrix() {
            return prix;
        }
        public void setPrix(double prix) {
            this.prix = prix;
        }

        // Constructeur
        public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    // Méthode Afficher()
    public void Afficher() {
        System.out.print("Titre : " + titre);
        System.out.print(" Auteur : " + auteur);
        System.out.print(" Prix : " + prix);
    }

}
