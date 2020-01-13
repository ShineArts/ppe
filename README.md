# ProjetKarimAndCo - composant : connexion et inscription

Afin de lancer le programme lancer appuyer sur le bouton profil pour s'y connecter.

Il se peux que des librairie manque il vous suffira de les ajouter elle se trouve dans le fichier java-lib

Document utilisateur : [cliquez-ici](https://docs.google.com/document/d/1nW1IItZ4RfnRoahEaQirap2QfmtTX6tPgkBLDmhopvI/edit?usp=sharing)

Le panneau qui contient le formulaire de connexion :  PanneauFormConnexion
Le panneau qui contient le formulaire d'inscription :  PanneauFormInscription

Pour se connecter à la base de données avec la classe BDD :
```java
// Initiliser la propriété dans la classe
private BDD connexionBDD = new BDD();
...
// Appel de la méthode connexionBDD
connexionBDD.ConnexionBDD();
```
