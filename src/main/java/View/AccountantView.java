package View;

import Data.StaffDAO;
import Data.WorkDoneDAO;
import Model.Staff;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class AccountantView {
    public static void main(String[] args) {

    }
    protected List<Staff> getAllStaff() throws SQLException {
        return StaffList;
    }

    protected updateStaff()

    }


    //Si ond oit ajouter une donnée, c'est à partir du staff ou projet (recherche par id)
    //heures de travail doivent toujours être positives
    //dates dans la table ne doivent jamais commencer avant la date de départ du projet
    //données WorkDone montrent les heures prestées du personnel pour un projet déterminé
    //la table WorkDone n'a pas de clef première, mais 2 clefs étrangères(StaffId et ProjectId)->A implémenter dans l'application pas dans la base de données- voir validation ci-dessous)
    //Liste des projets récents avec leur rentabilité
    //calcul rentabilité =prix
    // /cumul des heures prestées des employés
    // /salaire horaire de chaque employé(22 jours de travail par mois, 40 heures de travail par semaine/
    // calcul du coût total du projet/
    // ->retirer le prix de ce projet

    //Selon tableWorkDone voir les 3 employés qui ont le plus travaillé sur un projet déterminé.
}
