public class VersionWhile {
    public static int additionPremierDernierNombre(int nombre){
        //gerer le cas des nombre négatif
        if (nombre < 0){
            return -1;
        }
        int dernierChiffre = nombre % 10;
        //diviser le nombre par 10 jusqu'a ce qu'il reste que le premier chiffre
        while (nombre >= 10){
            nombre /= 10;
        }
        //mettre le premier chiffre restant après la boucle dans une variable
        int premierChiffre = nombre;
        //retourner la somme
        return premierChiffre + dernierChiffre;
    }

    public static void main(String[] args) {
        System.out.println(additionPremierDernierNombre(2552));
        System.out.println(additionPremierDernierNombre(-1234));
        System.out.println(additionPremierDernierNombre(-27849));

    }
}
