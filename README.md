# TP4A_Wychovaniak_Arrighi_TETRIS

Alexis Wychovaniak & Paul Antoine Arrighi

Projet d'architecture logiciel ESIEA 4A

#FEATURES:

Gestion des scores

Sauvegarde d'un block que l'on souhaite utiliser plus tard

Controle du jeu à la souris OU au clavier

Envoie de ligne au cours du jeu

#COMMENT JOUER:

Ce deplacer :          Fleche G D B    OU Bouger la souris/Molette pour descendre le block

Rotation:              Espace           OU Clic souris

Sauvegarde d'un block: ENTREE

#EXERCICE ARCHITECTURE

Nous avons décidé de decouper notre tetris en prenant en compte l'importance de chaques fonctions.
Nous avons étudié les relations entre les differents elements du tetris pour decouper celui ci.
Ce qui nous a permis d'avoir un decoupage tel qu'il suit:
Les interactions. Mouvement/gestion des cellules/Terrain de jeu
Le deroulement du jeu
Les pieces du jeu
Les listeners
La gestion des scores

Nous avons choisis d'operer de cette maniere pour pouvoir travailler sur des classes de maniere independante
Nous partageant ainsi le travail pour avancer plus efficacement

#EXERCICE SOLID/DESIGN PATTERN
Listener : Permet à un objet de notifier des évènements (changement d'état, actions utilisateurs, détection d’événements, etc…)
Nous avons utilisé les listeners pour la gestion des événements clavier et souris assurant le deroulement du jeu

-	S: Single Responsibility Principle 
-	O: Open / Closed Principle 
-	L: Liskov Substitution Principle 
-	I: Interface Segregation Principle 
-	D: Dependency Inversion Principle

La classe tetrimonios model gere nos differentes pieces. 

Utiliser ce design pattern nous a permis une gestion de notre jeu par l'attente d'une action. 
Nous l'avons mis en place dans notre fonction de gestion des deplacements, avec pour une touche à ecouter une action definis




