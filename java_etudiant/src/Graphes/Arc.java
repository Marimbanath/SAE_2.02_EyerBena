package Graphes;

import java.util.Objects;

/**
 * Classe Arc qui représente un arc portant un noeud
 */
public class Arc{
    /**
     * Nom du noeud de destination de l'arc
     */
    private String dest;

    /**
     * Cout de l'arc
     */
    private double cout;

    /**
     * Constructeur de la classe
     * @param dest nom du noeud de destination
     * @param cout cout de l'arc créé
     */
    public Arc(String dest, double cout) {
        this.dest = dest;
        if(cout > 0){
            this.cout = cout;
            // si le coût est négatif, celui-ci est rendu à sa valeur absolue
        }else this.cout = cout*-1;

    }

    /**
     * Redéfini pour ne pas avoir d'erreur de test
     * @param o objet
     * @return true si les deux objets comparés sont égaux
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Arc arc = (Arc) o;
        return Double.compare(arc.cout, cout) == 0 && Objects.equals(dest, arc.dest);
    }

    /**
     * Affiche de manière fluide un Arc
     * @return une chaîne de caractères qui représente
     * les caractéristiques de l'arc
     */
    public String toString(){
        return String.format("%s(%.0f)", this.dest, this.cout);
    }

    /**
     * Getter du noeud de destination
     * @return dest
     */
    public String getDest() {
        return dest;
    }

    /**
     * Getter du cout de l'arc
     * @return cout
     */
    public double getCout() {
        return cout;
    }
}