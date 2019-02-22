# Le TP introductif

Si vous avez des problèmes ou des questions

* concernant ce TP le soumette ici [J'ai un Problème](https://github.com/ISSAE/nfp121.tp0/issues/new) avec un label soit "help wanted" ou "question"
* Concernant le cours NFP121 en général dans la [classroom](http://classroom.isae.edu.lb)

## <a id="prerequis">[Verifier/installer les pré-requis](travail#prerequis)

1. Installer git for windows et bluej (c'était un de voir dans http://classroom.isae.edu.lb) voici le lien [vers le texte du devoir](https://classroom.google.com/u/0/c/MjA3MDIxODgyODZa/a/MzA2MjYwNzQxNzBa/details)
2. Créer votre compte github avec comme email de référence le votre dans @isae.edu.lb. (c'était un de voir dans http://classroom.isae.edu.lb) voici le lien [vers le texte du devoir](https://classroom.google.com/u/0/c/MjA3MDIxODgyODZa/a/MzA3MTIxMTUyNjVa/details)
3. Inscrivez vous à la JNEWS (c'était un de voir dans http://classroom.isae.edu.lb) voici le lien [vers le texte du devoir](https://classroom.google.com/u/0/c/MjA3MDIxODgyODZa/a/MzA3MTIxMTUzMDBa/details)


## <a id="example">[rejoindre la classroom](http://classroom.isae.edu.lb)

_En principe ceci doit être déjà fait!_

Vous avez été invité par votre enseignants, si ce n'est pas le cas remplir [J'ai un Problème](https://github.com/ISSAE/nfp121.tp0/issues/new) avec un label soit "help wanted" ou "question". Si vous n'avez toujours pas votre compte @isae.edu.lb envoyé un email à webmaster@isae.edu.lb

## <a id="quoi">[Le travail demandé](travail#quoi)

### <a id="organisation">[Créer une organisation dans github pour le cours NFP121](travail#organisation)

Créer une organisation dans github avec votre compte github nommer la **nfp121-VOTRECENTRE-VOTREIDCNAM** exemple nfp121-tri-1000t

bey pour Beyrouth
tri pour tripoli
nib pour Nahr Ibrahim
bik pour Bikfaya
bal pour Baalbek

voici une vidéo explicative

<iframe width="560" height="315" src="https://www.youtube.com/embed/oLB7M0JHi9k" frameborder="1" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

### <a id="fork">[Faire un fork dans votre propre organisation](travail#fork)

Faire un fork de ISSAE/nfp121.tp0 dans votre organisation nouvellement créée.

<iframe width="560" height="315" src="https://www.youtube.com/embed/3LDVsmFGEEQ" frameborder="1" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

### <a id="clone">[Cloner en local votre fork](travail#clone)

#### Préparer git en local

Pour une première utilisation: définir les 2 variables d'initialisations nécessaire pour git `

 ```bash
git config --global user.name "Nom prenom"
git config --global user.email <votreemail>@isae.edu.lb 
# exemple
nfp121@DomicileTerra:~$ git config --global user.name "Etudiant NFP121"
nfp121@DomicileTerra:~$ git config --global user.email nfp121.a@isae.edu.lb
nfp121@DomicileTerra:~$
```

Générer la clé publique/clé privé ssh
```bash
nfp121@DomicileTerra:~$ ssh-keygen
Generating public/private rsa key pair.
Enter file in which to save the key (/home/nfp121/.ssh/id_rsa):
Created directory '/home/nfp121/.ssh'.
Enter passphrase (empty for no passphrase):
Enter same passphrase again:
Your identification has been saved in /home/nfp121/.ssh/id_rsa.
Your public key has been saved in /home/nfp121/.ssh/id_rsa.pub.
The key fingerprint is:
SHA256:EKD+JU2pReKnxBg5l6KqKoFtvW77QuGCJS1Kn+nj7/4 nfp121@DomicileTerra
The key's randomart image is:
+---[RSA 2048]----+
|  ..ooo          |
|  +*oo o         |
| oo++ *          |
|+oo..B .         |
|=*oo*.o S        |
|* +=+o           |
|.o.o..           |
|o  o+            |
|+ .+BBoE         |
+----[SHA256]-----+
nfp121@DomicileTerra:~$
```
voici les 2 clé générées

```bash
nfp121@DomicileTerra:~$ ls .ssh/
id_rsa  id_rsa.pub
nfp121@DomicileTerra:~$
```

**copier la clé publique et la déposé dans votre profile github**

Dans le terminal gitbash faire par exemple
```bash
$ clip < ~/.ssh/id_rsa.pub
```

ceci Copies le contenu du fichier id_rsa.pub dans le clipboard

##### Dans le coin supérieur droit de n'importe quelle page du site github.com, cliquez sur la photo de votre profil, puis sur Paramètres.

![Profil github](img/userbar-account-settings.png)

##### Dans la barre latérale des paramètres utilisateur, cliquez sur Clés SSH et GPG.

![side](img/settings-sidebar-ssh-keys.png)
##### Cliquez sur Nouvelle clé SSH ou Ajouter une clé SSH.
![side](img/ssh-add-ssh-key.png)
##### puis finalement paste dans la zone key
![side](img/ssh-key-paste.png)

#### Maintenant faire clone

git clone <url de votre dépot que vous avez forké plus haut>

voir cette petite vidéo explicative
<iframe width="560" height="315" src="https://www.youtube.com/embed/HSvQAsBdKnc" frameborder="1" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>




### <a id="jnews">[Pour ce TP introductif pas de soumission a JNEWS](travail#jnews)

### <a id="push">[Faire push dans votre fork](travail#push)

### <a id="avertir">[Avertir l'enseignant dans la classroom de la fin du travail](travail#avertir)

### <a id="pullrequest">[optionnellement faire un pull request](travail#pullrequest)