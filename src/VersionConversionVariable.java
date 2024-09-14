public class VersionConversionVariable {
    /*
    Écrivez une méthode appelée sumFirstAndLastDigit avec un paramètre de type int appelé number.

La méthode doit trouver le premier et le dernier chiffre du paramètre number passé à la méthode, en utilisant une boucle, et retourner la somme du premier et du dernier chiffre de ce nombre.

Si le nombre est négatif, la méthode doit retourner -1 pour indiquer une valeur invalide.

Exemple d’entrées et de sorties :

	•	sumFirstAndLastDigit(252); → devrait retourner 4, car le premier chiffre est 2 et le dernier est 2, ce qui donne 2+2, et la somme est 4.
	•	sumFirstAndLastDigit(257); → devrait retourner 9, car le premier chiffre est 2 et le dernier est 7, ce qui donne 2+7, et la somme est 9.
	•	sumFirstAndLastDigit(0); → devrait retourner 0, car le premier et le dernier chiffre est 0 (il n’y a qu’un seul chiffre), ce qui donne 0+0, et la somme est 0.
	•	sumFirstAndLastDigit(5); → devrait retourner 10, car le premier et le dernier chiffre est 5 (il n’y a qu’un seul chiffre), ce qui donne 5+5, et la somme est 10.
	•	sumFirstAndLastDigit(-10); → devrait retourner -1, car le paramètre est négatif et doit être positif.

REMARQUE : La méthode sumFirstAndLastDigit doit être définie comme public static, comme nous l’avons fait jusqu’à présent dans le cours.
REMARQUE : N’ajoutez pas de méthode main dans le code de la solution.
     */
    public  static int sumFirstAndLastDigit(int nombre){
        if (nombre < 0){
            return -1;
        }
        //extraire le dernier chiffre
        int dernierChiffre = nombre % 10;
        //transformer le nombre en string
        String nombreCopie = String.valueOf(nombre);
        //premier le premier index du nombre transformer en string dans une variavle caractère
        char premierChiffrecopie1 = nombreCopie.charAt(0);
        //transformer le caractère en int
        int premierChiffre = premierChiffrecopie1 - '0';
        //retourner la somme
        return premierChiffre + dernierChiffre;

    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-27849));
        System.out.println(sumFirstAndLastDigit(2552));
        System.out.println(sumFirstAndLastDigit(-1234));
    }
}
