"""
Zakari IKHOU 
Akim SAADI
Mohamed TAKHCHI
Reda CHANAA
Sohaib EL MOUHTADI 
12/01/2020
"""

#! /usr/bin/python3
class ListeTriee:
    liste = []
    
    def __init__(self, listeTriee):
        self.liste = listeTriee
        
    def chercherElt(self, elt):
        debut = 0
        fin = len(self.liste)-1
        indice = (debut+fin)//2
        while debut <= fin :
            if self.liste[indice] == elt :
                if indice != 0 :
                    if self.liste[indice-1] == elt :
                        fin = indice -1
                    else :
                        return indice
            elif self.liste[indice] > elt :
                fin = indice-1
            else :
                debut = indice+1
            indice = (debut+fin)//2
        return -1

