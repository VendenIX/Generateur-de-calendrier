javac -d build -cp lib/constraintstests.jar src/constraints/*.java

java -cp build:lib/constraintstests.jar constraints.Executable

public boolean isSatisfied(int date1, int date2){
        if (date1 + this.activitee1.getDuration() <= date2){
            return true;
        }
        else{
            return false;
        }
    }
    
git init ==> initialiser le dépot où l'on veut (cela créer un fichier filrouge)

git remote add OC https://gitlab.com/KSMX/filrouge.git

git clone https://gitlab.com/KSMX/filrouge.git

git pull OC master ==> recevoir les données dans notre branche master

git add fichier
git add . (tout)

git commit -m 'commentaire'

git push OC master







